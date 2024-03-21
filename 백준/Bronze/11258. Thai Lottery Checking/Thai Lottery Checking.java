import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int aa = sc.nextInt();
        String b = sc.next();
        int bb = sc.nextInt();
        String c = sc.next();
        int cc = sc.nextInt();
        String d = sc.next();
        int dd = sc.nextInt();
        String e = sc.next();
        int ee = sc.nextInt();
        String f = sc.next();
        int ff = sc.nextInt();
        
        while(true) {
            String n = sc.next();
            int price = 0;
            
            if(n.equals("-1")) {
                break;
            }
            
            if(n.equals(a)) {
                price += aa;
            }
            
            if(n.substring(0, 3).equals(b)) {
                price += bb;
            } else if(n.substring(0, 3).equals(c)) {
                price += cc;
            }
            
            if(n.substring(3).equals(d)) {
                price += dd;
            } else if(n.substring(3).equals(e)) {
                price += ee;
            }
            
            if(n.substring(4).equals(f)) {
                price += ff;
            }
            
            System.out.println(price);
        }
    }
    
}