import javax.swing.*;


class App {
    public static void main(String[] args) {
        JFrame window = new JFrame("Art"); // creates a new window frame and calls it "Art"

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // makes it so when you close the window the program stops

        MyCanvas canvas = new MyCanvas(); // creates a canvas to draw on

        window.add(canvas); // adds the canvas to the window
        window.pack();  // fits the window size around our canvas
        window.setResizable(false); // doesn't allow users to resize the window
        window.setLocationRelativeTo(null); // opens the window in the center of the screen
        window.setVisible(true); // display the window


    }

}
