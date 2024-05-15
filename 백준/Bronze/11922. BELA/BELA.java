import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score = 0;
        char ch = sc.next().charAt(0);
        
        for(int i=0; i<n*4; i++) {
            String str = sc.next();
            
            if(str.charAt(0) == 'A') {
                score += 11;
            } else if(str.charAt(0) == 'K') {
                score += 4;
            } else if(str.charAt(0) == 'Q') {
                score += 3;
            } else if(str.charAt(0) == 'J') {
                if(str.charAt(1) == ch) {
                    score += 20;
                } else {
                    score += 2;
                }
            } else if(str.charAt(0) == 'T') {
                score += 10;
            } else if(str.charAt(0) == '9') {
                if(str.charAt(1) == ch) {
                    score += 14;
                }
            }
        }
        
        System.out.print(score);
    }
    
}