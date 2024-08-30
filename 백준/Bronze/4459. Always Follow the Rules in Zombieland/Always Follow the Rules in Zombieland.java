import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextLine();
        }
        
        int m = sc.nextInt();
        for(int i=0; i<m; i++) {
            int num = sc.nextInt();
            String result = "";
            if(num>0 && num<=n) {
                result = arr[num-1];
            } else {
                result = "No such rule";
            }
            
            System.out.println("Rule "+num+": "+result);
        }
    }
    
}