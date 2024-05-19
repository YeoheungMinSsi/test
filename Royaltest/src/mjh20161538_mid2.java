import java.util.Scanner;
// 사용자가 입력받을 수 있게 도와주는 클래스 Scanner
import java.util.Random;
// 램덤하게 출력되도록 도와주는 클래스 Random
// 게임을 이긴다면 1, 게임을 비긴다면 0 게임을 진다면 -1

public class mjh20161538_mid2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        String game = "0";
        String[] com_game = {"바위", "가위", "보"};
        String com_value;
        int[] score = new int[2]; // 길이값이 2인 배열에 스코어 0 사람점수 스코어 1은 컴퓨터 점수
        int[] count = new int[2]; // 이긴값을 n으로 했을 때 n%3==0 이랴면 3n연승을 했다는 것 5점 추가
        System.out.println("#####목표 점수를 입력하세요 : #####");
        int GoalScore = s.nextInt();

        while(score[0] <= GoalScore && score[1] <= GoalScore) {
            System.out.println("#####당신은 무엇을 낼 것입니까? (바위, 가위, 보 중 입력)#####");
            game = s.next();
            com_value = com_game[r.nextInt(com_game.length)];

            switch(game) {
                case "묵":
                case "바위":
                    switch(com_value) {
                        case "바위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            count[0] = 0; //게임에서 비긴다면 count가 0으로 설정
                            count[1] = 0; //게임에서 비긴다면 count가 0으로 설정
                            break;
                        case "가위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            count[1] = 0; //게임에서 이긴다면 컴퓨터 count가 0으로 설정
                            count[0] += 1; //게임에서 이긴다면 count가 1으로 설정
                            score[0] += 1; //사람이 이긴 점수 추가
                            break;
                        case "보":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            count[0] = 0; //게임에서 진다면 count가 0의 값으로
                            count[1] += 1; //게임에서 진다면 컴퓨터 count가 1로 상승
                            score[1] += 4; //컴퓨터가 이긴 점수 추가
                            break;
                    }
                    break;

                case "찌":
                case "가위":
                    switch(com_value) {
                        case "바위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            count[0] = 0; //게임에서 진다면 count가 0의 값으로
                            count[1] += 1; //게임에서 진다면 컴퓨터 count가 1로 상승
                            score[1] += 1;
                            break;
                        case "가위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            count[0] = 0; //게임에서 비긴다면 count가 0으로 설정
                            count[1] = 0; //게임에서 비긴다면 count가 0으로 설정
                            break;
                        case "보":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            count[1] = 0; //게임에서 이긴다면 컴퓨터 count가 0으로 설정
                            count[0] += 1; //게임에서 이긴다면 count가 1으로 설정
                            score[0] += 2;
                            break;
                    }
                    break;

                case "빠":
                case "보":
                    switch(com_value) {
                        case "바위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            count[1] = 0; //게임에서 이긴다면 컴퓨터 count가 0으로 설정
                            count[0] += 1; //게임에서 이긴다면 count가 1으로 설정
                            score[0] += 4 ;
                            break;
                        case "가위":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            count[0] = 0; //게임에서 진다면 count가 0의 값으로
                            count[1] += 1; //게임에서 진다면 컴퓨터 count가 1로 상승
                            score[1] += 2;
                            break;
                        case "보":
                            System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                            count[0] = 0; //게임에서 비긴다면 count가 0으로 설정
                            count[1] = 0; //게임에서 비긴다면 count가 0으로 설정
                            break;
                    }
                    break;

                default:
                    count[0] = -1;
                    break;

            }
            if (count[0] > 0) {System.out.println("당신이 이겼습니다.");}
            else if (count[1] > 0)  {System.out.println("당신이 졌습니다.");}
            else if (count[0] == 0 && count[1] == 0)  {System.out.println("비겼습니다.");}
            else {System.out.println("입력 값이 이상합니다. 다시 입력해 주세요");}

            if (count[0] == 3) {
                score[0] += 3;
                System.out.println("당신이 3번 연속으로 이겨 추가 점수 3점 부여");
                count[0] = 0;
            } else if (count[1] >= 3) {
                score[1] += 3;
                System.out.println("컴퓨터가 3번 연속으로 이겨 추가 점수 3점 부여");
                count[1] = 0;
            }

            System.out.printf("당신의 점수는 %d점 입니다.\n", score[0]);
            System.out.printf("컴퓨터의 점수는 %d점 입니다.\n\n", score[1]);
        }

        if (score[0] >= GoalScore) {System.out.println("당신이 이 게임에서 승리했습니다..");}
        else if ((score[1] >= GoalScore)) {System.out.println("당신이 이 게임에서 패배하였습니다..");}


    }
}

