/*
 *Uses a linked list to implement the sieve of
 *Eratosthenes algorithm for finding prime numbers.
 */
package javacollectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author donny
 */
public class Sieve {
    public static void main(String[] args) {
        //display all numbers to be processed
        System.out.println("This program will tell you all prime");
        System.out.println("numbers up to a given maximum.");
        System.out.println();
        
        Scanner console = new Scanner(System.in);
        System.out.println("What's the maximum number? ");
        int max = console.nextInt();
        // TODO: call Sieve method  
        List<Integer> primes = Sieve(max);
        System.out.println("Prime numbers up to " + max + ":");
        System.out.println(primes);
    }
    
    // Returns a list of all prime numbers up to given max
    // using the sieve of Eratorsthenes algorithm.
    private static List<Integer> Sieve(int maxNum){
        List<Integer> numbersToProcess = new LinkedList<>();
        // add all numbers from 2 to max to list
        for (int i = 2; i <= maxNum;  i ++){
            numbersToProcess.add(i);
        }
        
        List<Integer> primes = new LinkedList<>();
        
        while(!numbersToProcess.isEmpty()){
            int firstEle = numbersToProcess.remove(0);
            primes.add(firstEle);
            
            Iterator<Integer> itr = numbersToProcess.iterator();
            while (itr.hasNext()){
                int current = itr.next();
                if (current % firstEle == 0){
                    itr.remove();
                }
            }
            
        }
        return primes;
    }
}
