import java.util.Scanner;
// 사용자가 입력받을 수 있게 도와주는 클래스 Scanner
import java.util.Random;
// 램덤하게 출력되도록 도와주는 클래스 Random

public class mjh20161538_mid1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
		/*스캐너 객체 s를 생성, s를 통해 사용자가 입력할 문자(열)을 입력
		컴퓨터가 낼 수 있는 값을 랜덤으로 출력하기 위한 Random 클래스를 이용한 r 객체 생성 */

        String game = "0";
        String[] com_game = {"묵", "바위", "찌", "가위", "빠", "보"};
        String com_value;
		/* 사용자가 입력할 문자열 함수 game을 선언 및 문자 0으로 초기화
		컴퓨터가 낼 수 있는 값을 정리한 com_game 배열을 선언
		랜덤 클래스를 이용하여 컴퓨터에게 입력된 배열을 랜덤 클래스를 이용하여
		랜덤 값을 대입시킬 com_value를 선언  */

        System.out.println("## 당신은 무엇을 낼 것입니까?##");
        game = s.next();
		/* 입력하는 객체 s를 이용한 사용자가 입력할 값을 game에 입력하여 초기화
		next()는 문자열을 입력하기 위한 scanner 매서드  */

        com_value = com_game[r.nextInt(6)];
		 /* 컴퓨터에게 저장되어 있던 배열 6가지 중 랜덤값 중 하나를 com_value에 대입
		이후 com_value값을 가지고 사용자와 가위바위보 실행 */

        switch(game) {
            case "묵":
            case "바위":

                switch(com_value) {
                    case "묵":
                    case "바위":
                        System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                        System.out.println("비겼습니다.");
                        break;
                    case "찌":
                    case "가위":
                        System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                        System.out.println("당신이 이겼습니다.");
                        break;
                    case "빠":
                    case "보":
                        System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                        System.out.println("당신이 졌습니다.");
                        break;
                }
                break;
			/* 사용자가 입력한 값이 묵 or 바위일 때의 case를 설정한 것이고 이 값과 컴퓨터가 랜덤으로 추출될 값을 case로 설정하여
			패배 승리 비김 등을 비교하여 출력함 */

            case "찌":
            case "가위":

                switch(com_value) {
                    case "묵":
                    case "바위":
                        System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                        System.out.println("당신이 졌습니다.");
                        break;
                    case "찌":
                    case "가위":
                        System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                        System.out.println("비겼습니다.");
                        break;
                    case "빠":
                    case "보":
                        System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                        System.out.println("당신이 이겼습니다.");
                        break;
                }
                break;
			/* 사용자가 입력한 값이 찌 or 가위일 때의 case를 설정한 것이고 이 값과 컴퓨터가 랜덤으로 추출될 값을 case로 설정하여
			패배 승리 비김 등을 비교하여 출력함 */

            case "빠":
            case "보":

                switch(com_value) {
                    case "묵":
                    case "바위":
                        System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                        System.out.println("당신이 이겼습니다.");
                        break;
                    case "찌":
                    case "가위":
                        System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                        System.out.println("당신이 졌습니다.");
                        break;
                    case "빠":
                    case "보":
                        System.out.printf("컴퓨터가 낸 것은 %s 입니다.\n", com_value);
                        System.out.println("비겼습니다.");
                        break;
                }
                break;
			/* 사용자가 입력한 값이 빠 or 보일 때의 case를 설정한 것이고 이 값과 컴퓨터가 랜덤으로 추출될 값을 case로 설정하여
			패배 승리 비김 등을 비교하여 출력함 */

            default:
                System.out.println("입력 값이 이상합니다. 다시 입력해 주세요");
                break;
            /* 사용자가 입력한 값이 위 케이스와 완전히 다른값을 입력했을 때 비교할 값이 없어 다시 입력하라고 출력 */
        }
    }
}

//if문을 사용한 것 보다 길어졌지만 조건문을 시각적으로 이해하기 쉽게 사용할 수 있다
//switch문 안의 스위치 문에 default를 사용하지 않은 이유는 이미 컴퓨터의 값은 배열로서 저장되어 있어 추출될 때 틀린 이유가 없다
