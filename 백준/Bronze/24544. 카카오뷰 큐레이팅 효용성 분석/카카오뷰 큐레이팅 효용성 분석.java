import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] interest = new int[n];
        int resultFirst = 0;
        int resultSecond = 0;
        
        for(int i=0; i<n; i++) {
            interest[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            resultFirst += interest[i];
            
            if(num == 0) {
                resultSecond += interest[i];
            }
        }
        
        System.out.println(resultFirst);
        System.out.println(resultSecond);
    }
    
}