import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        for(int i=0; i<8; i++) {
            String str = sc.nextLine();
            
            for(int j=0; j<8; j++) {
                if(str.charAt(j) == 'P') {
                    sum++;
                } else if(str.charAt(j) == 'N') {
                    sum += 3;
                } else if(str.charAt(j) == 'B') {
                    sum += 3;
                } else if(str.charAt(j) == 'R') {
                    sum += 5;
                } else if(str.charAt(j) == 'Q') {
                    sum += 9;
                } else if(str.charAt(j) == 'p') {
                    sum--;
                } else if(str.charAt(j) == 'n') {
                    sum -= 3;
                } else if(str.charAt(j) == 'b') {
                    sum -= 3;
                } else if(str.charAt(j) == 'r') {
                    sum -= 5;
                } else if(str.charAt(j) == 'q') {
                    sum -= 9;
                } 
            }
        }
        
        System.out.print(sum);
    }
    
}