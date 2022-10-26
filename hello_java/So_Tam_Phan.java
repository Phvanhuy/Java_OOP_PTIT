// package JAVA_OOP;

import java.util.Scanner;

public class So_Tam_Phan {
    public static boolean Solve(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // xoa bo nho dem trong java
        while(t-- >0){
            String n = sc.nextLine();
            if(Solve(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
