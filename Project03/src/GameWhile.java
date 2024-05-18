public class GameWhile {
    private GameUserInput gameUserInput;
    private GameComInput gameComInput;
    private GameSwitch gameSwitch;
    private Game game;

    public GameWhile() {
        this.gameUserInput = new GameUserInput();
        this.gameComInput = new GameComInput();
        this.game = new Game(gameUserInput, gameComInput);
        this.gameSwitch = new GameSwitch();
    }

    public void Scorewhile() {
        int[] score = gameSwitch.GetScore();

        while(score[0] < 20 && score[1] < 20) {
            game.GamePlay();
            score = gameSwitch.GetScore();

            String playUserInput = gameUserInput.GetUserInput();
            String playComInput = gameComInput.GetComInput();

            gameSwitch.GameScore(playUserInput, playComInput);
        }
    }
}
