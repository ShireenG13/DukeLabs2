import java.util.Objects;


/**
 * Write a description of WordPlay here.
 *
 * @author (Shireen Ghazala)
 * @version (12/27/2024)
 */

class WordPlay {
    public boolean isVowel(char ch) {
        StringBuilder vowels = new StringBuilder("aeiou");
        boolean isvowel = false;
        for (int i = 0; i < vowels.length(); i++) {

            char currChar = vowels.charAt(i);
            if (Character.toLowerCase(ch) == currChar) {
                isvowel = true;

            }
        }
        return isvowel;

    }

    public String replaceVowels(String phrase, char ch) {
        StringBuilder str = new StringBuilder(phrase);
        StringBuilder vowels = new StringBuilder("aeiou");

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            for (int j = 0; j < vowels.length(); j++) {
                char currVowel = vowels.charAt(j);

                if (currChar == currVowel || currChar == Character.toUpperCase(currVowel)) {
                    str.setCharAt(i, ch);
                }
            }
        }
        return str.toString();
    }

    public String emphasize(String phrase, char ch) {
        StringBuffer str = new StringBuffer(phrase);
        for (int i = 0; i < phrase.length(); i++) {
            char currChar = str.charAt(i);

            if (currChar == ch || currChar == Character.toUpperCase(ch)) {
                if (i == 0) {
                    str.setCharAt(i, '*');

                } else if ((i != 0) && (i % 2 == 0)) {
                    str.setCharAt(i, '*');
                } else if ((i != 0) && (i % 2 > 0)) {
                    str.setCharAt(i, '+');
                }

            }

        }
        return str.toString();

    }






}



/*
class WordPlay {
    public boolean isVowel(char ch) {
        StringBuilder vowels = new StringBuilder("aeiou");

        for (int i = 0; i < vowels.length(); i++) {

            char currChar = vowels.charAt(i);
            if (Objects.equals(Character.toLowerCase(ch), currChar)) {
                return true;

            }

        }
        return false;
    }

    public String replaceVowels(String phrase, char ch) {
        StringBuilder str = new StringBuilder(phrase);
        StringBuilder vowels = new StringBuilder("aeiou");

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            for(int j=0; j<vowels.length(); j++){
                char currVowel = vowels.charAt(j);

                if (currChar == currVowel  || currChar == Character.toUpperCase(currVowel))  {
                    str.setCharAt(i, ch);
                }
            }
        }
        return str.toString();
    }

    public String emphasize(String phrase, char ch) {
        StringBuffer str = new StringBuffer(phrase);
        for (int i = 0; i < phrase.length(); i++) {
            char currChar = str.charAt(i);

            if (currChar == ch || currChar == Character.toUpperCase(ch)) {
                if (i == 0) {
                    str.setCharAt(i, '*');

                } else if ((i != 0) && (i % 2 == 0)) {
                    str.setCharAt(i, '*');
                } else if ((i != 0) && (i % 2 > 0)) {
                    str.setCharAt(i, '+');
                }

            }

        }
        return str.toString();

    }



}
*/





