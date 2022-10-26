// package JAVA_OOP;

import java.util.Scanner;

public class So_Lien_Ke {
    public static long solve(long n){
        long a=n%10;
        n/=10;
        long b;
        while(n>0){
            b=n%10;
            if(a!=b-1 && a!=b+1) return 0;
            a=b;
            n/=10;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long N = sc.nextLong();
            if(solve(N)==1) System.out.println("YES");
            else System.out.println("NO");
        } 
    }
}
