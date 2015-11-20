import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    private static void debug(Object... args) {
        System.out.println(Arrays.deepToString(args));
    }

    public static void main(String[] rags) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String ana = br.readLine();
            int N = ana.length();
            if(N%2==1) {
                System.out.println(-1);
                continue;
            }
            int[]f1=new int[26];
            for(int i=0;i<N/2;i++) f1[ana.charAt(i)-'a']++;
            for(int i=N/2;i<N;i++) f1[ana.charAt(i)-'a']--;
            int all=0;
            for(int i=0;i<26;i++) {
                all+=Math.abs(f1[i]);
            }
            //if(all % 2 == 1)debug("hmm");
            System.out.println(all/2);
        } 
    }
}
