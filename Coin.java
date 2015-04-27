import java.util.Random;

/**
   A Coin object, which is really just a glorified
   boolean random generator. This is useful
   for deciding between two options in a clear
   and fair manner.
   
   @author Gabriel Anderson
   @since April 27, 2015
   @version 1.0
 */
public class Coin
{
   // The two states of the coin.
   public static final boolean HEADS = true;
   public static final boolean TAILS = false;
   
   private Random random;
   
   /**
      Constructs a randomized coin object.
    */
   public Coin()
   {
      random = new Random();
   }
   
   /**
      Constructs a seeded random coin object.
      @param seed The seed to use.
    */
   public Coin(long seed)
   {
      random = new Random(seed);
   }
   
   /**
      Flips the coin. Will either be heads or tails.
      @return HEADS or TAILS.
    */
   public boolean flip()
   {
      return random.nextBoolean();
   }
}