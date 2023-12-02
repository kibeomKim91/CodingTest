import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            String str = br.readLine();
            int strLength = str.length();
            int sum = 0;
            
            for(int j=0; j<strLength; j++) {
                char ch = str.charAt(j);
                
                if(ch == 'I') {
                    sum++;
                } else if(ch == 'V') {
                    sum += 5;
                } else if(ch == 'X') {
                    sum += 10;
                } else if(ch == 'L') {
                    sum += 50;
                } else if(ch == 'C') {
                    sum += 100;
                } else if(ch == 'D') {
                    sum += 500;
                } else if(ch == 'M') {
                    sum += 1000;
                } 
            }
            
            bw.write(sum+"\n");
        }
        
        bw.flush();
    }
    
}