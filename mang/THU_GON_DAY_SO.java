import java.util.ArrayList;
import java.util.Scanner;

public class THU_GON_DAY_SO {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        boolean b=true;
        while(b)
        {
            b=false;
            for(int i=0;i<arr.size()-1;i++)
            {
                if((arr.get(i)+arr.get(i+1))%2==0)
                {
                    arr.remove(i);//
                    arr.remove(i);
                    b=true;
                }
            }
            
        }
        System.out.print(arr.size());
    }
}
