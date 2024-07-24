import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            String str = sc.next();
            int strLength = str.length();
            int[] arr = new int[8];
            
            for(int j=0; j<strLength-2; j++) {
                String triple = str.substring(j, j+3);
                if(triple.equals("TTT")) {
                    arr[0]++;
                } else if(triple.equals("TTH")) {
                    arr[1]++;
                } else if(triple.equals("THT")) {
                    arr[2]++;
                } else if(triple.equals("THH")) {
                    arr[3]++;
                } else if(triple.equals("HTT")) {
                    arr[4]++;
                } else if(triple.equals("HTH")) {
                    arr[5]++;
                } else if(triple.equals("HHT")) {
                    arr[6]++;
                } else if(triple.equals("HHH")) {
                    arr[7]++;
                } 
            }
            
            for(int j=0; j<8; j++) {
                System.out.print(arr[j]+" ");
            }
            
            System.out.println();
        }
    }
    
}