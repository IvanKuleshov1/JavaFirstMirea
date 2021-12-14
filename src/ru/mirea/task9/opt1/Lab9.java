import javax.swing.*;
import java.awt.*;

public class Lab9 extends JFrame {
    private int milanScore = 0;
    private int realScore = 0;
    JLabel resultLabel;
    JLabel lastScoreLabel;
    JLabel winnerLabel;

    public void frame() {
        JFrame frame = new JFrame("Futurism simulator");
        JButton btnMilan = new JButton("AC Milan");
        JButton btnMadrid = new JButton("Real Madrid");
        resultLabel=new JLabel();
        lastScoreLabel = new JLabel();
        winnerLabel = new JLabel();

        btnMilan.addActionListener(e->{
            updateScore("AC Milan");
            lastScoreLabel.setText("Last Scorer: AC Milan");
        });

        btnMadrid.addActionListener(e->{
            updateScore("Real Madrid");
            lastScoreLabel.setText("Last Scorer: Real Madrid");
        });
        Container bottons = new JPanel(new GridLayout(1,2));
        Container labels = new JPanel(new GridLayout(3,1));
        resultLabel.setText("Result: "  + "0 X 0");
        lastScoreLabel.setText("Last Scorer: none");
        winnerLabel.setText("Winner: Ничья ");

        labels.add(resultLabel);
        labels.add(lastScoreLabel);
        labels.add(winnerLabel);
        bottons.add(btnMilan);
        bottons.add(btnMadrid);

        frame.setSize(1600, 835);
        frame.add(bottons, BorderLayout.SOUTH);
        frame.add(labels,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void updateScore(String team){
        if (team.equals("AC Milan"))
            milanScore++;
        if (team.equals("Real Madrid"))
            realScore++;
        resultLabel.setText("Result: " + milanScore + " X "+ realScore);

        if(milanScore>realScore)
            winnerLabel.setText("Winner: AC Milan" );
        else
            winnerLabel.setText("Winner: Real Madrid" );
        if(milanScore==realScore)
            winnerLabel.setText("Winner: Ничья" );
    }
    public static void main(String[] args) {
        Lab9 go = new Lab9();
        go.frame();
    }

}
