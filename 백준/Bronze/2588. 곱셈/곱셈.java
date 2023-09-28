import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        sc.close();
        
        int sumA = numA * (numB % 10);
        int sumB = numA * ((numB / 10) % 10);
        int sumC = numA * (numB / 100);
        int sumD = numA * numB;
        
        System.out.println(sumA);
        System.out.println(sumB);
        System.out.println(sumC);
        System.out.println(sumD);
    }
    
}