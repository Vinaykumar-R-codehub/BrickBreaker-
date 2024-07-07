import javax.swing.JFrame;

public class BrickBreaker {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GamePanel gamePanel = new GamePanel();
        
        frame.setBounds(10, 10, 700, 600);
        frame.setTitle("Brick Breaker Game");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gamePanel);
        frame.setVisible(true);}
}