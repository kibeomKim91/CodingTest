import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[13];
        int b = 0;
        int k = 0;
        int s = 0;
        int v = 0;
        
        for(int i=0; i<51; i++) {
            char ch = sc.next().charAt(0);
            int num = sc.nextInt();
            
            if(ch == 'B') {
                b++;
            } else if(ch == 'K') {
                k++;
            } else if(ch == 'S') {
                s++;
            } else if(ch == 'V') {
                v++;
            }
            
            arr[num-1]++;
        }
        
        if(b == 12) {
            System.out.print("B ");
        } else if(k == 12) {
            System.out.print("K ");
        } else if(s == 12) {
            System.out.print("S ");
        } else if(v == 12) {
            System.out.print("V ");
        }
        
        for(int i=0; i<13; i++) {
            if(arr[i] == 3) {
                System.out.print(i+1);
                break;
            }
        }
    }
    
}