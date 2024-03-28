import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = 0;
        int m = 0;
        int s = 0;
        String hh = "";
        String mm = "";
        String ss = "";
        
        for(int i=0; i<a; i++) {
            String[] str = sc.next().split(":");
            s += Integer.parseInt(str[0])*60 + Integer.parseInt(str[1]);
        }
        
        s -= (a-1)*b;
        h = s/3600;
        s %= 3600;
        m = s/60;
        s %= 60;
        
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