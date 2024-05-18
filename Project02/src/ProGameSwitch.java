public class ProGameSwitch {
    public static String Game(String userInput, String comRandom) {
        switch(userInput) {
            case "묵":
            case "바위":
                switch (comRandom) {
                    case "묵":
                    case "바위":
                        return "비겼습니다.";
                    case "찌":
                    case "가위":
                        return "이겼습니다.";

                    case "빠":
                    case "보":
                        return "졌습니다.";
                }
                break;

            case "찌":
            case "가위":
                switch (comRandom) {
                    case "묵":
                    case "바위":
                        return "졌습니다.";

                    case "찌":
                    case "가위":
                        return "비겼습니다.";

                    case "빠":
                    case "보":
                        return "이겼습니다.";
                }
                break;

            case "빠":
            case "보":
                switch (comRandom) {
                    case "묵":
                    case "바위":
                        return "이겼습니다.";

                    case "찌":
                    case "가위":
                        return "졌습니다.";

                    case "빠":
                    case "보":
                        return "비겼습니다.";
                }
                break;

            default:
                return "값이 이상합니다.";
        }
    return "";
    }
}
