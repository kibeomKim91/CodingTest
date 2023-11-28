import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int positive = 0;
        int odd = 0;
        int even = 0;
        
        for(int i=0; i<n; i++) {
            int k = sc.nextInt();
            int num = sc.nextInt();
            
            if(num%2 == 1) {
                positive = (1+num)*(num/2)+num/2+1;
                odd = 2*num*(num/2)+(num/2+1)*2-1;
                even = (2*num+2)*(num/2)+(num/2+1)*2;
            } else {
                positive = (1+num)*(num/2);
                odd = 2*num*(num/2);
                even = (2*num+2)*(num/2);
            }
            
            System.out.println(k+" "+positive+" "+odd+" "+even);
        }
    }
    
}