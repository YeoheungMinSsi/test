public class GameResult {
    private String playUserinput;
    private String playCominput;

    public GameResult(String playUserinput, String playCominput) {
        this.playUserinput = playUserinput;
        this.playCominput = playCominput;
    }

    public void Result(int gameSwitch) {
        int  result = GameSwitch.GameScore(playUserinput, playCominput);
        String result1 = GameResultSwitch.ResultSwitch(gameSwitch);
        System.out.printf("당신이 낸 것 : %s\n", playUserinput);
        System.out.printf("컴퓨터가 낸 것 : %s\n", playCominput);
        System.out.println("게임 결과 : " + result1);
    }
}
