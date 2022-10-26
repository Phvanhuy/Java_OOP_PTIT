// package JAVA_OOP;

import java.util.Scanner;

public class Tinh_Luy_Thua {
    private static long Mod=1000000000+7;
    public static long solve(long a,long b){
        if(b==0) return 1;
        long huy= solve(a,b/2);
        if(b%2==0) return (huy * huy) % Mod;
        else return (a * ((huy * huy) % Mod)) % Mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==0 && b==0) break;
            System.out.println(solve(a,b));
        }
    }
}
