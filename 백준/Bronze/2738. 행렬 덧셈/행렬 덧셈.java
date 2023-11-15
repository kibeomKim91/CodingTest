import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a*b];
        int[] array = new int[a*b];
        
        for(int i=0; i<a*b; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<a*b; i++) {
            array[i] = sc.nextInt();
        }
        
        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                System.out.print(arr[i*b+j]+array[i*b+j]+" ");
            }
            
            System.out.println();
        }
    }
    
}