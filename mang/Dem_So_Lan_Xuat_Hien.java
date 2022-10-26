import java.util.HashMap;
import java.util.Scanner;

public class Dem_So_Lan_Xuat_Hien {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=1;k<=t;k++)
        {
            int n = sc.nextInt();
            int a[] = new int[100];
            HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                if(hm.containsKey(a[i])) hm.put(a[i],hm.get(a[i])+1);
                else hm.put(a[i], 1);
            }
            System.out.println("Test "+k+":");
            for(int i=0;i<n;i++)
            {
                if(hm.get(a[i])>0)
                {
                    System.out.println(a[i]+" xuat hien "+(hm.get(a[i]))+" lan");
                    hm.put(a[i],-1);
                }
            }
            //System.out.println();
        }
    }
}