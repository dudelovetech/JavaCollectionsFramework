/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author donny
 */
public class WordCount {

    public static void main(String[] args) {
        Map<Integer, String> ssnMap = new HashMap<>();

        ssnMap.put(867530915, "Jenny");
        ssnMap.put(239876305, "Bin");
        ssnMap.put(504386382, "Donny");

        Set<Integer> ssnSet = ssnMap.keySet();
        for (int ssn : ssnSet) {
            System.out.println("SSN: " + ssn);
        }

        for (Map.Entry<Integer, String> entry : ssnMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("SSN: " + key + "/" + "name: " + value);
        }

        Collection<String> names = ssnMap.values();
        for (String name : names) {
            System.out.println("name: " + name);
        }

        System.out.println(ssnMap);
    }
}
