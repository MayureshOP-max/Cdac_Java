package day3;

public class Count {
    public static String countChar(String str) {
        int upper = 0;
        int lower = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else
                special+=1;
        }
        return "Lower: " + lower + " Upper: " + upper + " Special: " + special;
    }
    public static void main(String[] args) {
        String str = "#GeeKs01fOr@gEEks07";
            System.out.println(countChar(str));

        }

    }

