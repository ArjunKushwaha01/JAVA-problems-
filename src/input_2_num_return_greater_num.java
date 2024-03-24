import java.util.Arrays;
import java.util.Scanner;

public class input_2_num_return_greater_num {
    public static void greaternum(int a,int b){
        System.out.println("the greater value is :");
        if (a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value");
        int a = sc.nextInt();
        System.out.println("enter the second value");
        int b = sc.nextInt();
        greaternum(a,b);
    }
}
