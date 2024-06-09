import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int[] arr = new int[26];
        
        while(true) {
            int num = sc.nextInt();
            
            if(num == -1) {
                break;
            }
            
            char ques = sc.next().charAt(0);
            String rightOrWrong = sc.next();
            arr[ques-'A']++;
            
            if(rightOrWrong.equals("right")) {
                sum += num + 20*(arr[ques-'A']-1);
                count++;
            }
        }
        
        System.out.print(count+" "+sum);
    }
    
}