/*
 * Play a lottery game with the user, reading the user's numbers and printing
 * how many matched.
 */
package javacollectionsframework.Sets;

import java.io.*;
import java.util.*;

/**
 *
 * @author donny
 */
public class Lottery {
    public static final int NUMBERS = 6;
    public static final int MAX_NUMBER = 40;
    public static final int PRIZE = 100;

    public static void main(String[] argsStrings) throws FileNotFoundException {

        //get winning number and ticket set
        Set<Integer> winning = createWinningNumbers();
        Set<Integer> ticket =  getTicket();
        System.out.println();
        
        //keep only winning numbers from user's ticket
        Set<Integer> matches = new TreeSet<>(ticket);
        matches.retainAll(winning);
        
        //print out results
        System.out.println("Your ticket was: " + ticket);
        System.out.println("The winning numbers were: " + winning);
        if (matches.size() > 0){
            double prize = 100 * Math.pow(2, matches.size());
            System.out.println("Matched numbers: " + matches);
            System.out.printf("Your prize is $%.2f\n", prize);
        }
        
    }
    
    //generate a set of winning lotto numbers
    public static Set<Integer> createWinningNumbers(){
        Set<Integer> winning = new TreeSet<>();
        Random r = new Random();
        while (winning.size() < NUMBERS){
            int number = r.nextInt(MAX_NUMBER) + 1;
            winning.add(number);
        }
        return winning;
    }
    
    //reads the player's lottery ticket from the console
    public static Set<Integer> getTicket(){
        Set<Integer> ticket = new TreeSet<>();
        Scanner console = new Scanner(System.in);
        System.out.println("Type " + NUMBERS + " lotto numbers: ");
        while (ticket.size() < NUMBERS){
            int number = console.nextInt();
            ticket.add(number);            
        }
        return ticket;
    }
}
