import java.util.Scanner;

public class QUAY_PHAI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            long a[]=new long[100];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            int check=0;
            for(int i=1;i<n;i++)
            {
                if(a[i]<a[i-1]){
                    check=1;
                    System.out.println(i);
                    break;
                }
            }
            if(check==0) System.out.println(0);
        }
        
    }
}
