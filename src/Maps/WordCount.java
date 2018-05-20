/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author donny
 */
public class WordCount {

    // minimum number of occurrences needed to be printed
    public static final int OCCURRENCES = 100;
    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("This program displays the most");
        System.out.println("frequently occurring words from");
        System.out.println("the book Moby Dick.");
        System.out.println();
        
        // read the book into a map
        Scanner in = new Scanner(new File("C:\\Users\\donny\\Documents\\NetBeansProjects\\JavaCollectionsFramework\\src\\Maps\\mobydick.txt"));
        Map<String, Integer> wordCountMap = getCountMap(in);
        
        for (String word: wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            if (count > OCCURRENCES) {
                System.out.println(word + " occurs " + count + " times.");
            }
        }
    }

    // Reads book text and returns a map from words to counts.
    private static Map<String, Integer> getCountMap(Scanner in) {
        Map<String, Integer> wordCountMap = new TreeMap<>();
        
        while(in.hasNext()) {
            String word = in.next().toLowerCase();
            if (!wordCountMap.containsKey(word)) {
                // never seen this word before
                wordCountMap.put(word, 1);
            } else {
                // seen this word before; increment count
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            }
        }
        return wordCountMap;
    }
}
