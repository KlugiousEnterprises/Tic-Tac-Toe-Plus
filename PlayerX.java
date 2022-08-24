
/**
 * Write a description of class PlayerX here.
 * 
 * @author Steven Klug 
 * @version 8/17/16
 */

import java.util.*;
public class PlayerX
{
   private String name;
   private Scanner input;
   public PlayerX(String n)
   {
       name = n;
   }
   
   public int xRow()
   {
       input = new Scanner(System.in);
       System.out.println(name + " choose your row number");
       return input.nextInt();
   }
   
   public int xCol()
   {
       input = new Scanner(System.in);
       System.out.println(name + " choose your column number");
       return input.nextInt();
   }
   
}
