import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int temp = num;
        int rev=0;
        while (num>0){
            rev = rev*10 + num%10;
            num = num / 10;
        }
        if (temp == rev){
            System.out.println("it is a palindrome");
        }else {
            System.out.println("it is not a palindrome");
        }
    }
}
