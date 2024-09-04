import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int count = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int a = sc.nextInt()*n;
        int b = sc.nextInt()*m;
        int c = sc.nextInt()*k;
        int max = Math.max(Math.max(a, b), c);
        
        if(max==a) {
            result += "Joffrey ";
        }
        
        if(max==b) {
            result += "Robb ";
        }
        
        if(max==c) {
            result += "Stannis";
        }
        
        System.out.print(result);
    }
    
}