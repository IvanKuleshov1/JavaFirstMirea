package ru.mirea.task8.opt2;


import javax.swing.*;
import java.awt.*;

public class ArgPicExample extends JComponent{
    Image image;

    public ArgPicExample(Image i) {
        image = i;
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {


        for (String arg : args) {
            System.out.println(arg);
        }
        String imageFile = args[0];
        if (args.length > 0) {
            imageFile = args[0];
        }
        Image image = Toolkit.getDefaultToolkit().getImage(args[0]);
        JFrame frame = new JFrame("MyImage");
        frame.add(new ArgPicExample(image));
        frame.setSize(1000, 700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}