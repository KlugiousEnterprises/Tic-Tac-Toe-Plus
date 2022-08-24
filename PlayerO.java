
/**
 * Write a description of class PlayerO here.
 * 
 * @author Steven Klug 
 * @version 8/17/16
 */

import java.util.*;
public class PlayerO
{
   private String name;
   private Scanner input;
   public PlayerO(String n)
   {
       name = n;
   }
   
   public int oRow()
   {
       input = new Scanner(System.in);
       System.out.println(name + " choose your row number");
       return input.nextInt();
   }
   
   public int oCol()
   {
       input = new Scanner(System.in);
       System.out.println(name + " choose your column number");
       return input.nextInt();
   }
}
