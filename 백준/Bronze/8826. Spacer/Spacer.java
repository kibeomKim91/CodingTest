import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int num = sc.nextInt();
            String str = sc.next();
            int result = 0;
            int n = 0;
            int s = 0;
            int w = 0;
            int e = 0;
            
            for(int j=0; j<num; j++) {
                if(str.charAt(j) == 'N') {
                    n++;
                } else if(str.charAt(j) == 'S') {
                    s++;
                } else if(str.charAt(j) == 'W') {
                    w++;
                } else {
                    e++;
                } 
            }
            
            result = Math.abs(n-s)+Math.abs(w-e);
            System.out.println(result);
        }
    }
    
}