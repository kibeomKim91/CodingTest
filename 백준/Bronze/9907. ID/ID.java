import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num = 2;
        String result = "";
        
        for(int i=0; i<7; i++) {
            sum += n%10 * num;
            n /= 10;
            num++;
            
            if(num == 8) {
                num = 2;
            }
        }
        
        sum %= 11;
        
        if(sum == 0) {
            result = "J";
        } else if(sum == 1) {
            result = "A";
        } else if(sum == 2) {
            result = "B";
        } else if(sum == 3) {
            result = "C";
        } else if(sum == 4) {
            result = "D";
        } else if(sum == 5) {
            result = "E";
        } else if(sum == 6) {
            result = "F";
        } else if(sum == 7) {
            result = "G";
        } else if(sum == 8) {
            result = "H";
        } else if(sum == 9) {
            result = "I";
        } else if(sum == 10) {
            result = "Z";
        } 
        
        System.out.print(result);
    }

}