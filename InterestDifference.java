import java.util.Scanner;

class InterestDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double P = sc.nextDouble();

        double R = 10; // 10% rate
        double T = 3;  // 3 years

        double SI = (P * R * T) / 100;
        double A = P * Math.pow((1 + (R / 100)), T);
        double CI = A - P;
        double diff = CI - SI;

        System.out.println("Simple Interest = " + SI);
        System.out.println("Compound Interest = " + CI);
        System.out.println("Difference = " + diff);
    }
}
