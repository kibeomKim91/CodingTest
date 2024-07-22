import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "";
        String b = "";
        
        for(int i=0; i<n; i++) {
            a += sc.nextInt();
        }
        
        for(int i=0; i<n; i++) {
            b += sc.nextInt();
        }
        
        int aLength = a.length();
        int bLength = b.length();
        if(aLength<bLength) {
            System.out.print(a);
        } else if(bLength<aLength) {
            System.out.print(b);
        } else {
            if(a.equals(b)) {
                System.out.print(a);
            } else {
                for(int i=0; i<aLength; i++) {
                    char aa = a.charAt(i);
                    char bb = b.charAt(i);
                    
                    if(aa<bb) {
                        System.out.print(a);
                        break;
                    } else if(bb<aa) {
                        System.out.print(b);
                        break;
                    }
                }
            }
        }
    }
    
}