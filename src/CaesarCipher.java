public class CaesarCipher {
    public String encrypt(String input, int key) {
        StringBuilder encr = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetSm = "abcdefghijklmnopqrstuvwxyz";
        String shiftedA = alphabet.substring(key) + alphabet.substring(0, key);
        String shiftedAlSm = alphabetSm.substring(key) + alphabetSm.substring(0, key);
        for (int i = 0; i < encr.length(); i++) {

            char currChar = encr.charAt(i);
            if (Character.toUpperCase(currChar) == currChar) {

                int idx = alphabet.indexOf(currChar);
                if (idx != -1) {
                    encr.setCharAt(i, shiftedA.charAt(idx));
                }
            } else if (Character.toLowerCase(currChar) == currChar) {
                int idx = alphabetSm.indexOf(currChar);
                if (idx != -1) {
                    encr.setCharAt(i, shiftedAlSm.charAt(idx));
                }
            }
        }
        return encr.toString();
    }

    /*public void testCaesar() {
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println("key is " + key + "\n" + encrypted);
    }
    */

    public String encryptTwoKeys(String input, int key1, int key2) {
        StringBuffer encrypted = new StringBuffer(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetSm = "abcdefghijklmnopqrstuvwxyz";
        String shiftedALPHA1 = alphabet.substring(key1) + alphabet.substring(0, key1);
        String shiftedAlSm1 = alphabetSm.substring(key1) + alphabetSm.substring(0, key1);
        String shiftedALPHA2 = alphabet.substring(key2) + alphabet.substring(0, key2);
        String shiftedAlSm2 = alphabetSm.substring(key2) + alphabetSm.substring(0, key2);
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            if (i == 0 || i % 2 == 0) {
                if (Character.toUpperCase(currChar) == currChar) {

                    int idx = alphabet.indexOf(currChar);
                    if (idx != -1) {
                        encrypted.setCharAt(i, shiftedALPHA1.charAt(idx));
                    }
                } else if (Character.toLowerCase(currChar) == currChar) {
                    int idx = alphabetSm.indexOf(currChar);
                    if (idx != -1) {
                        encrypted.setCharAt(i, shiftedAlSm1.charAt(idx));
                    }
                }
            } else if (i % 2 > 0) {
                if (Character.toUpperCase(currChar) == currChar) {

                    int idx = alphabet.indexOf(currChar);
                    if (idx != -1) {
                        encrypted.setCharAt(i, shiftedALPHA2.charAt(idx));
                    }
                } else if (Character.toLowerCase(currChar) == currChar) {
                    int idx = alphabetSm.indexOf(currChar);
                    if (idx != -1) {
                        encrypted.setCharAt(i, shiftedAlSm2.charAt(idx));
                    }
                }

            }

        }
        return encrypted.toString();
    }
}
