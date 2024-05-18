public class Game {
    private GameUserInput gameUserInput;
    private GameComInput gameComInput;

    public Game(GameUserInput gameUserInput, GameComInput gameComInput) {
        this.gameUserInput = gameUserInput;
        this.gameComInput = gameComInput;
    }

    public void GamePlay() {
        String playUserInput = gameUserInput.GetUserInput();
        String playComInput = gameComInput.GetComInput();

        GameResult gameResult = new GameResult(playUserInput, playComInput);
        gameResult.Result(GameSwitch.GameScore(playUserInput, playComInput));
    }
}
