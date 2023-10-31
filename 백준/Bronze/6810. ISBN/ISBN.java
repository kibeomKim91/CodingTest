import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "9780921418";
        int sum = 0;
        
        for(int i=0; i<3; i++) {
            str += sc.nextInt();
        }
        
        for(int i=1; i<=13; i++) {
            if(i%2 == 1) {
                sum += str.charAt(i-1)-'0';
            } else if(i%2 == 0) {
                sum += (str.charAt(i-1)-'0')*3;
            }
        }
        
        System.out.print("The 1-3-sum is " + sum);
    }
    
}