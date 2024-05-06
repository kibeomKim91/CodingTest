import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dateOne = sc.nextInt();
        int monthOne = sc.nextInt();
        int yearOne = sc.nextInt();
        int day = sc.nextInt();
        int dateTwo = sc.nextInt();
        int monthTwo = sc.nextInt();
        int yearTwo = sc.nextInt();
        int result = 0;
        
        int sumOne = dateOne + (monthOne-1)*30 + (yearOne-1)*360;
        int sumTwo = dateTwo + (monthTwo-1)*30 + (yearTwo-1)*360;
        result = (sumTwo - sumOne + day) % 7;
        
        if(result == 0) {
            result = 7;
        }
        
        System.out.print(result);
    }
    
}