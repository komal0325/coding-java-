 import java.util.*;
 public class InputDemo  {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            System.out.println(name);
        }
    }
}
