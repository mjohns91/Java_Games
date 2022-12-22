package Java_Games.BrickBreaker.src;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;

public class GamePanel extends JPanel implements ActionListener{
    
    //constants
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int DELAY = 75;

    //brick variables
    private int brickWidth = 50;
    private int brickHeight = 15;
    private int brickPadding = 10;
    private int brickOffsetTop = 30;
    private int brickOffsetLeft = 30;
    private int brickHealth = 2;
    int[][] bricks = new int[7][3];
    
    //paddle variables
    private int paddleWidth = 75;
    private int paddleHeight = 25;
    private int paddleX = (SCREEN_WIDTH / 2) - (paddleWidth / 2);
    private int paddleY = SCREEN_HEIGHT - 50;
    
    //ball variables
    private int ballWidth = 25;
    private int ballHeight = 25;
    private int ballVelX = -1;
    private int ballVelY = -2;
    private int ballX = (SCREEN_WIDTH / 2) - (ballWidth / 2);
    private int ballY = SCREEN_HEIGHT - (SCREEN_HEIGHT / 3);
    
    //other variables
    private boolean running = false;
    private Timer timer;
    private int score = 0;
    private Random random;


    public GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame() {
        newBall();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    
    public void draw(Graphics g) {
        //paddle
        g.setColor(Color.GREEN);
        g.fillRect(paddleX, paddleY, paddleWidth, paddleHeight);

        //ball
        g.fillOval(ballX, ballY, ballWidth, ballHeight);

        //bricks
        for (int i = 0; i < bricks.length; i++) {
            for (int j = 0; j < bricks[i].length; j++) {
                int brickX = i * (brickWidth + brickPadding) + brickOffsetLeft;
                int brickY = j * (brickHeight + brickPadding) + brickOffsetTop;
                g.drawRect(brickX, brickY, brickWidth, brickHeight);
            }
        }

    }

    public void damageBrick() {

    }
    
    public void removeBrick() {

    }

    public void createBricks() {

    }

    public void checkCollisions() {

    }

    public void newBall() {

    }

    public void move() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    
            }
        }
    }
    
}
