import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number 1: ");
        boolean b1 = sc.hasNextInt(); //Check if the input is a number or not
        System.out.println(b1);
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println("Enter your name: ");
        String str = sc.next();
        boolean b2 = sc.hasNext();
        System.out.println(str);
        System.out.println(b2);

        int result = a*b;
        System.out.println(result);
    }
}