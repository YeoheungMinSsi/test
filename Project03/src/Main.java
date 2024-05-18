public class Main {
    public static void main(String[] args) {
        // 게임에 필요한 입력 및 게임 객체 생성
        GameUserInput gameUserInput = new GameUserInput();
        GameComInput gameComInput = new GameComInput();
        GameSwitch gameSwitch = new GameSwitch();
        GameResultSwitch resultSwitch = new GameResultSwitch();
        Game game = new Game(gameUserInput, gameComInput);
        GameWhile gameWhile = new GameWhile();

        // 게임 실행
        gameWhile.Scorewhile();
    }
}
