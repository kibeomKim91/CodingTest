import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int startIndex = n-1;
        int firstIndex = startIndex-1;
        int secondIndex = startIndex+1;
        
        for(int i=0; i<n; i++) {
            if(i<n-1) {
                System.out.print(" ");
            } else {
                System.out.println("*");
            }
        }
        
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<=secondIndex; j++) {
                if(j!=firstIndex && j!=secondIndex) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            
            System.out.println();
            firstIndex--;
            secondIndex++;
        }
    }
    
}