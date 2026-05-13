public class StringDemo {
    public static void main(String[] args) {

        String s = "  Hello World  ";
        String s2 = "Java";

        // length()
        System.out.println("Length: " + s.length());

        // trim()
        System.out.println("Trimmed: '" + s.trim() + "'");

        // toUpperCase()
        System.out.println("Uppercase: " + s.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + s.toLowerCase());

        // substring()
        System.out.println("Substring(2): " + s.substring(2));
        System.out.println("Substring(2, 7): " + s.substring(2, 7));

        // indexOf()
        System.out.println("Index of 'o': " + s.indexOf('o'));
        System.out.println("Index of 'o' from position 5: " + s.indexOf('o', 5));

        // charAt()
        System.out.println("Character at index 4: " + s.charAt(4));

        // concat()
        System.out.println("Concatenation: " + s2.concat(" Programming"));

        // replace()
        System.out.println("Replace 'l' with 'x': " + s.replace('l', 'x'));

        // equals()
        System.out.println("Equals 'Java'? " + s2.equals("Java"));

        // startsWith() and endsWith()
        System.out.println("Starts with 'He'? " + s.trim().startsWith("He"));
        System.out.println("Ends with 'ld'? " + s.trim().endsWith("ld"));
    }
}