package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwentyShapes extends JFrame{

    public TwentyShapes() throws HeadlessException {
        super("Futurism simulator");
        setSize(1600, 805);
        setVisible(true);
    }

    public void frame(){
        JFrame frame= new JFrame("Futurism simulator");
        JButton btn = new JButton("Another one");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> new TwentyShapes());
            }
        });
        frame.setSize(1600, 835);
        frame.add(btn, BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int red;
        int green;
        int blue;
        Square square;
        Circle crcl;
        Triangle trngle;
        RoundRecty rndrct;
        ArcSht someArc;
        for (int i = 0; i < 20; i++)
        {
            red = (int) (Math.random() * 255);
            green = (int) (Math.random() * 255);
            blue = (int) (Math.random() * 255);
            switch (1 + (int) (Math.random() * 5)) {
                case (1) -> {
                    square = new Square(
                            50 + (int) (Math.random() * 1300),
                            50 + (int) (Math.random() * 600),
                            new Color(red, green, blue));
                    square.Print(g);
                }
                case (2) -> {
                    crcl = new Circle(
                            50 + (int) (Math.random() * 1300),
                            50 + (int) (Math.random() * 600),
                            new Color(red, green, blue));
                    crcl.Print(g);
                }
                case (3) -> {
                    trngle = new Triangle(
                            50 + (int) (Math.random() * 1300),
                            50 + (int) (Math.random() * 600),
                            new Color(red, green, blue));
                    trngle.Print(g);
                }
                case (4)-> {
                    rndrct = new RoundRecty(
                            50 + (int) (Math.random() * 1300),
                            50 + (int) (Math.random() *600),
                            new Color(red, green, blue));
                    rndrct.Print(g);
                }
                case(5)->{
                    someArc = new ArcSht(
                            50 + (int) (Math.random() * 1300),
                            50 + (int) (Math.random() * 600),
                            new Color(red, green, blue));
                    someArc.Print(g);
                }
            }
        }
    }

    public static void main(String[] args) {
        TwentyShapes go = new TwentyShapes();
        go.frame();
    }
}
