import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int sum = 0;
            
            for(int j=0; j<7; j++) {
                int grade = sc.nextInt();
                double score = 0.0;
                
                if(j == 0) {
                    score = 9.23076 * Math.pow((26.7-grade), 1.835);
                } else if(j == 1) {
                    score = 1.84523 * Math.pow((grade-75), 1.348);
                } else if(j == 2) {
                    score = 56.0211 * Math.pow((grade-1.5), 1.05);
                } else if(j == 3) {
                    score = 4.99087 * Math.pow((42.5-grade), 1.81);
                } else if(j == 4) {
                    score = 0.188807 * Math.pow((grade-210), 1.41);
                } else if(j == 5) {
                    score = 15.9803 * Math.pow((grade-3.8), 1.04);
                } else if(j == 6) {
                    score = 0.11193 * Math.pow((254-grade), 1.88);
                }
                
                sum += (int) score;
            }
            
            System.out.println(sum);
        }
    }
    
}