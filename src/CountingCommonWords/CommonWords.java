package CountingCommonWords;
/*
import java.util.*;
import java.io.*;
import edu.duke.FileResource;


public class CommonWords {

    public String[] getCommon() {
        FileResource resource = new FileResource("common.txt");
        String[] common = new String[20];
        int i = 0;
        for (String s : resource.words()) {
            common[i] = s;
            i++;
        }
        return common;
    }

    public int indexOf(String[] list, String word) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }


    public void countWords(FileResource resource, String[] common, int[] counts) {
        for (String word : resource.words()) {
            int index = indexOf(common, word);
            if (index != -1) {
                counts[index] += 1;
            }
        }

    }


    void Shakespeare() {
        String[] plays = { "caesar.txt", "errors.txt", "hamlet.txt", "likeit.txt", "macbeth.txt",
                "romeoandjuliet.txt" };
        String[] common = getCommon();
        int[] counts = new counts[common.length];
        for (int k = 0; k < plays.length; k++) {
            FileResource resource = new FileResource(plays[k]);
            countWords(resource, common, counts);
            System.out.println("Done with " + plays[k]);
        }
        for (int k = 0; k < common.length; k++) {
            System.out.println(common[k] + "\t" + counts[k]);
        }

    }

    public static void main(String[] args) {
        CommonWords commonwords = new CommonWords();
        commonwords.Shakespeare();
    }

}

*/
