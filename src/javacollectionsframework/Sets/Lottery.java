/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsframework.Sets;

import java.io.*;
import java.util.*;

/**
 *
 * @author donny
 */
public class Lottery {
    
    public static void main (String[] argsStrings) throws FileNotFoundException {
        
        Set<String> words = new HashSet<>();
        Scanner in = new Scanner(new File("C:\\Users\\donny\\Documents\\NetBeansProjects\\JavaCollectionsFramework\\src\\javacollectionsframework\\Sets\\mobydick.txt"));
        while (in.hasNext()) {
            String word = in.next();
            word = word.toLowerCase();
            words.add(word);
        }
        System.out.println("Number of unique words = " + words.size());
    }
}
