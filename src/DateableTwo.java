import java.util.Scanner;

public class DateableTwo {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an age: ");
        int myInt = s.nextInt();
        int theirAge = myInt/2+7;
        System.out.println(myInt + "-year olds should date someone who is at least " + theirAge + "-years old");
    }
}
