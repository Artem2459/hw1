import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class hw21 extends JFrame implements ActionListener {
    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 600;
    private final int BUTTON_SIZE = 50;
    private Timer timer;
    private JButton[] buttons;

    public hw21() {
        setTitle("Дикий Захід");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        buttons = new JButton[5];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setSize(BUTTON_SIZE, BUTTON_SIZE);
            buttons[i].setLocation(getRandomX(), getRandomY());
            buttons[i].setBackground(getRandomColor());
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        timer = new Timer(100, this);
        timer.start();
    }

    private int getRandomX() {
        return (int) (Math.random() * (FRAME_WIDTH - BUTTON_SIZE));
    }

    private int getRandomY() {
        return (int) (Math.random() * (FRAME_HEIGHT - BUTTON_SIZE));
    }

    private Color getRandomColor() {
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) e.getSource();
            remove(clickedButton);
            revalidate();
            repaint();
        }

        for (JButton button : buttons) {
            int newX = button.getX() + (int) (Math.random() * 21) - 10;
            int newY = button.getY() + (int) (Math.random() * 21) - 10;
            button.setLocation(newX, newY);
        }

        checkCollision();
    }

    private void checkCollision() {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = i + 1; j < buttons.length; j++) {
                if (buttons[i].getBounds().intersects(buttons[j].getBounds())) {
                    buttons[i].setSize(BUTTON_SIZE + 10, BUTTON_SIZE + 10);
                    buttons[j].setSize(BUTTON_SIZE + 10, BUTTON_SIZE + 10);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            hw21 game = new hw21();
            game.setVisible(true);
        });
    }
}
