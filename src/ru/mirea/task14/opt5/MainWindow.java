package ru.mirea.task14.opt5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Stack;

public class MainWindow extends JFrame {

    JTextField textField1 = new JTextField(15);
    JTextField textField2 = new JTextField(15);
    JLabel result = new JLabel();
    String resultLine = "Result Area";

    int counter = 0;
    int card1;
    int card2;

    Stack player1 = new Stack();
    Stack player2 = new Stack();

    public MainWindow() throws IOException {
        super("Пьяница");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 840);
        Button startGame = new Button("Start");
        Button reroll = new Button("Input");
        reroll.addActionListener(new Itr());
        startGame.addActionListener(new NewRound());

        Container container = getContentPane();
        Container buttons = new JPanel(new GridLayout(1, 2));
        Container buttonsAndRes = new JPanel(new GridLayout(2, 2));
        buttons.add(startGame);
        buttons.add(reroll);
        result.setText(resultLine);
        buttonsAndRes.add(result, BorderLayout.CENTER);
        buttonsAndRes.add(buttons);
        container.add(buttonsAndRes, BorderLayout.SOUTH);
        Container textFields = new JPanel(new GridLayout(1, 2));
        Container textFieldsName = new JPanel(new GridLayout(1, 2));
        Container textFieldstextFieldsName = new JPanel(new GridLayout(2, 2));
        JLabel name1 = new JLabel("Введите карты первого игрока");
        JLabel name2 = new JLabel("Введите карты второго игрока");
        textFieldsName.add(name1);
        textFieldsName.add(name2);
        textFields.add(textField1);
        textFields.add(textField2);
        textFieldstextFieldsName.add(textFields);
        textFieldstextFieldsName.add(textFieldsName);
        container.add(textFieldstextFieldsName, BorderLayout.NORTH);

        BufferedImage img = ImageIO.read(new File("C:\\Users\\ivank\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task14\\opt5\\task14.jpg"));
        JLabel background = new JLabel(new ImageIcon(img));
        container.add(background);
    }


    private class Itr implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String line1 = textField1.getText();
            int start = 0;
            int end = 5;
            char[] nums1=new char[5];
            line1.getChars(start, end, nums1, 0);
            for(int i = 0; i < nums1.length ; i++){
                player1.push(Integer.parseInt(String.valueOf(nums1[i])));

            }

            String line2 = textField2.getText();
            char[] nums2=new char[5];
            line2.getChars(start, end, nums2, 0);
            for(int i = 0; i < nums2.length ; i++){
                player2.push(Integer.parseInt(String.valueOf(nums2[i])));

            }

        }
    }

    private class NewRound implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            card1 = (int) player1.get(0);
            card2 = (int) player2.get(0);

            player1.remove(0);
            player2.remove(0);

            if (card1 == 0 && card2 == 9){
                player1.push(card1);
                player1.push(card2);
            }
            else if (card1 == 9 && card2 == 0){
                player2.push(card1);
                player2.push(card2);
            }
            else if (card1 > card2){
                player1.push(card1);
                player1.push(card2);
            }
            else {
                player2.push(card1);
                player2.push(card2);
            }

            counter++;


            if (player1.size() == 0)
                resultLine = ("second ");
            else if (player2.size() == 0)
                resultLine = ("first ");
            else if (counter > 105)
                resultLine = "botva";
            else resultLine = "Еще раунд!";

            result.setText(resultLine + " \n" + "Раунд: " + counter);
        }
    }
}