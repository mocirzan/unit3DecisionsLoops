import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;
import java.lang.*;
/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;

    // the game board will have 5 rows and 5 columns
    private final int ROWS = 50;
    private final int COLS = 50;

    // constants for the location of the three cells initially alive
    private final int X1 = 8, Y1 = 9;
    private final int X2 = 7, Y2 = 10;
    private final int X3 = 8, Y3 = 11;
    private final int X4 = 9, Y4 = 10;
    private final int X5 = 8, Y5 = 10;

    //Default constructor for objects of class GameOfLife
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);

        // create a world based on the grid
        world = new ActorWorld(grid);

        // populate the game
        populateGame();

        // display the newly constructed and populated world
        world.show();

    }

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();

        // create and add rocks (a type of Actor) to the 5 intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);

        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);

        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);

        Rock rock4 = new Rock();
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, rock4);

        Rock rock5 = new Rock();
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, rock5);

    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */

        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();

        // List of locations where the next generation of cells will be created
        ArrayList<Location> cellsToCreate = new ArrayList<Location>();

        // Iterates through the grid and checks for neighbors of alive and dead cells.
        for (int rows = 0; rows < ROWS; rows ++)
        {
            for (int cols = 0; cols < COLS; cols ++)
            {
                Actor cell = getActor(rows,cols);
                Location cellLoc = new Location(rows,cols);
                ArrayList<Actor> neighbors = grid.getNeighbors(cellLoc);
                int numNeighbors = neighbors.size();

                //Checks alive cells for certain amount of neighbors
                if (cell != null)
                {
                    if (numNeighbors == 3 || numNeighbors == 2)
                    {
                        // Appends location list of current location for creation in next generation
                        cellsToCreate.add(cellLoc);
                    }
                }

                //Checks dead cells for certain amount of neighbors
                else
                {
                    if (numNeighbors == 3)
                    {
                        // Appends location list of current location for creation in next generation
                        cellsToCreate.add(cellLoc);
                    }
                }
            }
        }

        // Clears grid
        for (int rows = 0; rows < ROWS; rows ++)
        {
            for (int cols = 0; cols < COLS; cols ++)
            {
                Actor cell = getActor(rows,cols);
                Location cellLoc = new Location(rows,cols);
                grid.remove(cellLoc);
            }
        }

        // Creates next generation of cells
        for (int i = 0; i < cellsToCreate.size(); i++)
        {
            Location newLoc = cellsToCreate.get(i);
            Rock newRock = new Rock();
            grid.put(newLoc, newRock);

        }
        
        // Sets grid.
        world.setGrid(grid);
    }

    /**
     * Retur the actor at the specified row and comn. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }

    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }

    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException

    {
        GameOfLife game = new GameOfLife();
        Thread.sleep(1000);
        for (int i = 0; i < 100; i++)
        {
            game.createNextGeneration();
            Thread.sleep(100);
        }

    }

}
