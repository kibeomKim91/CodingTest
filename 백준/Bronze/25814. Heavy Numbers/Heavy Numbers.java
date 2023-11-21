import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] arr = str.split(" ");
        int nLength = arr[0].length();
        int mLength = arr[1].length();
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);        
        int nSum = 0;
        int mSum = 0;
        
        while(n>0 || m>0) {
            nSum += n%10;
            mSum += m%10;
            
            n /= 10;
            m /= 10;
        }
        
        if(nLength * nSum > mLength * mSum) {
            bw.write("1");
        } else if(nLength * nSum == mLength * mSum) {
            bw.write("0");
        } else {
            bw.write("2");
        }
        
        bw.flush();
    }
    
}