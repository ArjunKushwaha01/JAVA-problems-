import java.util.Scanner;

public class calculate_circumference_of_a_circle_using_function {
    public static void CircumferenceOfaCircle(int r){
        System.out.println("the circumference of a circle is :");
        System.out.println((int) (2*3.14*r));
        return;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the radius to find circumference of a circle :");
        int a = sc.nextInt();
        CircumferenceOfaCircle(a);
    }
}
