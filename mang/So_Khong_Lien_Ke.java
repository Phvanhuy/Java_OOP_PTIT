import java.util.Scanner;

public class So_Khong_Lien_Ke {
    // private static int j;

    // /**
    //  * @param n
    //  * @return
    //  */
    public static boolean solve(Long n)
    {
        int i=0;
        long a[] = new long[18];
        while(n>0)
        {
            a[i]=n%10;
             i++;
            n/=10;
        }
        int sum=0;
        for(int j=i-1;j>0;j--)
        {
            sum+= a[j];
            if(a[j]-a[j-1]!=2 && a[j-1]-a[j]!=2) return false;
        }
        sum+=a[0];
        if(sum%10==0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while(t-- >0)
        {
            long val = sc.nextLong();
            if(solve(val)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
