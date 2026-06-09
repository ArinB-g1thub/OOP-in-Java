public class StringImmutabilityDemo{
    public static void main (String[] args) {

        String str = "Hello";   /// store in SCP

        System.out.println("Original String; " + str);
        System.out.println("Memory Address Before; " + System.identityHashCode(str));

        // Attempt to modify the string
        str.concat (" World");

        System.out.println(" \nAfter concat () without assignment; ");
        System.out.println("String: " + str);
        System.out.println("Memory Address: " + System.identityHashCode(str));

        // Assigning the result to str
        str = str.concat (" World");

        System.out.println(" \nAfter concat () with assignment; ");
        System.out.println("String: " + str);
        System.out.println("Memory Address After: " + System.identityHashCode(str));
    }
}