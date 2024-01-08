import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int two = 0;
        int e = 0;
        
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == '2') {
                two++;
            } else {
                e++;
            }
        }
        
        if(two > e) {
            System.out.print(2);
        } else if(e > two) {
            System.out.print('e');
        } else {
            System.out.print("yee");
        }
    }
    
}