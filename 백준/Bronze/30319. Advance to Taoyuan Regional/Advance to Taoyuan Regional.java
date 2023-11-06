import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String[] arr = str.split("-");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int date = Integer.parseInt(arr[2]);
        
        if((month == 9 && date <= 16) || month < 9) {
            System.out.print("GOOD");
        } else {
            System.out.print("TOO LATE");
        }
    }
    
}