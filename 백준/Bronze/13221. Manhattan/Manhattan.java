import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int resultFirst = 0;
        int resultSecond = 0;
        int min = 0;
        
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(i>0) {
                int sum = Math.abs(a-x)+Math.abs(b-y);
                if(sum<min) {
                    min = sum;
                    resultFirst = x;
                    resultSecond = y;
                }
            } else {
                min = Math.abs(a-x)+Math.abs(b-y);
                resultFirst = x;
                resultSecond = y;
            }
        }
        
        System.out.print(resultFirst+" "+resultSecond);
    }
    
}