public class ProGame {
    private ProGameUser proGameUser; // ProGameUser 클래스 참조
    private ProGameCom proGameCom;

    //생성자
    public ProGame(ProGameUser proGameUser, ProGameCom proGameCom) {
        this.proGameUser = proGameUser;
        this.proGameCom =  proGameCom;
    }
    //ProGameUser proGameUser와 다른 한개는 매개 변수

    public void PlayGame() {
        String userInput = proGameUser.UserInput();
        String comRandom = proGameCom.ComInput();

        ProGameResult gameResult = new ProGameResult(userInput, comRandom);
        gameResult.ProResult();
    }
}
