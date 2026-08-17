import java.util.*;

class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

class DrivingLicense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18)
                throw new AgeException("Age not valid for driving license!");
            else
                System.out.println("License successfully accepted!");
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
