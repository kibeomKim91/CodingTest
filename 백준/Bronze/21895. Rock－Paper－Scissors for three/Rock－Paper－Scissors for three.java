import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        
        for(int i=0; i<n; i++) {
            char aa = a.charAt(i);
            char bb = b.charAt(i);
            
            if(aa == 'R') {
                if(bb == 'R' || bb == 'P') {
                    System.out.print('P');
                } else {
                    System.out.print('R');
                }
            } else if(aa == 'P') {
                if(bb == 'P' || bb == 'S') {
                    System.out.print('S');
                } else {
                    System.out.print('P');
                }
            } else if(aa == 'S') {
                if(bb == 'S' || bb == 'R') {
                    System.out.print('R');
                } else {
                    System.out.print('S');
                }
            }
        }
    }
    
}