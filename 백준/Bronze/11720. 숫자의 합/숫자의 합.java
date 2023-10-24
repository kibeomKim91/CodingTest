import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int sum = 0;
        
        for(char ch : str.toCharArray()) {
            sum += ch - '0';
        }
        
        System.out.print(sum);
    }
    
}