public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            // checks ASCII num to check if uppercase letter 
            // and adds 32 to make it lowercase, using ASCII.
            if (ch > 64 && ch < 91){
                ch += 32;
                str = str.substring(0, i) + (char) ch + str.substring(i + 1);
            } else {
                continue;
            }
        } 
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {

        for (int i = 0; i <= str1.length() -str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)){
                boolean equal = true;
                for (int j = 1; j < str2.length(); j++) {
                    if (str1.charAt(i + j) != str2.charAt(j)){
                        equal = false;
                        break;
                    } 
                }
            if (equal){
                    return true;
            }
        }
    }

        return false;
    }
}