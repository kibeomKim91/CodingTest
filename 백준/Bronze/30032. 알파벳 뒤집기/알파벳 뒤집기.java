import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            String result = "";
            
            for(int j=0; j<n; j++) {
                if(str.charAt(j) == 'b') {
                    if(d == 1) {
                        result += 'p';
                    } else {
                        result += 'd';
                    }
                } else if(str.charAt(j) == 'd') {
                    if(d == 1) {
                        result += 'q';
                    } else {
                        result += 'b';
                    }
                } else if(str.charAt(j) == 'p') {
                    if(d == 1) {
                        result += 'b';
                    } else {
                        result += 'q';
                    }
                } else if(str.charAt(j) == 'q') {
                    if(d == 1) {
                        result += 'd';
                    } else {
                        result += 'p';
                    }
                } 
            }
            
            System.out.println(result);
        }
    }
    
}