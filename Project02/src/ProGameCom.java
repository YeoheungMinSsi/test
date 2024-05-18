import java.util.Random;

public class ProGameCom {
    private Random r;
    private String[] option = {"묵", "바위", "찌", "가위", "빠", "보"};

    public ProGameCom() {
        this.r = new Random();
    }

    public String ComInput(){
        return option[r.nextInt(option.length)];

    }
}
