// package JAVA_OOP;


import java.util.Scanner;

public class Tinh_So_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            long val = sc.nextLong();
            long f1=1,f2=1;
            if(val==1 || val==2) System.out.println(1);
            else
            {
                for(int i=3;i<=92;i++)
            {
                long fn=f1+f2;
                if(val==i)
                {
                    System.out.println(fn);
                    break;
                }
                f2=f1;
                f1=fn;
            }
            }
            
        }
    }
}
