import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            String[] arr = sc.nextLine().split(" ");
            int arrLength = arr.length;
            
            for(int j=2; j<arrLength; j++) {
                System.out.print(arr[j]+" ");
            }
            
            System.out.println(arr[0]+" "+arr[1]);
        }
    }
    
}