import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a description of WordLengths here.
 *
 * @author (your name)Shireen Ghazala
 * @version (a version number or a date)12/28
 */

public class WordLengths {
    public void countWordLengths(String [] words, int[] counts){
        for(String word : words){
            word = word.toLowerCase();
            for (int i=1; i<=30; i++){
                int length = word.length();
                if(word.endsWith(".") || word.endsWith(",")){
                    length -= 1;
                } else if ( word.endsWith("\"") || word.startsWith("\"")){
                    length -= 2;
                }


                if(length>=1 && length<=30){
                    counts[length]+=1;
                } else if(length >30){
                    counts[31]+=1;
                }
            }
        }



    }

    public int indexOfMax(int[] values){
        //returns the index position of largest element in values.
        int maxIndex = values[1];
        int index = 0;
        for(int i=1; i<31; i++){
            if(values[i] > maxIndex){
                maxIndex = values[i];
                index = i;
            }

        }
        return index;

    }

    void testCountWordLengths(){

         // Replace with your file path

        // Approach 1: Using BufferedReader
        try(BufferedReader br = new BufferedReader(new FileReader("C:/Users/shire/IdeaProjects/DukeLabs/src/smallHamlet"))) {
            List<String> words = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("\\s+"); // Split by whitespace
                words.addAll(Arrays.asList(lineWords));
            }

            // Convert List to array
            String[] wordArray = words.toArray(new String[0]);
            int[] counts = new int[31];

            countWordLengths(wordArray, counts);

        int index = indexOfMax(counts);
        System.out.println(index);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}

