import java.util.*;
import java.io.*;
public class ques_1 {
    //halumoi boox question
//    https://codeforces.com/problemset/problem/1903/A/
    // same as the orderly queue question on the lettcode
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                // so now if we can reverse the two element then we can reverse the array otherwise
                // we can not  reverse the array here
                int len = in.nextInt();
                int rev = in.nextInt();
                int[] arr = new int[len];
                for (int i = 0; i < len; i++) {
                    arr[i] = in.nextInt();
                }
                if(rev > 1){
                    // so we can sort the array anyway at the end like the bubble and selection sort
                    out.println("yes");
                }else {
                    boolean ans = true;
                    for (int i = 1; i < len; i++) {
                        if(arr[i] < arr[i-1]){
                            ans = false;
                            break;
                        }
                    }
                    // so now here
                    if(ans){
                        out.println("yes");
                    }else{
                        out.println("no");
                    }
                }

            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
