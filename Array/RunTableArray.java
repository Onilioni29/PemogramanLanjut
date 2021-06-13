
package gui.Array;

import javax.swing.*;

public class RunTableArray {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        ImageIcon imageIcon = new ImageIcon("res/images.png");
        JFrame jframe = new JFrame("Sorting Data Array");
        JFrame.setIconImage(ImageIcon.getImage());
        jframe.setContentPane(new TableArray().getRootPanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500,400);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
