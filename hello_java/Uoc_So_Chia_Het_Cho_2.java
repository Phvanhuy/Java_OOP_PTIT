import java.util.Scanner;
import java.lang.Math;

public class Uoc_So_Chia_Het_Cho_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int val = sc.nextInt();
            int dem=0;
            for(int i=1;i<Math.sqrt(val);i++)
            {
                if(val%i==0)
                {
                    if(i%2==0) dem++;
                    if((val/i)%2==0) dem++;
                }
                
            }
            double a= Math.sqrt(val);
            int b = (int) a;
            if(b*b==val){
                if(b%2==0) dem++;
            }

            System.out.println(dem);
        }
    }
}
