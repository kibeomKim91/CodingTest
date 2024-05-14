import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] monthArr = new int[12];
        int monthArrLength = monthArr.length;
        
        for(int i=0; i<n; i++) {
            int id = sc.nextInt();
            String[] str = sc.next().split("/");
            monthArr[Integer.parseInt(str[1])-1]++;
        }
        
        for(int i=0; i<monthArrLength; i++) {
            System.out.println((i+1)+" "+monthArr[i]);
        }
    }
    
}