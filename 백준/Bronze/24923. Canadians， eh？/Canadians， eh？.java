import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String[] arr = str.split(" ");
        int arrLength = arr.length;
        
        if(arr[arrLength-1].equals("eh?")) {
            System.out.print("Canadian!");
        } else {
            System.out.print("Imposter!");
        }
    }
    
}