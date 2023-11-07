import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        while(true) {
            if(!sc.hasNextLine()) {
                break;
            }
            
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            
            if(arr[0].equals("Es")) {
                sum += Integer.parseInt(arr[1])*21;
            } else {
                sum += Integer.parseInt(arr[1])*17;
            }
        }
        
        System.out.print(sum);
    }
    
}