import java.util.Scanner;

public class display_the_count_of_positive_negative_zeros {
    public static void main(String [] args){
        int positive = 0;
        int negative = 0;
        int  zeros = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 to continue or 0 to stop");

        int input = sc.nextInt();
        while (input ==1){
            System.out.println("enter you number");
            int num = sc.nextInt();
            if (num > 0){
                positive++;
            } else if (num < 0) {
                negative++;
            }else {
                zeros++;
            }
            System.out.println("press 1 to continue or 0 to stop");
             input = sc.nextInt();
        }
        System.out.println("positive count :" + positive );
        System.out.println("negative count :" + negative);
        System.out.println("zeros count :" + zeros);
    }
}
