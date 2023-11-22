import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        
        int sum = a*60 + b - 10 - c - d*60 - e - (f+1)*g;
        int x = sum/60;
        int y = sum%60;
        String hour = "";
        String minute = "";
        
        if(x < 10) {
            hour = "0" + x;
        } else {
            hour += x;
        }
        
        if(y < 10) {
            minute = "0" + y;
        } else {
            minute += y;
        }
        
        System.out.print(hour+" "+minute);
    }
    
}