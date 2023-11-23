import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String result = "";
        
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            int m = Integer.parseInt(arr[1]);
            
            if(m < n) {
                n = m;
                result = arr[0];
            }
        }
        
        System.out.print(result);
    }
    
}