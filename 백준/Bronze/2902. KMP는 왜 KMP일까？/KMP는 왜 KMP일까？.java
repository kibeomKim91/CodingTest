import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("-");
        int arrLength = arr.length;
        
        for(int i=0; i<arrLength; i++) {
            System.out.print(arr[i].charAt(0));
        }
    }
    
}