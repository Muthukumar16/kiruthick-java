class StringManipulator {
    // Method to find and print the frequency of a character in a string
    void check(String str, char ch) {
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                frequency++;
            }
        }
        System.out.println("Number of '" + ch + "' present is = " + frequency);
    }

    // Method to display only vowels from a string after converting it to lowercase
    void check(String s1) {
        s1 = s1.toLowerCase();
        System.out.print("Vowels in the string: ");
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        // Example 1: Find the frequency of 's' in the string
        String str = "success";
        char ch = 's';
        manipulator.check(str, ch);

        // Example 2: Display vowels in the string "computer"
        String s1 = "computer";
        manipulator.check(s1);
    }
}
