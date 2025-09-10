import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an age:");
        int myInt = s.nextInt();
        int totalPages = 100-myInt;
        System.out.println(myInt + "-year old should read at least " + totalPages + " pages until you give up on a book");
    }
}
