import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{

    Random rand = new Random();
    JFrame frame = new JFrame();
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1Turn; //true for player1 turn; false for player2 turn

    public TicTacToe() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(Color.WHITE);
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0, 0, 800, 100);

        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.setBackground(Color.CYAN);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        titlePanel.add(textfield);
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(buttonPanel);

        firstTurn();

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for (int i = 0; i < buttons.length; i++) {

            if (e.getSource() == buttons[i]) {
                if (player1Turn) {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(Color.BLUE);
                        buttons[i].setText("X");
                        player1Turn = false;
                        textfield.setText("O turn");
                        check();
                    }
                }
                else {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(Color.RED);
                        buttons[i].setText("O");
                        player1Turn = true;
                        textfield.setText("X turn");
                        check();
                    }
                }
            }
        }
    }
    
    public void firstTurn() {

        // try {
        //     Thread.sleep(2000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        
        if (rand.nextInt(2) == 0) {
            player1Turn = true;
            textfield.setText("X turn");
        }
        else {
            player1Turn = false;
            textfield.setText("O turn");
        }
    }

    public void check() {
        //check X win conditions
        if ((buttons[0].getText().equals("X")) &&
            (buttons[1].getText().equals("X")) &&
            (buttons[2].getText().equals("X"))) {
                xWins(0, 1, 2);
        }
        if ((buttons[3].getText().equals("X")) &&
            (buttons[4].getText().equals("X")) &&
            (buttons[5].getText().equals("X"))) {
                xWins(3, 4, 5);
        }
        if ((buttons[6].getText().equals("X")) &&
            (buttons[7].getText().equals("X")) &&
            (buttons[8].getText().equals("X"))) {
                xWins(6, 7, 8);
        }
        if ((buttons[0].getText().equals("X")) &&
            (buttons[3].getText().equals("X")) &&
            (buttons[6].getText().equals("X"))) {
                xWins(0, 3, 6);
        }
        if ((buttons[1].getText().equals("X")) &&
            (buttons[4].getText().equals("X")) &&
            (buttons[7].getText().equals("X"))) {
                xWins(1, 4, 7);
        }
        if ((buttons[2].getText().equals("X")) &&
            (buttons[5].getText().equals("X")) &&
            (buttons[8].getText().equals("X"))) {
                xWins(2, 5, 8);
        }
        if ((buttons[0].getText().equals("X")) &&
            (buttons[4].getText().equals("X")) &&
            (buttons[8].getText().equals("X"))) {
                xWins(0, 4, 8);
        }
        if ((buttons[2].getText().equals("X")) &&
            (buttons[4].getText().equals("X")) &&
            (buttons[6].getText().equals("X"))) {
                xWins(2, 4, 6);
        }
        //check O win conditions
        if ((buttons[0].getText().equals("O")) &&
            (buttons[1].getText().equals("O")) &&
            (buttons[2].getText().equals("O"))) {
                oWins(0, 1, 2);
        }
        if ((buttons[3].getText().equals("O")) &&
            (buttons[4].getText().equals("O")) &&
            (buttons[5].getText().equals("O"))) {
                oWins(3, 4, 5);
        }
        if ((buttons[6].getText().equals("O")) &&
            (buttons[7].getText().equals("O")) &&
            (buttons[8].getText().equals("O"))) {
                oWins(6, 7, 8);
        }
        if ((buttons[0].getText().equals("O")) &&
            (buttons[3].getText().equals("O")) &&
            (buttons[6].getText().equals("O"))) {
                oWins(0, 3, 6);
        }
        if ((buttons[1].getText().equals("O")) &&
            (buttons[4].getText().equals("O")) &&
            (buttons[7].getText().equals("O"))) {
                oWins(1, 4, 7);
        }
        if ((buttons[2].getText().equals("O")) &&
            (buttons[5].getText().equals("O")) &&
            (buttons[8].getText().equals("O"))) {
                oWins(2, 5, 8);
        }
        if ((buttons[0].getText().equals("O")) &&
            (buttons[4].getText().equals("O")) &&
            (buttons[8].getText().equals("O"))) {
                oWins(0, 4, 8);
        }
        if ((buttons[2].getText().equals("O")) &&
            (buttons[4].getText().equals("O")) &&
            (buttons[6].getText().equals("O"))) {
                oWins(2, 4, 6);
        }
    }

    public void xWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(false);
        }

        textfield.setText("X Wins!");
    }

    public void oWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(false);
        }

        textfield.setText("O Wins!");
    }
}
