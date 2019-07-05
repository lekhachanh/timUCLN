public class GreateCommonFactor {
    public static void main(String[] args) {
        int a, b;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter first number: ");
        a = input.nextInt();
        System.out.println("Enter second number: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Greatest common factor" + (a + b));
        }
        if (a != b) {
            if (a > b) a = a -b;
            else b = b - a;
        }
        System.out.println("Greatest common factor: " + a);

    }
}
