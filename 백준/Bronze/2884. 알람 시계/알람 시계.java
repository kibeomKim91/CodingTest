import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputHour = sc.nextInt();
        int inputMinute = sc.nextInt();
        sc.close();
        
        int hour = inputHour;
        int minute = inputMinute - 45;
        
        if(minute < 0) {
            minute += 60;
            hour--;
            if(hour < 0) {
                hour = 23;
            }
        }
        
        System.out.print(hour+" ");
        System.out.println(minute);
    }
    
}