import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        String[] array = new String[n];
        int count = 0;
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextLine();
        }
        
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            array[i] = sc.nextLine();
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i].charAt(j) == array[i].charAt(j)) {
                    count++;
                }
            }
        }
        
        System.out.print(count);
    }
    
}