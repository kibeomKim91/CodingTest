import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int sum = 0;
        
        for(int i=0; i<str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }
        
        bw.write(Integer.toString(sum));
        bw.flush();
    }
    
}