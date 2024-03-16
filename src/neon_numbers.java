import java.util.Scanner;

public class neon_numbers {
    public static void neon(int a){
        int sq = (a*a);
        int sum = 0;

        while (sq>0){
            int rem = sq %10;
            sum = sum + rem;
            sq = sq / 10;
        }
        if (sum ==a){
            System.out.println("it is a neon number");
        }else {
            System.out.println("it is not a neon num");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        neon(num);
    }
}

// example
/*
   9 -->(9)^2 = 81
   ---> 8+1=9
   so
   9 = 9 (neon number)
 */