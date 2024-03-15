import java.util.Scanner;

public class Average_num_using_fun_with_user_input {
    public static int AverageOf3Num(int a,int b,int c) {
        int sum = a + b + c;
        int average = sum / 3;
        System.out.println("The average is :");
        System.out.println(average);
        return  0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first num");
        int a = sc.nextInt();
        System.out.println("enter the second num");
        int b = sc.nextInt();
        System.out.println("enter the first num");
        int c = sc.nextInt();
        AverageOf3Num(a,b,c);
    }
}