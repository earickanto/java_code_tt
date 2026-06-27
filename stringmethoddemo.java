

public class stringmethoddemo {
    public static void main(String[] args){

        String str = " Hello Java Mapiee ";
        String str2 = "Hello Java Mapiee";

        System.out.println("String: " + str);

       
        System.out.println("\n1. length()");
        System.out.println("Length = " + str.length());

      
        System.out.println("\n2. charAt()");
        System.out.println("Character at index 2 = " + str.charAt(2));

       
        System.out.println("\n3. substring()");
        System.out.println("Substring(2,7) = " + str.substring(2, 7));

        System.out.println("\n4. trim()");
        System.out.println("After trim = " + str.trim());

   
        System.out.println("\n5. equals()");
        System.out.println("str.trim().equals(str2) = " + str.trim().equals(str2));

   
        System.out.println("\n6. equalsIgnoreCase()");
        System.out.println("hello.equalsIgnoreCase(HELLO) = "
                + "hello".equalsIgnoreCase("HELLO"));

        
        System.out.println("\n7. toUpperCase()");
        System.out.println(str.toUpperCase());

      
        System.out.println("\n8. toLowerCase()");
        System.out.println(str.toLowerCase());

        System.out.println("\n9. contains()");
        System.out.println("Contains 'Java' = " + str.contains("Java"));

        
        System.out.println("\n10. replace()");
        System.out.println(str.replace("Java", "Python"));
    }
}
