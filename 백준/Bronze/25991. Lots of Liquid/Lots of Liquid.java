import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        double sum = 0.0;
        
        for(int i=0; i<n; i++) {
            double d = Double.parseDouble(arr[i]);
            sum += d*d*d;
        }
        
        double result = Math.cbrt(sum);
        bw.write(Double.toString(result));
        
        bw.flush();
    }
    
}