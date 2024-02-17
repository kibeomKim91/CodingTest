import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int axis = 0;
        
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(x>0 && y>0) {
                one++;
            } else if(x<0 && y>0) {
                two++;
            } else if(x<0 && y<0) {
                three++;
            } else if(x>0 && y<0) {
                four++;
            } else {
                axis++;
            }
        }
        
        System.out.println("Q1: "+one);
        System.out.println("Q2: "+two);
        System.out.println("Q3: "+three);
        System.out.println("Q4: "+four);
        System.out.println("AXIS: "+axis);
    }
    
}