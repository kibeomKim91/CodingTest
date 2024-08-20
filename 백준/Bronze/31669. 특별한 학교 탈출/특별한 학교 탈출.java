import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        int result = 0;
        
        for(int i=0; i<n; i++) {
            String str = sc.next();
            
            for(int j=0; j<m; j++) {
                if(str.charAt(j)=='O') {
                    arr[j]++;
                }
            }
        }
        
        for(int i=0; i<m; i++) {
            if(arr[i]==0) {
                result = i+1;
                break;
            }
        }
        
        if(result==0) {
            System.out.print("ESCAPE FAILED");
        } else {
            System.out.print(result);
        }
    }
    
}