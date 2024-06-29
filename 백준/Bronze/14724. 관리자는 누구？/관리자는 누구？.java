import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
        int n = sc.nextInt();
        int result = 0;
        int max = 0;
        
        for(int i=0; i<9; i++) {
            for(int j=0; j<n; j++) {
                int num = sc.nextInt();
                
                if(num>max) {
                    max = num;
                    result = i;
                }
            }
        }
        
        System.out.print(arr[result]);
    }
    
}