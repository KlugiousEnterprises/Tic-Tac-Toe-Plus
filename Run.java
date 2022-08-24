
/**
 * Write a description of class Run here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
public class Run
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for the board size:");
        int s = input.nextInt();
        Board game = new Board(s);
        System.out.println("Player X enter your first name.");
        String xName = input.next();
        PlayerX x = new PlayerX(xName);
        System.out.println("Player O enter your first name.");
        String oName = input.next();
        PlayerO o = new PlayerO(oName);
        String pX = "X";
        String pO = "O";
        game.makeBoard();
        game.printBoard();
        
        int xr = x.xRow();
        int xc = x.xCol();
        game.fillSpace(pX, xr, xc);
        
        game.printBoard();
        
        int or = o.oRow();
        int oc = o.oCol();
        game.fillSpace(pO, or, oc);
        
        while(!game.winner() && !game.tie())
        {
            game.printBoard();
            xr = x.xRow();
            xc = x.xCol();
            game.fillSpace(pX, xr, xc);
            if(game.winner() || game.tie())
            {
                game.printBoard();
                break;
            }
            
            game.printBoard();
            
            or = o.oRow();
            oc = o.oCol();
            game.fillSpace(pO, or, oc);
            
        }
        
        if(game.winner())
            System.out.println("We have a winner!!!!!!");
        else
            System.out.println("We have a tie :(");
    }
}
