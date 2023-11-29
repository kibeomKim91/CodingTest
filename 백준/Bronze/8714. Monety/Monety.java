import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int front = 0;
        int back = 0;
        
        for(int i=0; i<str.length; i++) {
            if(str[i].charAt(0) == '0') {
                front++;
            } else {
                back++;
            }
        }
        
        int min = Math.min(front, back);
        bw.write(Integer.toString(min));
        bw.flush();
    }
    
}