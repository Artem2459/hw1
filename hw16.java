
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hw16 extends JFrame {
    private int lastX, lastY;
    private Color currentColor = Color.BLACK;
    private JButton clearButton, starButton, triangleButton;
    private JPanel buttonPanel;
    private DrawArea drawArea;

    public hw16() {
        drawArea = new DrawArea();
        clearButton = new JButton("Clear");
        starButton = new JButton("Star");
        triangleButton = new JButton("Triangle");
        buttonPanel = new JPanel();

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawArea.clear();
            }
        });

        starButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawArea.drawStar();
            }
        });

        triangleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawArea.drawTriangle();
            }
        });

        buttonPanel.add(clearButton);
        buttonPanel.add(starButton);
        buttonPanel.add(triangleButton);

        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        content.add(drawArea, BorderLayout.CENTER);
        content.add(buttonPanel, BorderLayout.SOUTH);

        setTitle("Simple Paint");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class DrawArea extends JComponent {
        private Image image;
        private Graphics2D g2;

        public DrawArea() {
            setDoubleBuffered(false);
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    lastX = e.getX();
                    lastY = e.getY();
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    if (g2 != null) {
                        g2.setColor(currentColor);
                        g2.drawLine(lastX, lastY, e.getX(), e.getY());
                        repaint();
                        lastX = e.getX();
                        lastY = e.getY();
                    }
                }
            });
        }

        protected void paintComponent(Graphics g) {
            if (image == null) {
                image = createImage(getSize().width, getSize().height);
                g2 = (Graphics2D) image.getGraphics();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                clear();
            }
            g.drawImage(image, 0, 0, null);
        }

        public void clear() {
            g2.setPaint(Color.white);
            g2.fillRect(0, 0, getSize().width, getSize().height);
            g2.setPaint(Color.black);
            repaint();
        }

        public void drawStar() {
            int x = getWidth() / 2;
            int y = getHeight() / 2;
            int outerRadius = 50;
            int innerRadius = 25;
            int numPoints = 5;

            double angleIncrement = 2 * Math.PI / numPoints;
            int[] xPoints = new int[numPoints * 2];
            int[] yPoints = new int[numPoints * 2];

            for (int i = 0; i < numPoints * 2; i++) {
                int radius = (i % 2 == 0) ? outerRadius : innerRadius;
                xPoints[i] = (int) (x + radius * Math.cos(i * angleIncrement - Math.PI / 2));
                yPoints[i] = (int) (y + radius * Math.sin(i * angleIncrement - Math.PI / 2));
            }

            g2.setColor(currentColor);
            g2.drawPolygon(xPoints, yPoints, numPoints * 2);
            repaint();
        }

        public void drawTriangle() {
            int x1 = getWidth() / 2;
            int y1 = 50;
            int x2 = 100;
            int y2 = getHeight() - 50;
            int x3 = getWidth() - 100;
            int y3 = getHeight() - 50;

            int[] xPoints = {x1, x2, x3};
            int[] yPoints = {y1, y2, y3};

            g2.setColor(currentColor);
            g2.drawPolygon(xPoints, yPoints, 3);
            repaint();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new hw16();
            }
        });
    }
}
