/* The program below attempts to solve a labyrinth or a maze problem using Depth-First Search (DFS). 
The maze is represented as a two-dimensional array, with 0s indicating free regions and 1s representing barriers. 
The solveMaze function traverses the labyrinth using DFS, marking each visited cell and retracing if required. 
The main function sets up the labyrinth, executes the solveMaze function, and outputs the path followed if a solution is discovered. */

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class CreatMain1 {
    // Define the maze
    private static int[][] maze = {
        {1, 0, 0, 0, 1, 0},
        {0, 1, 1, 0, 0, 0},
        {0, 0, 0, 0, 1, 1},
        {0, 1, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 0},
        {1, 0, 0, 1, 1, 0}
    };

    // Define the possible movements (up, down, left, right)
    private static int[][] movements = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    // Solve the maze using DFS (Depth First Search Algorithm)
    public static boolean solveMaze(int x, int y, List<String> path) {
        // If reached the bottom-right corner, return true
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            path.add("Goal is Reached!");
            return true;
        }

        // Mark the current cell as visited
        maze[x][y] = 1;

        // Try all possible movements
        for (int[] movement : movements) {
            int newX = x + movement[0];
            int newY = y + movement[1];

            // If the new cell is within the maze and is not a wall
            if (newX >= 0 && newX < maze.length && newY >= 0 && newY < maze[0].length && maze[newX][newY] == 0) {
                // Add the movement to the path
                path.add("Moved to (" + newX + ", " + newY + ")");

                // Recursively try to solve the maze from the new cell
                if (solveMaze(newX, newY, path)) {
                    return true;
                }
            }
        }

        // If we've reached a dead end, return false
        path.add("Backtracked from (" + x + ", " + y + ")");
        return false;
    }

    public static void main(String[] args) {
        // Solve the maze by starting from the top-left corner
        List<String> path = new ArrayList<>();
        if (solveMaze(0, 0, path)) {
            System.out.println("Well Done! Maze solved! \n");
            System.out.println("The final path taken is:");
            for (String step : path) {
                System.out.println(step);
            }
        } else {
            System.out.println("Sorry! No solution found. Please try again...");
        }
    }
}