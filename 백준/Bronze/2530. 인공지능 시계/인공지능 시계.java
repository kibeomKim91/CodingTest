import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        int inputSecond = sc.nextInt();
        
        second += inputSecond % 60;
        if(second >= 60) {
            minute++;
            second -= 60;
        }
        
        minute += inputSecond / 60;
        if(minute >= 60) {
            hour += minute / 60;
            minute %= 60;
        }
        
        if(hour >= 24) {
            hour %= 24;
        }
        
        System.out.print(hour + " " + minute + " " + second);
    }
    
}