package main;

import panels.SettingsPanel;

import javax.swing.*;

public class GUI {
    JFrame frame;

    public GUI() {
        frame = new JFrame("Corners Frame");
        frame.setSize(350, 350);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SettingsPanel());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
