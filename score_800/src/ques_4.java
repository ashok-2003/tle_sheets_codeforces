import java.io.*;
import java.util.StringTokenizer;

public class ques_4 {
//    https://codeforces.com/problemset/problem/1899/A
    // game with integer
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
            Main.FastReader in=new Main.FastReader();
            Main.FastWriter out = new Main.FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                // so now here is the code so now as we done the tescase here
                // so now here we will take the input of the integer so now here
                int n = in.nextInt();
                // so now after this we have to take
                int ans = n % 3;
                // so now here if the ans is 0 so now here
                if(ans != 0){
                    out.println("First");
                }else{
                    out.println("Second");
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
