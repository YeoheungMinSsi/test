import java.util.Scanner;

public class ProGameUser {
    private Scanner s;

    public ProGameUser() {
        this.s = new Scanner(System.in);
        //s를 현재 인스턴스의 Scanner 객체로 초기화 하는 것
        //입력 받기 위한 Scanner 객체 s를 생성

    }

    public String UserInput() {
        System.out.println("#####당신이 낼 것은 무엇입니까?");
        return s.next(); // 사용자가 입력한 값이 저장된 객체 s의 값을 UserInput 함수에 리턴
    }
}
