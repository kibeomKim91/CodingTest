import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int level = 5;
        String result = "";
        
        for(int i=0; i<n; i++) {
            String ques = sc.next();
            int quesLevel = sc.nextInt();
            
            if(quesLevel < level) {
                result = ques;
                level = quesLevel;
            }
        }
        
        System.out.print(result);
    }
    
}