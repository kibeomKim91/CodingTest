import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int cow = sc.nextInt();
        int pasta = sc.nextInt();
        int chChoose = sc.nextInt();
        int cowChoose = sc.nextInt();
        int pastaChoose = sc.nextInt();
        int count = 0;
        
        if(ch < chChoose) {
            count += chChoose - ch;
        }
        
        if(cow < cowChoose) {
            count += cowChoose - cow;
        }
        
        if(pasta < pastaChoose) {
            count += pastaChoose - pasta;
        }
        
        System.out.print(count);
    }
    
}