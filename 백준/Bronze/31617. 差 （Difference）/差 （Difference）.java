import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int[] aa = new int[a];
        int count = 0;
        
        for(int i=0; i<a; i++) {
            aa[i] = sc.nextInt();
        }
        
        int b = sc.nextInt();
        int[] bb = new int[b];
        
        for(int i=0; i<b; i++) {
            bb[i] = sc.nextInt();
        }
        
        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                if(aa[i]+k == bb[j]) {
                    count++;
                }
            }
        }
        
        System.out.print(count);
    }
    
}