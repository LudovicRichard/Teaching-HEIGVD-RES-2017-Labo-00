package ch.heigvd.res.lab00;

/**
 *
 * @author Ludovic
 */
public class Flute implements IInstrument{
   public String play (){
      return "fju";
   }
   
   public int getSoundVolume (){
      return 3;
   }
   
   public String getColor(){
      return "braun";
   }
}
