import java.util.Scanner;
import java.util.TreeSet;

public class Bo_Sung_Day_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<Integer>();
        int a[] = new int[100];
        int cmax=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            set.add(a[i]);
            cmax=Math.max(cmax, a[i]);
        }
        if(cmax==set.size()) System.out.println("Excellent!");
        else{
            for(int i=1;i<=cmax;i++)
            {
                if(!set.contains(i)) System.out.println(i);
            }
        }
        
    }
}
