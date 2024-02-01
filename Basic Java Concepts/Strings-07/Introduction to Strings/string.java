import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String name = new String("Manan");
        System.out.println(name);
        String surname = "Jain";
        System.out.println(surname);

        // Printing methods in java
        System.out.println();
        int a = 6;
        float b = 9.3746f;

        System.out.printf("The value of a is %d and value of b is %f",a,b);
        System.out.format("The value of a is %d and value of b is %f",a,b);

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
    }
}
