import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt()*2;
        double d = Math.sqrt(w);
        System.out.print((int)d*4);
    }
    
}