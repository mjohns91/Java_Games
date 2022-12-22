package Java_Games.BrickBreaker.src;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Brick Breaker");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
