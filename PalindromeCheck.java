import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int len = str.length();
        String rev = new StringBuilder(str).reverse().toString();

        System.out.println("Length of string: " + len);
        if (str.equalsIgnoreCase(rev))
            System.out.println("String is palindrome.");
        else
            System.out.println("String is not palindrome.");
    }
}
