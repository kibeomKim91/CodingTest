import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int num = 0;
        
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == 'a' 
               || str.charAt(i) == 'i'
               || str.charAt(i) == 'u'
               || str.charAt(i) == 'e'
               || str.charAt(i) == 'o'
              ) {
                num ++;
            } else {
                continue;
            }
        }
        
        System.out.print(num);
    }
    
}