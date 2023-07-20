public class p13_String_Compression {

    public static String strCompression(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr.append(currentChar);

            if (count > 1) {
                newStr.append(count);
            }
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbcccdde";
        String strComp = strCompression(str);
        System.out.println(strComp); // Output: a3b3c3de2
    }
}