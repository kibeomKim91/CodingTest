import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt()+1;
            
            while(true) {
                int copy = num;
                
                while(copy>=10) {
                    if(copy%10 == 0) {
                        num++;
                        break;
                    }
                    
                    copy /= 10;
                }
                
                if(copy%10 != 0) {
                    System.out.println(num);
                    break;
                }
            }
        }
    }
    
}