
/**
 * Create a board for your game
 * 
 * Steven Klug 
 * 8/16/16
 */
public class Board
{
    private String [][] gameBoard;
    
    /**
     * Initializes a square x by x game board
     */
    public Board(int x)
    {
        gameBoard = new String [x][x];
    }
    
    /**
     * Fills in the game board with a single space for each location
     */
    public void makeBoard()
    {
        for(int r = 0; r < gameBoard.length; r++)
        {
            for(int c = 0; c < gameBoard[r].length; c++)
            {
                gameBoard[r][c] = " ";
            }
        }
    }
    
    /**
     * prints out the board using a tab in between each column and two lines between each row.
     */
    public void printBoard()
    {
        for(int k = 0; k < gameBoard[0].length; k++)
        {
            System.out.print("\t" + k);
        }
        System.out.println();
        for(int r = 0; r < gameBoard.length; r++)
        {
            System.out.print(r + "\t");
            for(int c = 0; c < gameBoard[r].length; c++)
            {
                System.out.print(gameBoard[r][c] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }
    
    /**
     * Checks for empty spaces on the board.
     * @param r: 0 <= r < gameBoard.length
     * @param c: 0 <= c < gameBoard[r].length
     * return true if the space is empty
     */
    public boolean emptySpace(int r, int c)
    {
        return gameBoard[r][c].equals(" ");
    }
    
    /**
     * Checks for spaces filled in by an X or an O
     * @param r: 0 <= r < gameBoard.length
     * @param c: 0 <= c < gameBoard[r].length
     * return true if the space holds an X or an O
     */
    public boolean spaceIsFull(int r, int c)
    {
        return gameBoard[r][c].equals("X") || gameBoard[r][c].equals("Y");
    }
    
    /**
     * @param str is not null
     * @param r: 0 <= r < gameBoard.length
     * @param c: 0 <= c < gameBoard[r].length
     */
    public void fillSpace(String str, int r, int c)
    {
        if(!spaceIsFull(r,c))
        {
        gameBoard[r][c] = str;
        }
    }
    
    /**
     * @param all elements of arr have been initialized
     * @return true if all of the elements of arr are the same
     */
    public boolean elementsEqual(String [] arr)
    {
        String str = arr[0];
        if(str.equals(" "))
            return false;
        for(String s: arr)
        {
            if(!(s.equals(str)))
                return false;
        }
        return true;
    }
    
    /**
     * @return true if all the elements in any row, column, the main diagonal, or the reverse main diagonal are the same
     */
    public boolean winner()
    {
        String [] str = new String[gameBoard.length];
        for(int r = 0; r < gameBoard.length; r++)
        {
            for(int c = 0; c < gameBoard[r].length; c++)
            {
                str[c] = gameBoard[r][c];
            }
            if(elementsEqual(str))
                return true;
            
        }
        
        for(int c = 0; c < gameBoard[0].length; c++)
        {
            for(int r = 0; r < gameBoard.length; r++)
            {
                str[r] = gameBoard[r][c];
            }
            if(elementsEqual(str))
                return true;
        }
        
        for(int r = 0; r < gameBoard.length; r++)
        {
            for(int c = 0; c < gameBoard[r].length; c++)
            {
                if(r == c)
                {
                    str[r] = gameBoard[r][c];
                }
            }
        }
        if(elementsEqual(str))
                return true;
        
        int c = 0;
        for(int r = gameBoard.length - 1; r >= 0; r--)
        {
            str[c] = gameBoard[r][c];
            c++;
            
        }
        if(elementsEqual(str))
                return true;
        return false;
    }
    
    /**
     * returns true if the board is filled and there is no winner
     */
    public boolean tie()
    {
        if(!winner())
        {
            for (String [] arr : gameBoard)
            {
                for(String str : arr)
                if(str.equals(" "))
                    return false;
            }
            return true;
        }
        return false;
    }
}
