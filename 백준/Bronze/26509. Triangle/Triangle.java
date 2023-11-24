import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n>0) {
            int[] first = new int[3];
            int[] second = new int[3];

            for(int i=0; i<3; i++) {
                first[i] = sc.nextInt();
            }

            for(int i=0; i<3; i++) {
                second[i] = sc.nextInt();
            }

            Arrays.sort(first);
            Arrays.sort(second);
            
            if(first[0] != second[0] || first[1] != second[1] || first[2] != second[2]) {
                System.out.println("NO");
            } else {
                if(first[0]*first[0] + first[1]*first[1] == first[2]*first[2]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            
            n--;
        }
    }
    
}