public class GameResultSwitch {
    private GameSwitch gameswitch;

    public GameResultSwitch() {
        this.gameswitch = new GameSwitch();
    }

    public static String ResultSwitch(int gameSwitch) {
        switch (gameSwitch) {
            case 1:
                return "당신이 이겼습니다.";
            case 2:
                return "당신이 졌습니다.";
            case 3:
                return "비겼습니다.";
        }
        return "";
    }
}
