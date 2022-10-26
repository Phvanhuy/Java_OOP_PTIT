// package JAVA_OOP;

import java.util.Scanner;

public class Tong_Giai_Thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0,a=1;
        for(int i=1;i<=n;i++){
            a*=i;
            sum+=a;
        }
        System.out.println(sum);
    }
}
