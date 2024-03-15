import java.util.Scanner;

public class Find_factorial {
        public static void printfactorial(int a) {//camel case
            if (a<0){
                System.out.println("invalid num");
                return;
            }
            int fact = 1;
            for (int i = a;i>=1;i--){
                fact = fact*i;
            }
            System.out.println("the factorial is :");

            System.out.println(fact);
            return  ;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int a = sc.nextInt();
            printfactorial(a);


        }
    }

