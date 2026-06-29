import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What operation are you trying to do");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();


        if (input.equals("add")) {
            System.out.println("Addition selected");

            System.out.println("Number 1:");
            int numb1 = scanner.nextInt();

            System.out.println("Number 2:");
            int numb2 = scanner.nextInt();

            System.out.println("Your output is: ");
            System.out.println(numb1 + numb2);


        } else if (input.equals("sub")) {
            System.out.println("Subtraction selected");

            System.out.println("Number 1:");
            int numb1 = scanner.nextInt();

            System.out.println("Number 2:");
            int numb2 = scanner.nextInt();

            System.out.println("Your output is: ");
            System.out.println(numb1 - numb2);


        } else if (input.equals("multiplication")) {
            System.out.println("Multiplication selected");

            System.out.println("Number 1:");
            int numb1 = scanner.nextInt();

            System.out.println("Number 2:");
            int numb2 = scanner.nextInt();

            System.out.println("Your output is: ");
            System.out.println(numb1 * numb2);


        } else if (input.equals("divide")) {
            System.out.println("Division selected");

            System.out.println("Number 1:");
            int numb1 = scanner.nextInt();

            System.out.println("Number 2:");
            int numb2 = scanner.nextInt();

            System.out.println("Your output is: ");
            System.out.println(numb1 / numb2);

        } else {
            System.out.println("Typo, do it how i want you to do it");

        }
    }
}