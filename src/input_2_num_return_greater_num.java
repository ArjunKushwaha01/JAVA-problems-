import java.util.Arrays;
import java.util.Scanner;

public class input_2_num_return_greater_num {
    public static void greaternum(int a,int b){
        int n [] = {a,b};
        System.out.println(Arrays.stream(n).max());
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaternum(a,b);
    }
}
