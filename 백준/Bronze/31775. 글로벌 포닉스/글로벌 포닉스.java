import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        
        for(int i=0; i<3; i++) {
            char ch = sc.next().charAt(0);
            if(ch=='l') {
                arr[0]++;
            } else if(ch=='k') {
                arr[1]++;
            } else if(ch=='p') {
                arr[2]++;
            }
        }
        
        if(arr[0]==1 && arr[1]==1 && arr[2]==1) {
            System.out.print("GLOBAL");
        } else {
            System.out.print("PONIX");
        }
    }
    
}