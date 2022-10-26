import java.util.Scanner;
import java.util.TreeSet;

public class Hop_Cua_2_Day_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long a[] = new long[100];
        long b[] = new long[100];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextLong();
        }
        for(int i=0;i<m;i++)
        {
            b[i] = sc.nextLong();
        }

        TreeSet<Long> val = new TreeSet<>();
        //TreeSet<Long> val2 = new TreeSet<>();
        for(int i = 0 ; i < n ;i++)
        {
            val.add(a[i]);
        }
        for(int i=0;i<m;i++)
        {
            val.add(b[i]);
        }
        for(long i: val)
        {
            System.out.print(i + " ");
        }
    }
}
