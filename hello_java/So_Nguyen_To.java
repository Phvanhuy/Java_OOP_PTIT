// package JAVA_OOP;

import java.util.Scanner;

public class So_Nguyen_To {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int val = sc.nextInt();
            int check=0;
            if(val<2)
            {
                System.out.println("NO");
            }
            else
            {
                for(int i=2;i<=Math.sqrt(val);i++)
                {
                    if(val%i==0)
                    {
                        System.out.println("NO");
                        check=1;
                        break;
                    }
                }
                if(check==0) System.out.println("YES");
            }
        }
    }
}
