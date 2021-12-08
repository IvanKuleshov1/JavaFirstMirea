package ru.mirea.task11.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame{

    int counter = 0;
    int randomNumber = rnd(20);

    Font font = new Font("Century Gothic", Font.BOLD, 20);

    JButton guess = new JButton("Try");

    JLabel result = new JLabel();

    JTextField textField = new JTextField(2);

    String resultLine = "Enter your number";

    public Game(){
        super("BorderLayoutTest");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(350, 350);

        Container container = getContentPane();

        guess.addActionListener(new Game.ChangeInfo());
        container.add(guess, BorderLayout.SOUTH);

        textField.setForeground(Color.BLACK);
        container.add(textField, BorderLayout.NORTH);

        System.out.println(randomNumber);

        result.setFont(font);
        result.setText(resultLine);
        container.add(result, BorderLayout.CENTER);
        setVisible(true);
    }

    private class ChangeInfo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            counter++;

            int numberFromField = Integer.parseInt(textField.getText().trim());

            if(counter >=3)
                resultLine = "Game over!";
            else{
                if(randomNumber == numberFromField)
                    resultLine = "You win!";
                else{
                    if(randomNumber > numberFromField)
                        resultLine = "Your number is bigger than ours";
                    else
                        resultLine = "Our number is bigger than yours";
                }
            }
            result.setText(resultLine);
        }
    }

    static JFrame getFrame(){
        JFrame frame = new JFrame() {};
        frame.setVisible(true);
        frame.setBounds(250, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public static void main(String[]args)
    {
        new Game();
    }

    public static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }
}