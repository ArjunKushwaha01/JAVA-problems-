import java.util.Scanner;

public class eligible_to_vote {
    public static void eligibletoVote(int age){
        if (age >=18){
            System.out.println("you are eligible to vote");
        }else {
            System.out.println("you are not eligible to vote");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input your age");
        int age = sc.nextInt();
        eligibletoVote(age);
    }
}
