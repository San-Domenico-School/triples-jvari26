/**
 * Write a description of class Scorekeeper here.
 * 
 * @Julian Vari :3 
 * @Thu Jan 11
 */
public class Scorekeeper  
{
   private static int deckSize, score;
   private static long startTime = System.currentTimeMillis();  
   public static void setDeckSize(int DeckSize)
   {
       DeckSize = deckSize;
   } 
   public static void updateScore()
   {
       if (System.currentTimeMillis() - startTime <= 4000)
       {
          score = score + 5;//adds a value of 5
       }
       else
       {
           score = score + 3; //adds a value of 3
       }
       
       startTime = System.currentTimeMillis();
       
   }
   public static int getScore()
   {
       return 0; // fix later
   }
}
