import javax.swing.*;
import java.awt.*;

public class hw26 extends JFrame {
    private JPanel panel;
    private ImageIcon spriteImage;
    private JLabel spriteLabel;
    private int x, y;

    public hw26() {
        super("Sprite Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);

        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);

        spriteImage = new ImageIcon("sprite.png");  // Замість "sprite.png" вставте шлях до свого спрайта
        spriteLabel = new JLabel(spriteImage);
        spriteLabel.setSize(spriteImage.getIconWidth(), spriteImage.getIconHeight());
        x = 100;  // Початкові координати X та Y для спрайта
        y = 100;
        spriteLabel.setLocation(x, y);
        panel.add(spriteLabel);

        setVisible(true);

        moveSprite();
    }

    private void moveSprite() {
        Thread animationThread = new Thread(() -> {
            while (true) {
                // Змінюємо координати спрайта
                x += 5;
                y += 3;


                SwingUtilities.invokeLater(() -> spriteLabel.setLocation(x, y));

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        animationThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(hw26::new);
    }
}
//import javax.swing.*;
//        import java.awt.*;
//
//public class ResizeAnimation extends JFrame {
//    private JPanel panel;
//    private ImageIcon spriteImage;
//    private JLabel spriteLabel;
//    private int width, height;
//
//    public ResizeAnimation() {
//        super("Resize Animation");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(800, 600);
//        setResizable(false);
//
//        panel = new JPanel();
//        panel.setLayout(null);
//        getContentPane().add(panel);
//
//        spriteImage = new ImageIcon("sprite.png");
//        spriteLabel = new JLabel(spriteImage);
//        width = spriteImage.getIconWidth();
//        height = spriteImage.getIconHeight();
//        spriteLabel.setSize(width, height);
//        spriteLabel.setLocation(100, 100);
//        panel.add(spriteLabel);
//
//        setVisible(true);
//
//        resizeSprite();
//    }
//
//    private void resizeSprite() {
//        Thread animationThread = new Thread(() -> {
//            boolean increaseSize = true;
//            while (true) {
//                if (increaseSize) {
//                    width += 5;
//                    height += 5;
//                } else {
//                    width -= 5;
//                    height -= 5;
//                }
//
//                SwingUtilities.invokeLater(() -> {
//                    spriteLabel.setSize(width, height);
//                    spriteLabel.setLocation(400 - width / 2, 300 - height / 2);  // Центруємо спрайт у вікні
//                });
//
//                if (width >= 200) {
//                    increaseSize = false;
//                } else if (width <= 50) {
//                    increaseSize = true;
//                }
//
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        animationThread.start();
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(ResizeAnimation::new);
//    }
//}

