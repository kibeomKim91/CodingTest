import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int strLength = str.length();
        int[] arr = new int[5];
        
        for(int i=0; i<strLength; i++) {
            char ch = str.charAt(i);
            
            if(ch=='u') {
                arr[0]++;
            } else if(ch=='o') {
                arr[1]++;
            } else if(ch=='s') {
                arr[2]++;
            } else if(ch=='p') {
                arr[3]++;
            } else if(ch=='c') {
                arr[4]++;
            }
        }
        
        Arrays.sort(arr);
        System.out.print(arr[0]);
    }
    
}