import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        int a = 0;
        
        if(n%8 == 0) {
            str = "h";
            n /= 8;
        } else if(n%8 == 1) {
            str = "a";
            n = n/8 + 1;
        } else if(n%8 == 2) {
            str = "b";
            n = n/8 + 1;
        } else if(n%8 == 3) {
            str = "c";
            n = n/8 + 1;
        } else if(n%8 == 4) {
            str = "d";
            n = n/8 + 1;
        } else if(n%8 == 5) {
            str = "e";
            n = n/8 + 1;
        } else if(n%8 == 6) {
            str = "f";
            n = n/8 + 1;
        } else if(n%8 == 7) {
            str = "g";
            n = n/8 + 1;
        }
        
        System.out.print(str+n);
    }
    
}