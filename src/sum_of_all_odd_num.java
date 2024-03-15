import java.util.Scanner;

public class sum_of_all_odd_num {
    public static int SumOfOddNum(int a){
        int sum =0;
        for (int i = 1;i<=a;i++){
            if (i%2 !=0){
                 sum = sum + i;
            }
        }
        System.out.println("sum of all odd num are :");
        System.out.println(sum);
        return 0;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num to print sum of all odd num b/w 1 to n");
        int a = sc.nextInt();
        SumOfOddNum(a);
    }
}
