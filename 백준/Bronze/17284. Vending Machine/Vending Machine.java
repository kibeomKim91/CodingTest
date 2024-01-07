import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = str.length;
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            if(str[i].equals("1")) {
                sum += 500;
            } else if(str[i].equals("2")) {
                sum += 800;
            } else if(str[i].equals("3")) {
                sum += 1000;
            }
        }
        
        System.out.print(5000-sum);
    }
    
}