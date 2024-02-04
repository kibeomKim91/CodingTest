import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int result = 0;
        
        if(str.equals("bad")) {
            result = n*200;
        } else if(str.equals("cool")) {
            result = n*400;
        } else if(str.equals("great")) {
            result = n*600;
        } else if(str.equals("perfect")) {
            result = n*1000;
        }
        
        System.out.print(result);
    }
    
}