import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        String str = sc.next();
        String strResult = "";
        String[] nickname = new String[n];
        String[] result = new String[n];
        
        for(int i=0; i<n; i++) {
            nickname[i] = sc.next();
            result[i] = sc.next();
            
            if(nickname[i].equals(str)) {
                strResult = result[i];
            }
        }
        
        for(int i=0; i<n; i++) {
            if(nickname[i].equals(str)) {
                break;
            } else if(result[i].equals(strResult)) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}