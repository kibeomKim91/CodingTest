import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt()+1;
        String hh = "";
        String mm = "";
        String ss = "";
        
        if(s == 60) {
            m++;
            s = 0;
        }
        
        if(m == 60) {
            h++;
            m = 0;
        }
        
        if(h == 24) {
            h = 0;
        }
        
        if(h < 10) {
            hh = "0" + h;
        } else {
            hh += h;
        }
        
        if(m < 10) {
            mm = "0" + m;
        } else {
            mm += m;
        }
        
        if(s < 10) {
            ss = "0" + s;
        } else {
            ss += s;
        }
        
        System.out.print(hh+":"+mm+":"+ss);
    }
    
}