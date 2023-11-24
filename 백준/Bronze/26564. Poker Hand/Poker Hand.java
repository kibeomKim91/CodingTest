import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            int[] arr = new int[13];
            int result = 0;
            
            for(int j=1; j<=5; j++) {
                String str = sc.next();
                
                if(str.charAt(0) == 'A') {
                    arr[0]++;
                } else if(str.charAt(0) == 'K') {
                    arr[12]++;
                } else if(str.charAt(0) == 'Q') {
                    arr[11]++;
                } else if(str.charAt(0) == 'J') {
                    arr[10]++;
                } else if(str.charAt(0) == 'T') {
                    arr[9]++;
                } else {
                    arr[str.charAt(0) - '1']++;
                }
            }
            
            for(int num : arr) {
                if(num > result) {
                    result = num;
                }
            }
            
            System.out.println(result);
        }
    }
    
}