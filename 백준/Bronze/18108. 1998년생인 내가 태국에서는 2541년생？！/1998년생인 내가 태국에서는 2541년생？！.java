import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buddhistYear = sc.nextInt();
        sc.close();

        // 불기 연도를 서기 연도로 변환
        int adYear = buddhistYear - 543;

        System.out.println(adYear);
    }
}