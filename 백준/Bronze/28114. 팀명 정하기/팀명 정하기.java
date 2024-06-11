import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        String result = "";
        
        int numFirst = sc.nextInt();
        arr[0] = sc.nextInt()%100;
        char chFirst = sc.next().charAt(0);
        
        int numSecond = sc.nextInt();
        arr[1] = sc.nextInt()%100;
        char chSecond = sc.next().charAt(0);
        
        int numThird = sc.nextInt();
        arr[2] = sc.nextInt()%100;
        char chThird = sc.next().charAt(0);
        
        Arrays.sort(arr);
        System.out.println(arr[0]*10000+arr[1]*100+arr[2]);
        
        if(numFirst>numSecond && numFirst>numThird) {
            result += chFirst;
            
            if(numSecond>numThird) {
                result += chSecond;
                result += chThird;
            } else {
                result += chThird;
                result += chSecond;
            }
        } else if(numSecond>numFirst && numSecond>numThird) {
            result += chSecond;
            
            if(numFirst>numThird) {
                result += chFirst;
                result += chThird;
            } else {
                result += chThird;
                result += chFirst;
            }
        } else {
            result += chThird;
            
            if(numFirst>numSecond) {
                result += chFirst;
                result += chSecond;
            } else {
                result += chSecond;
                result += chFirst;
            }
        }
        
        System.out.print(result);
    }
    
}