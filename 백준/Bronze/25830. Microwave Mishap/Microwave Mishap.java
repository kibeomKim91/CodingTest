import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(":");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        
        int h = a;
        int m = b-a;
        int s = 0-b;
        
        if(s < 0) {
            s += 60;
            m--;
        }
        
        if(m < 0) {
            m += 60;
            h--;
        }
        
        String hh = "";
        String mm = "";
        String ss = "";
        if(h < 10) {
            hh = "0"+h;
        } else {
            hh += h;
        }
        
        if(m < 10) {
            mm = "0"+m;
        } else {
            mm += m;
        }
        
        if(s < 10) {
            ss = "0"+s;
        } else {
            ss += s;
        }
        
        System.out.print(hh+":"+mm+":"+ss);
    }
    
}