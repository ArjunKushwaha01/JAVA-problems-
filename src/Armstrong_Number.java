import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a 3 digit number");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (num>0){
            sum = sum + (num%10)*(num%10)*(num%10);
            num = num/10;
        }
        if (sum==temp){
            System.out.println("its an armstrong number");
        }else {
            System.out.println("its not an armstrong number");
        }
    }
}
