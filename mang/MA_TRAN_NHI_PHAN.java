import java.util.Scanner;

public class MA_TRAN_NHI_PHAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int k=0;
            for(int j=0;j<3;j++)
            {
            int s=sc.nextInt();
            if(s==1) k++;
            }
            if(k>=2) cnt++;
        }
        System.out.println(cnt);
    }
}
