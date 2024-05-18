public class Main {
    public static void main(String[] args) {
        ProGameUser user = new ProGameUser();
        ProGameCom com = new ProGameCom();

        ProGame game = new ProGame(user, com);
        game.PlayGame();
    }
}
