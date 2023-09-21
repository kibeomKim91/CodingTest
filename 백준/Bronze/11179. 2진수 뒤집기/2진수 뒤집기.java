import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        String strNum = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder(strNum);
        String reverseStrNum = sb.reverse().toString();
        
        int result = Integer.parseInt(reverseStrNum, 2);
        
        System.out.print(result);
    }
    
}