public class GameSwitch {
    private static int[] score;

    public GameSwitch() {this.score = new int[2];}

    public int[] GetScore() {return score;}

    public static int GameScore(String playUserInput, String playComInput) {
        switch(playUserInput) {
            // 이겼을 때 1, 졌을 때 2, 비겼을 때 3을 반환
            case "묵":
            case "바위":
                switch(playComInput) {
                    case "바위":
                        return 3; //비겼을 때;
                    case "가위":
                        score[0] += 1;
                        return 1; //내가 이겼을 때
                    case "보":
                        score[1] += 4;
                        return 2; // 내가 졌을 때
                }
                break;

            case "찌":
            case "가위":
                switch(playComInput) {
                    case "바위":
                        score[1] += 1;
                        return 2; //내가 졌을 때
                    case "가위":
                        return 3;
                    case "보":
                        score[0] += 2;
                        return 1; //내가 이겼을 때
                }
                break;

            case "빠":
            case "보":
                switch(playComInput) {
                    case "바위":
                        score[0] += 4;
                        return 1; //내가 이겼을 때
                    case "가위":
                        score[1] += 2;
                        return 2; // 내가 졌을 때
                    case "보":
                        return 3;
                }
                break;

            default:
                System.out.println("입력 값이 이상합니다. 다시 입력해 주세요");
                break;
        }
        return 0;

    }

}
