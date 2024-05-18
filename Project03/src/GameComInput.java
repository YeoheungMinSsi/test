import java.util.Random;

public class GameComInput {
    private Random rand = new Random();
    private String[] option = {"바위", "가위", "보"};

    public GameComInput() {this.rand = new Random();}

    public String GetComInput() {
        return option[rand.nextInt(option.length)];
    }
}
