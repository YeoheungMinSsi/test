public class GameCount {
    private int[] count;
    private GameSwitch gameSwitch;

    public GameCount() {
        this.count = new int[2];
        this.gameSwitch = gameSwitch;
        }

    public void Score(String playUserInput, String playComInput) {
        int[] score = gameSwitch.GetScore();
        int result = gameSwitch.GameScore(playUserInput, playComInput);

        switch (result) {
            case 1:
                count[0] += 1;
                break;
            case 2:
                count[1] += 1;
                break;
            case 3:
                count[0] = 0;
                count[1] = 0;
                break;
        }
        if (count[0] == 3) {
            score[0] += 3;
            count[0] = 0;
        }
        else if (count[1] == 3) {
            score[1] += 3;
            count[1] = 0;
        }

    }
}
