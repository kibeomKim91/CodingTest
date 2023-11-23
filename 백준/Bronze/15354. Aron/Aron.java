import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String copy = "";
        int aron = 1;
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            
            if(!str.equals(copy)) {
                copy = str;
                aron++;
            }
        }
        
        System.out.print(aron);
    }
    
}