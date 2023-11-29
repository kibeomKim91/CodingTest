import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int h = 0;
        int i = 0;
        int a = 0;
        int r = 0;
        int c = 0;
        
        for(int j=0; j<n; j++) {
            if(str.charAt(j) == 'H') {
                h++;
            } else if(str.charAt(j) == 'I') {
                i++;
            } else if(str.charAt(j) == 'A') {
                a++;
            } else if(str.charAt(j) == 'R') {
                r++;
            } else if(str.charAt(j) == 'C') {
                c++;
            } 
        }
        
        System.out.print(Math.min(Math.min(Math.min(Math.min(h,i),a),r),c));
    }
    
}