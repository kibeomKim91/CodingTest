import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[12];
        String str = sc.next();
        
        if(str.contains("I")) {
            arr[0] = 1;
        }
        
        if(str.contains("II")) {
            arr[1] = 2;
        }
        
        if(str.contains("III")) {
            arr[2] = 3;
        }
        
        if(str.contains("IV")) {
            arr[3] = 4;
        }
        
        if(str.contains("V")) {
            arr[4] = 5;
        }
        
        if(str.contains("VI")) {
            arr[5] = 6;
        }
        
        if(str.contains("VII")) {
            arr[6] = 7;
        }
        
        if(str.contains("VIII")) {
            arr[7] = 8;
        }
        
        if(str.contains("IX")) {
            arr[8] = 9;
        }
        
        if(str.contains("X")) {
            arr[9] = 10;
        }
        
        if(str.contains("XI")) {
            arr[10] = 11;
        }
        
        if(str.contains("XII")) {
            arr[11] = 12;
        }
        
        for(int i=0; i<12; i++) {
            if(arr[i]>0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}