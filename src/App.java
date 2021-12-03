import javax.swing.*;


class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        JFrame window = new JFrame("Art");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyCanvas canvas = new MyCanvas();
        window.add(canvas);
        window.pack();
        window.setVisible(true);


    }

}
