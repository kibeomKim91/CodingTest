import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int save = 0;
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            String str = sc.next();
            
            if(str.equals("ammo")) {
                sum += m;
            } else if(str.equals("shoot")) {
                sum--;
            } else if(str.equals("save")) {
                save = sum;
            } else if(str.equals("load")) {
                sum = save;
            }
            
            System.out.println(sum);
        }
    }
    
}