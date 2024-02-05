public class string {
    public static void main(String[] args) {
        String name = new String("Manan");
        String value = name.trim();
        System.out.println(value);

        String nonTrimmedString = new String("        Manan          ");
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        String subString = new String("Manan is a very awesome boy");
        String value2 = subString.substring(2,3);
        System.out.println(value2);

        String replace = new String("Manan");
        String replaced = replace.replace('a',' ');
        System.out.println(replaced);

        String startsith = new String("Manan");
        boolean start = startsith.startsWith("Ma");
        System.out.println(start);

        String chat = new String("Drake");
        // int chats = chat.charAt(1);
        System.out.println(chat.charAt(0));

        String manan = new String("anita");
        int max = manan.indexOf("a");
        System.out.println(max);

        String anita = new String("Manan");
        int wynn = anita.indexOf("n",3);
        System.out.println(wynn);

        String bablu = new String("Bestudis");
        System.out.println(bablu.lastIndexOf("s"));

        String namez = new String("manan Jain");
        System.out.println(namez.equalsIgnoreCase("Manan Jain"));
    }
}