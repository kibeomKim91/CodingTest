import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int[] array = {1, 1, 2, 2, 2, 8};
        
        for(int i=0; i<6; i++) {
            arr[i] = array[i] - sc.nextInt();
            System.out.print(arr[i]+" ");
        }
    }
    
}