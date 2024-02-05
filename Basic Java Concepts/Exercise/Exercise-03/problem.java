import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write a progran to replace spaces with underscores
        String text = new String("To Lower Case");
        text = text.replace(" ", "_");
        System.out.println(text);

        // If we want that some variable should not be seen in the output or it must be replaced with the user input then we should use "<|anystring|>" to do the function.
        String letter = new String("Dear <|name|>, Thanks a lot");
        String name = sc.next();
        letter = letter.replace("<|name|>",name);
        System.out.println(letter);

        //Write a java program to detect double and triple spaces

        String myString = new String("This string contains  and   triple spaces");
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Write a program to format the following letter using escape sequence characters.
        //letter = "Dear Harry,This Java course is nice.Thanks"

        String myLetter = new String("Dear Harry,\n \t This Java course is nice.\n\tThanks");
        System.out.println(myLetter);
        
    }
}
