import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random rand;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        rand = new Random();
    }
    
    public void printOneRandom()
    {
        System.out.println(rand.nextInt());
    }
    
    public void printMultiRandom(int howMany){
     int i = 0;
     while(i>howMany){
         System.out.println(rand.nextInt());
         i++;
     }
    }
    
    public int throwDice(){
        return rand.nextInt();
    }
    
     public String getResponse()
     {
         ArrayList<String>responses = new ArrayList<>();
         responses.add("yes");
         responses.add("no");
         responses.add("maybe");
         
         int index =rand.nextInt(3);
         return responses.get(index);
         
     }
     
     public int getFrom1toMax(int max)
     {
         return rand.nextInt(max)+1;
     }
     
     public int getFromMintoMax(int max,int min)
     {
         return rand.nextInt(max-min+1)+min;
     }
    }
