import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        
        if(n == 1) {
            a = 12;
            b = 1600;
        } else if(n == 2) {
            a = 11;
            b = 894;
        } else if(n == 3) {
            a = 11;
            b = 1327;
        } else if(n == 4) {
            a = 10;
            b = 1311;
        } else if(n == 5) {
            a = 9;
            b = 1004;
        } else if(n == 6) {
            a = 9;
            b = 1178;
        } else if(n == 7) {
            a = 9;
            b = 1357;
        } else if(n == 8) {
            a = 8;
            b = 837;
        } else if(n == 9) {
            a = 7;
            b = 1055;
        } else if(n == 10) {
            a = 6;
            b = 556;
        } else if(n == 11) {
            a = 6;
            b = 773;
        }
        
        System.out.print(a+" "+b);
    }
    
}