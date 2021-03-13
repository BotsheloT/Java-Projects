/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnator;

/**
 *
 * @author BOTSHELO
 */
import java.util.Random;
public class Randomnator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration of variable for random number
        int randomNum;
        //Name of Random function
        Random ran = new Random();
        
        randomNum = ran.nextInt(31);
        /*Old Mistake:
        System.out.println(ran+ " is your lucky number");
        */        
        System.out.println(randomNum + " is your lucky number");
        
        /*Created in 2020, fixed in early 2021
        You used the random function as the output instead of the actual variable storing the random number*/
    }
    
}
