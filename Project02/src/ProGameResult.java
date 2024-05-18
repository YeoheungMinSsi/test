public class ProGameResult {
    private String userInput;
    private String comRandom;

    public ProGameResult(String userInput, String comRandom) {
        this.userInput = userInput;
        this.comRandom = comRandom;
    }

    public void ProResult() {
        String result = ProGameSwitch.Game(userInput, comRandom);
        System.out.printf("당신이 낸 값 : %s\n", userInput);
        System.out.printf("컴퓨터가 낸 값 : %s\n", comRandom);
        System.out.println("게임 결과 : " + result);
    }
}
