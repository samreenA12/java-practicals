import java.util.*;

class OddNumberException extends Exception {
    OddNumberException(String msg) {
        super(msg);
    }
}

class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 0)
                throw new NegativeNumberException("Negative number entered!");
            else if (num % 2 != 0)
                throw new OddNumberException("Odd number entered!");
            else
                System.out.println("Even number entered successfully!");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
