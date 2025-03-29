// import be.uliege.montefiore.oop.*;

// public class GraphInterface {
//     public GraphInterface(int n, int m, int w, int h) throws GUIException {
//         SlidingPuzzleGUI sp = new SlidingPuzzleGUI(w, h);
//         sp.startFrame();
//         sp.endFrame();
//     }

//     public static void main(String[] args) throws GUIException {
//         new GraphInterface(3, 3, 5000, 5000);
//     }
// }

// javac -cp .;sliding-puzzle-gui.jar GraphInterface.java
// java -cp .;sliding-puzzle-gui.jar GraphInterface
import be.uliege.montefiore.oop.*;

public class GraphInterface {
    public GraphInterface(int w, int h) throws GUIException {
        // Create the puzzle window
        SlidingPuzzleGUI sp = new SlidingPuzzleGUI(w, h);

        // Start a frame
        sp.startFrame();
        
        // Add rectangles to the frame
        try {
            int rectSize = 60; // Size of each rectangle
            int margin = 10;   // Margin between rectangles
            int rows = 3;      // Number of rows
            int cols = 3;      // Number of columns

            // Loop to create a grid of rectangles
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    int x = j * (rectSize + margin);
                    int y = i * (rectSize + margin);
                    int r = (i * 85) % 256; // Varying red color
                    int g = (j * 85) % 256; // Varying green color
                    int b = ((i + j) * 85) % 256; // Varying blue color
                    sp.newRectangle(x, y, rectSize, rectSize, r, g, b);
                }
            }
        } catch (GUIException e) {
            System.out.println("Error adding rectangle: " + e.getMessage());
        }

        // End and display the frame
        sp.endFrame();

        // Handle user interaction
        boolean running = true;
        while (running) {
            int[] move = sp.nextMove();  // Wait for user interaction

            if (move == null) {  // If window is closed, exit
                running = false;
            } else {
                System.out.println("Mouse moved from (" + move[0] + ", " + move[1] + ") to (" + move[2] + ", " + move[3] + ")");
            }
        }

        System.out.println("Game closed.");
    }

    public static void main(String[] args) throws GUIException {
        new GraphInterface(250, 250);
    }
}
