import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int result = 0;
        int countResult = 0;
        
        for(int i=0; i<n; i++) {
            String name = sc.next();
            arr[i] = sc.nextInt();
            
            if(name.equals("jinju")) {
                result = arr[i];
            }
        }
        
        for(int i=0; i<n; i++) {
            if(result < arr[i]) {
                countResult++;
            }
        }
        
        System.out.println(result);
        System.out.println(countResult);
    }
    
}