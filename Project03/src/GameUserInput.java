import java.util.Scanner;

public class GameUserInput {
    private Scanner scanner;

    public GameUserInput() {this.scanner = new Scanner(System.in);}

    public String GetUserInput() {
        System.out.println("##### 당신이 낼 것을 입력하세요 #####");
        return scanner.next();
    }
}
