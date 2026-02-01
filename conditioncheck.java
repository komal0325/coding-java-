import java.util.*;
public class conditioncheck {
    public static void main (String arg[]){
        Scanner Sc = new Scanner(System.in);
        int x = Sc.nextInt();

        if (x % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }

    }
}
