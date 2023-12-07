import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n >= 620 && n <= 780) {
            System.out.print("Red");
        } else if(n >= 590 && n < 620) {
            System.out.print("Orange");
        } else if(n >= 570 && n < 590) {
            System.out.print("Yellow");
        } else if(n >= 495 && n < 570) {
            System.out.print("Green");
        } else if(n >= 450 && n < 495) {
            System.out.print("Blue");
        } else if(n >= 425 && n < 450) {
            System.out.print("Indigo");
        } else if(n >= 380 && n < 425) {
            System.out.print("Violet");
        } 
    }
    
}