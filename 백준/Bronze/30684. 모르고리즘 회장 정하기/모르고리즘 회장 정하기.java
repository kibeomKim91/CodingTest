import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        int first = 26;
        int second = 26;
        int third = 26;
        
        for(int i=0; i<n; i++) {
            String name = sc.next();
            int nameLength = name.length();
            
            if(nameLength==3) {
                char firstCh = name.charAt(0);
                char secondCh = name.charAt(1);
                char thirdCh = name.charAt(2);
                
                if(firstCh-'A'<first) {
                    first = firstCh-'A';
                    second = secondCh-'A';
                    third = thirdCh-'A';
                    result = name;
                } else if(firstCh-'A'==first) {
                    if(secondCh-'A'<second) {
                        second = secondCh-'A';
                        third = thirdCh-'A';
                        result = name;
                    } else if(secondCh-'A'==second) {
                        if(thirdCh-'A'<third) {
                            third = thirdCh-'A';
                            result = name;
                        }
                    }
                }
            }           
        }
        
        System.out.print(result);
    }
    
}