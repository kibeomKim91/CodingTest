import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            String name = sc.nextLine();
            
            if(name.equals("Poblano")) {
                sum += 1500;
            } else if(name.equals("Mirasol")) {
                sum += 6000;
            } else if(name.equals("Serrano")) {
                sum += 15500;
            } else if(name.equals("Cayenne")) {
                sum += 40000;
            } else if(name.equals("Thai")) {
                sum += 75000;
            } else if(name.equals("Habanero")) {
                sum += 125000;
            }
        }
        
        System.out.print(sum);
    }
    
}