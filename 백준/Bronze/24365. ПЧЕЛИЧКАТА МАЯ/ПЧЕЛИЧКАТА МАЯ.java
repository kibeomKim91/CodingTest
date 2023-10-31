import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        
        if(average == b) {
            System.out.print((c-average)*2);
        } else if(average > b) {
            System.out.print(average-b+(c-average-(average-b))*2);
        } else if(average < b) {
            System.out.print(b-average+(c-average)*2);
        }
    }
    
}