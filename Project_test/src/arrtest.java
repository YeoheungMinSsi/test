import java.util.Scanner;
// 사용자가 입력받을 수 있게 도와주는 클래스 Scanner
import java.util.Random;
// 램덤하게 출력되도록 도와주는 클래스 Random

public class arrtest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        String game = "0";
        String[] com_game = {"바위", "가위", "보"};
        int[] score = new int[2];

        while(score[0] < 20 && score[1] < 20) {
            System.out.println("## 당신은 무엇을 낼 것입니까?##");
            game = s.next();
            String com_value = com_game[r.nextInt(com_game.length)];

            switch(game) {
                case "묵":
                case "바위":
                    switch(com_value) {
                        case "바위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("비겼습니다.");
                            break;
                        case "가위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("당신이 이겼습니다.");
                            score[0] += 1;
                            break;
                        case "보":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("당신이 졌습니다.");
                            score[1] += 1;
                            break;

                    }
                    break;
                case "찌":
                case "가위":
                    switch(com_value) {
                        case "바위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("당신이 졌습니다.");
                            score[1] += 2;
                            break;
                        case "가위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("비겼습니다.");
                            break;
                        case "보":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("당신이 이겼습니다.");
                            score[0] += 2;
                            break;
                    }
                    break;

                case "빠":
                case "보":
                    switch(com_value) {
                        case "바위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("당신이 이겼습니다.");
                            score[0]+=4 ;
                            break;
                        case "가위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("당신이 졌습니다.");
                            score[1] += 4;
                            break;
                        case "보":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("비겼습니다.");
                            break;
                    }
                    break;

                default:
                    System.out.println("입력 값이 이상합니다. 다시 입력해 주세요");
                    break;

            }
            System.out.printf("당신의 점수는 %d점 입니다.\n", score[0]);
            System.out.printf("컴퓨터의 점수는 %d점 입니다.\n\n", score[1]);
        }

        if (score[0] == 20) {System.out.println("당신이 이겼습니다.");}
        else{System.out.println("당신이 졌습니다.");}


    }
}

