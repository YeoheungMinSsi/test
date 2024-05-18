import java.util.Scanner;
import java.util.Random;

public class test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        String game = "0";
        String[] com_game = {"바위", "가위", "보"};
        String com_value;
        int[] score = new int[2]; // score[0]는 사람의 점수, score[1]은 컴퓨터의 점수
        int[] count = new int[2]; // 이긴 횟수를 카운트하기 위한 배열

        while(score[0] < 20 && score[1] < 20) { // 사람과 컴퓨터 둘 중 한 명이 20점 이상이 될 때까지 반복
            System.out.println("#####당신은 무엇을 낼 것입니까? (바위, 가위, 보 중 입력)#####");
            game = s.next();
            com_value = com_game[r.nextInt(com_game.length)];

            switch(game) {
                case "묵":
                case "바위":
                    switch(com_value) {
                        case "바위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("비겼습니다.");
                            count[0] = 0; // 비긴 경우 카운트 초기화
                            count[1] = 0;
                            break;
                        case "가위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("당신이 이겼습니다.");
                            count[1] = 0; // 컴퓨터의 이긴 횟수 초기화
                            count[0] += 1; // 사람의 이긴 횟수 증가
                            score[0] += 1; // 사람의 점수 증가
                            break;
                        case "보":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("당신이 졌습니다.");
                            count[0] = 0; // 이긴 경우 카운트 초기화
                            count[1] += 1; // 컴퓨터의 이긴 횟수 증가
                            score[1] += 1; // 컴퓨터의 점수 증가
                            break;
                    }
                    break;

                case "찌":
                case "가위":
                    switch(com_value) {
                        case "바위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("당신이 졌습니다.");
                            count[0] = 0; // 이긴 경우 카운트 초기화
                            count[1] += 1; // 컴퓨터의 이긴 횟수 증가
                            score[1] += 2;
                            break;
                        case "가위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("비겼습니다.");
                            count[0] = 0; // 비긴 경우 카운트 초기화
                            count[1] = 0;
                            break;
                        case "보":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("당신이 이겼습니다.");
                            count[1] = 0; // 컴퓨터의 이긴 횟수 초기화
                            count[0] += 1; // 사람의 이긴 횟수 증가
                            score[0] += 2; // 사람의 점수 증가
                            break;
                    }
                    break;

                case "빠":
                case "보":
                    switch(com_value) {
                        case "묵":
                        case "바위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("당신이 이겼습니다.");
                            count[1] = 0; // 컴퓨터의 이긴 횟수 초기화
                            count[0] += 1; // 사람의 이긴 횟수 증가
                            score[0]+=4 ; // 사람의 점수 증가
                            break;
                        case "찌":
                        case "가위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("당신이 졌습니다.");
                            count[0] = 0; // 이긴 경우 카운트 초기화
                            count[1] += 1; // 컴퓨터의 이긴 횟수 증가
                            score[1] += 4; // 컴퓨터의 점수 증가
                            break;
                        case "빠":
                        case "보":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            System.out.println("비겼습니다.");
                            count[0] = 0; // 비긴 경우 카운트 초기화
                            count[1] = 0;
                            break;
                    }
                    break;

                default:
                    System.out.println("입력 값이 이상합니다. 다시 입력해 주세요");
                    break;

            }
            if (count[0] > 0) {System.out.println("당신이 이겼습니다.");}
            else if (count[1] > 0)  {System.out.println("당신이 졌습니다..");}
            else if (count[0] == 0 && count[1] == 0)  {System.out.println("비겼습니다.");}

            if (count[0] == 3) {
                score[0] += 5;
                count[0] = 0;
            } else if (count[1] >= 3) {
                score[1] += 5;
                count[1] = 0;
            }


            System.out.printf("당신의 점수는 %d점 입니다.\n", score[0]);
            System.out.printf("컴퓨터의 점수는 %d점 입니다.\n\n", score[1]);
        }

        if (score[0] > 20) {
            System.out.println("당신이 이겼습니다.");
        } else if (score[1] > 20) {
            System.out.println("당신이 졌습니다.");
        }
    }
}
