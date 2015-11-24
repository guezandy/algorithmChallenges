import java.util.*;
public class Solution {

    public static class Swap {
        public int distance;
        public int index1;
        public int index2;

        public Swap() {
            this.distance = 0;
            this.index1 = -1;
            this.index2 = -1;
        }
        public Swap(int i1, int i2, int dis) {
            this.index1 = i1;
            this.index2 = i2;
            this.distance = distance;
        }
    }

   public static String permute(String s) {
        List<Swap> possible_swaps = new ArrayList<Swap>();
        //System.out.println("Swap distance: "+ swap.distance);
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                System.out.println(i+" "+j+" "+s.charAt(i) + " "+s.charAt(j)+" "+ (s.charAt(j)-s.charAt(i)));
                int distance = (s.charAt(j) - s.charAt(i));
                if(distance > 0) {
                    Swap swap = new Swap();
                    swap.distance = distance;
                    swap.index2 = j;
                    swap.index1 = i;
                    possible_swaps.add(swap);
                }
            }
        }
        //System.out.println("Swap distance: "+ swap.distance);
        if(possible_swaps.size() > 0) {
            StringBuilder sb = new StringBuilder(s);
            //char temp = s.charAt(swap.index1);
            //sb.setCharAt(swap.index1, s.charAt(swap.index2));
            //sb.setCharAt(swap.index2, temp);
            return sb.toString();
        }
        return null;
   }    
   
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    while(T>0) {
        String test = scanner.next();
        String ans = permute(test);
        System.out.println((ans == null ? "no answer" : ans));
        T--;
    }
  }    
}
