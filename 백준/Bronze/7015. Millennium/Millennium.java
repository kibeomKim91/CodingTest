import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 666*195 + 333*200 + 1;
        
        for(int i=0; i<n; i++) {
            int sum = 0;
            int year = sc.nextInt()-1;
            int month = sc.nextInt();
            int date = sc.nextInt();
            
            sum = year/3*200 + (year-year/3)*195;
            
            if((year+1)%3 == 0) {
                sum += (month-1)*20 + date;
            } else {
                sum += (month-1)/2*19 + (month-1-(month-1)/2)*20 + date;
            }
            
            System.out.println(num-sum);
        }
    }
    
}