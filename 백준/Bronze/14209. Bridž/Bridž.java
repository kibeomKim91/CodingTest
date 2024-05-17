import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score = 0;
        
        for(int i=0; i<n; i++) {
            String str = sc.next();
            
            for(int j=0; j<13; j++) {
                if(str.charAt(j) == 'A') {
                    score += 4;
                } else if(str.charAt(j) == 'K') {
                    score += 3;
                } else if(str.charAt(j) == 'Q') {
                    score += 2;
                } else if(str.charAt(j) == 'J') {
                    score += 1;
                } 
            }
        }
        
        System.out.print(score);
    }
    
}