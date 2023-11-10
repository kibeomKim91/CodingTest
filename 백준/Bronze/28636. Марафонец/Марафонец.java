import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int hour = 0;
        int minute = 0;
        int second = 0;
        String h = "";
        String m = "";
        String s = "";
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            String[] arr = str.split(":");
            minute += Integer.parseInt(arr[0]);
            second += Integer.parseInt(arr[1]);            
        }
        
        if(second >= 60) {
            minute += second/60;
            second %= 60;
        }
        
        if(minute >= 60) {
            hour += minute/60;
            minute %= 60;
        }
        
        if(hour < 10) {
            h = "0"+hour;
        } else {
            h += hour;
        }
        
        if(minute < 10) {
            m = "0"+minute;
        } else {
            m += minute;
        }
        
        if(second < 10) {
            s = "0"+second;
        } else {
            s += second;
        }
        
        System.out.print(h+":"+m+":"+s);
    }
    
}