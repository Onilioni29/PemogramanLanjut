package gui;

import javax.swing.*;

public class RunFormBiodata {
    public static void main(String[] args) {
        JFrame jFramee = new JFrame("Form Biodata");
        jFramee.setContentPane(new FormBiodata().getRootPanel());
        jFramee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFramee.setLocationRelativeTo(null);
        jFramee.setSize(500, 400);
        jFramee.setVisible(true);
    }
}
