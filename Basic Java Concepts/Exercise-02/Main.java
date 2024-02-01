//Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the corrcet grade
public class Main {
    public static void main(String[] args) {
        //Encryption
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        //Decryption
        grade = (char)(grade-8);
        System.out.println(grade);
    }
}

