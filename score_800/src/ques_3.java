import java.io.*;
import java.util.StringTokenizer;

public class ques_3 {
//    https://codeforces.com/problemset/problem/1900/A
    // cover in water
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
                // so now here we have to get the number of or length of the char here
                int n = in.nextInt();
                String s = in.nextLine();
                // so now i think it should input the whole line here
                char[] str = s.toCharArray();
                // so now here in the array we have to check for it
                int ans = 0;
                int count = 0;
                int totalcount = 0;
                // so now here we according to the question if we get some where ... or more than we just only need
                // the 2 containers to get it all filled otherwise total . is the main answer here
                // so now here using the for loop we are count both here
                for (int i = 0; i < n; i++) {
                    if(str[i] == '.'){
                        // so now it means we have to increases the answer here
                        ans++;
                        count++;
                    }else{
                        // so now here we have get blocked here so now here we have to take the max of count
                        totalcount = Math.max(totalcount , count);
                        // so now here we have get the max here
                        count = 0;
                        // so now reseting the count here
                    }
                }
                // so now here after all of this here if the toatl count
                totalcount = Math.max(count , totalcount);
                // this for the case if all of them is ... so for that case here
                if(totalcount > 2){
                    ans = 2;
                }
                // so now otherwise if it is less then just print the all of this here
                out.println(ans);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
