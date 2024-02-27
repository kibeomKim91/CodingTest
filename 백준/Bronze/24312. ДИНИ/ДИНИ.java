import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int threeAndOne = 0;
        int twoAndTwo = 0;
        
        for(int i=0; i<4; i++) {
            arr[i] = sc.nextInt();            
        }
        
        Arrays.sort(arr);
        
        threeAndOne = Math.abs(arr[0]+arr[1]+arr[2]-arr[3]);
        twoAndTwo = Math.abs(arr[0]+arr[3]-(arr[1]+arr[2]));
        
        if(threeAndOne > twoAndTwo) {
            System.out.print(twoAndTwo);
        } else {
            System.out.print(threeAndOne);
        }
    }
    
}