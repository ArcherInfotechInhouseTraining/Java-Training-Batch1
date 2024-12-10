import java.util.Scanner;

class CondenseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem, sum = 0;

        System.out.println("Enter the number: ");
        int no = sc.nextInt();

        // Handle the case when the input number is 0
        if (no == 0) {
            System.out.println("Sum is 0");
            return;
        }

        // Process the number until a single-digit sum is obtained
        while (no > 0 && sum > 9) {
            if (no == 0) {
                no = sum;
                sum = 0;
            }
            rem = no % 10;
            sum += rem;
            no /= 10;
        }

        System.out.println("Sum is " + sum);
    }
}
