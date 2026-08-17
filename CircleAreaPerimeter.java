import java.util.Scanner;

class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = 3.14 * r * r;
        double perimeter = 2 * 3.14 * r;

        System.out.println("Area of Circle = " + area);
        System.out.println("Perimeter of Circle = " + perimeter);
    }
}

