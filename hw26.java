//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class SpriteModel {
//    private int x, y;
//    private Timer timer;
//
//    public SpriteModel() {
//        x = 100;
//        y = 100;
//        timer = new Timer(50, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                move();
//            }
//        });
//        timer.start();
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    private void move() {
//        x += 5;
//        y += 3;
//    }
//}
//import javax.swing.*;
//        import java.awt.*;
//
//public class SpriteView extends JFrame {
//    private JPanel panel;
//    private ImageIcon spriteImage;
//    private JLabel spriteLabel;
//
//    public SpriteView() {
//        super("Sprite Animation");
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
//        spriteLabel.setSize(spriteImage.getIconWidth(), spriteImage.getIconHeight());
//        spriteLabel.setLocation(100, 100);
//        panel.add(spriteLabel);
//
//        setVisible(true);
//    }
//
//    public void updatePosition(int x, int y) {
//        spriteLabel.setLocation(x, y);
//    }
//}
//import javax.swing.*;
//
//public class SpriteController {
//    private SpriteModel model;
//    private SpriteView view;
//
//    public SpriteController(SpriteModel model, SpriteView view) {
//        this.model = model;
//        this.view = view;
//        initView();
//    }
//
//    private void initView() {
//        Timer timer = new Timer(50, e -> {
//            int x = model.getX();
//            int y = model.getY();
//            view.updatePosition(x, y);
//        });
//        timer.start();
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            SpriteModel model = new SpriteModel();
//            SpriteView view = new SpriteView();
//            new SpriteController(model, view);
//        });
//    }
//}
