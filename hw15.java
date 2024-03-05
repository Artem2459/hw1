//////
//////import javax.swing.*;
//////import java.awt.*;
//////import java.awt.event.ActionEvent;
//////import java.awt.event.ActionListener;
//////
//////public class hw15 {
//////    private JFrame frame;
//////    private JTextField display;
//////    private JButton[] buttons;
//////
//////    private double num1, num2, result;
//////    private char operator;
//////
//////    public hw15() {
//////        frame = new JFrame("Калькулятор с плитками");
//////        frame.setSize(300, 400);
//////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//////        frame.setLayout(new BorderLayout());
//////        frame.getContentPane().setBackground(Color.WHITE);
//////
//////        display = new JTextField();
//////        display.setEditable(false);
//////        display.setBackground(Color.WHITE);
//////        display.setBorder(BorderFactory.createCompoundBorder(
//////                BorderFactory.createLineBorder(Color.BLACK, 1),
//////                BorderFactory.createEmptyBorder(5, 5, 5, 5)
//////        ));
//////        display.setFont(new Font("Arial", Font.PLAIN, 24));
//////        frame.add(display, BorderLayout.NORTH);
//////
//////        JPanel buttonPanel = new JPanel();
//////        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
//////        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//////        buttonPanel.setBackground(Color.WHITE);
//////
//////        buttons = new JButton[16];
//////        String[] buttonLabels = {
//////                "7", "8", "9", "/",
//////                "4", "5", "6", "*",
//////                "1", "2", "3", "-",
//////                "0", ".", "=", "+"
//////        };
//////
//////        for (int i = 0; i < 16; i++) {
//////            buttons[i] = new JButton(buttonLabels[i]);
//////            buttons[i].setFont(new Font("Arial", Font.PLAIN, 18));
//////            buttons[i].setBackground(Color.LIGHT_GRAY);
//////            buttons[i].setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
//////            buttons[i].setOpaque(true);
//////            buttons[i].setFocusPainted(false);
//////            buttons[i].addActionListener(new ButtonClickListener());
//////            buttonPanel.add(buttons[i]);
//////        }
//////
//////        JButton resetButton = new JButton("C");
//////        resetButton.setFont(new Font("Arial", Font.PLAIN, 18));
//////        resetButton.setBackground(Color.RED);
//////        resetButton.setForeground(Color.WHITE);
//////        resetButton.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
//////        resetButton.setOpaque(true);
//////        resetButton.setFocusPainted(false);
//////        resetButton.addActionListener(new ActionListener() {
//////            public void actionPerformed(ActionEvent e) {
//////                display.setText("");
//////            }
//////        });
//////        buttonPanel.add(resetButton);
//////
//////        frame.add(buttonPanel, BorderLayout.CENTER);
//////        frame.setVisible(true);
//////    }
//////
//////    private class ButtonClickListener implements ActionListener {
//////        public void actionPerformed(ActionEvent e) {
//////            String buttonText = ((JButton) e.getSource()).getText();
//////
//////            if (buttonText.matches("[0-9\\.]")) {
//////                display.setText(display.getText() + buttonText);
//////            } else if (buttonText.matches("[\\+\\-\\*/]")) {
//////                num1 = Double.parseDouble(display.getText());
//////                operator = buttonText.charAt(0);
//////                display.setText("");
//////            } else if (buttonText.equals("=")) {
//////                num2 = Double.parseDouble(display.getText());
//////                switch (operator) {
//////                    case '+':
//////                        result = num1 + num2;
//////                        break;
//////                    case '-':
//////                        result = num1 - num2;
//////                        break;
//////                    case '*':
//////                        result = num1 * num2;
//////                        break;
//////                    case '/':
//////                        if (num2 != 0)
//////                            result = num1 / num2;
//////                        else
//////                            result = Double.NaN;
//////                        break;
//////                }
//////                display.setText(String.valueOf(result));
//////            } else if (buttonText.equals("C")) {
//////                display.setText("");
//////            }
//////        }
//////    }
//////
//////    public static void main(String[] args) {
//////        SwingUtilities.invokeLater(new Runnable() {
//////            public void run() {
//////                new hw15();
//////            }
//////        });
//////    }
//////}
////import javax.swing.*;
////import java.awt.*;
////import java.awt.event.ActionEvent;
////import java.awt.event.ActionListener;
////
////public class hw15 {
////    private JFrame frame;
////    private JTextField display;
////    private JButton[] buttons;
////
////    private double num1, num2, result;
////    private char operator;
////
////    public hw15() {
////        frame = new JFrame("Калькулятор с плитками");
////        frame.setSize(300, 400);
////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.setLayout(new BorderLayout());
////        frame.getContentPane().setBackground(Color.WHITE);
////
////        display = new JTextField();
////        display.setEditable(false);
////        display.setBackground(Color.WHITE);
////        display.setBorder(BorderFactory.createCompoundBorder(
////                BorderFactory.createLineBorder(Color.BLACK, 1),
////                BorderFactory.createEmptyBorder(5, 5, 5, 5)
////        ));
////        display.setFont(new Font("Arial", Font.PLAIN, 24));
////        frame.add(display, BorderLayout.NORTH);
////
////        JPanel buttonPanel = new JPanel();
////        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
////        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
////        buttonPanel.setBackground(Color.WHITE);
////
////        buttons = new JButton[16];
////        String[] buttonLabels = {
////                "1", "2", "3", "+",
////                "4", "5", "6", "-",
////                "7", "8", "9", "*",
////                "0", ".", "=", "/"
////        };
////
////        for (int i = 0; i < 16; i++) {
////            buttons[i] = new JButton(buttonLabels[i]);
////            buttons[i].setFont(new Font("Arial", Font.PLAIN, 18));
////            buttons[i].setBackground(Color.LIGHT_GRAY);
////            buttons[i].setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
////            buttons[i].setOpaque(true);
////            buttons[i].setFocusPainted(false);
////            buttons[i].addActionListener(new ButtonClickListener());
////            buttonPanel.add(buttons[i]);
////        }
////
////        frame.add(buttonPanel, BorderLayout.CENTER);
////        frame.setVisible(true);
////    }
////
////    private class ButtonClickListener implements ActionListener {
////        public void actionPerformed(ActionEvent e) {
////            String buttonText = ((JButton) e.getSource()).getText();
////
////            if (buttonText.matches("[0-9\\.]")) {
////                display.setText(display.getText() + buttonText);
////            } else if (buttonText.matches("[\\+\\-\\*/]")) {
////                num1 = Double.parseDouble(display.getText());
////                operator = buttonText.charAt(0);
////                display.setText("");
////            } else if (buttonText.equals("=")) {
////                num2 = Double.parseDouble(display.getText());
////                switch (operator) {
////                    case '+':
////                        result = num1 + num2;
////                        break;
////                    case '-':
////                        result = num1 - num2;
////                        break;
////                    case '*':
////                        result = num1 * num2;
////                        break;
////                    case '/':
////                        if (num2 != 0)
////                            result = num1 / num2;
////                        else
////                            result = Double.NaN;
////                        break;
////                }
////                display.setText(String.valueOf(result));
////            } else if (buttonText.equals("C")) {
////                display.setText("");
////            }
////        }
////    }
////
////    public static void main(String[] args) {
////        SwingUtilities.invokeLater(new Runnable() {
////            public void run() {
////                new hw15();
////            }
////        });
////    }
////}
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class hw15 {
//    private JFrame frame;
//    private JTextField display;
//    private JButton[] buttons;
//
//    private double num1, num2, result;
//    private char operator;
//
//    public hw15() {
//        frame = new JFrame("Калькулятор с плитками");
//        frame.setSize(300, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new BorderLayout());
//        frame.getContentPane().setBackground(Color.WHITE);
//
//        display = new JTextField();
//        display.setEditable(false);
//        display.setBackground(Color.WHITE);
//        display.setBorder(BorderFactory.createCompoundBorder(
//                BorderFactory.createLineBorder(Color.BLACK, 1),
//                BorderFactory.createEmptyBorder(5, 5, 5, 5)
//        ));
//        display.setFont(new Font("Arial", Font.PLAIN, 24));
//        frame.add(display, BorderLayout.NORTH);
//
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
//        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//        buttonPanel.setBackground(Color.WHITE);
//
//        buttons = new JButton[16];
//        String[] buttonLabels = {
//                "1", "2", "3", "+",
//                "4", "5", "6", "-",
//                "7", "8", "9", "*",
//                "0", ".", "=", "/"
//        };
//
//        for (int i = 0; i < 16; i++) {
//            buttons[i] = new JButton(buttonLabels[i]);
//            buttons[i].setFont(new Font("Arial", Font.PLAIN, 18));
//            buttons[i].setBackground(Color.LIGHT_GRAY);
//            buttons[i].setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
//            buttons[i].setOpaque(true);
//            buttons[i].setFocusPainted(false);
//            buttons[i].addActionListener(new ButtonClickListener());
//            buttonPanel.add(buttons[i]);
//        }
//
//        JButton resetButton = new JButton("C");
//        resetButton.setFont(new Font("Arial", Font.PLAIN, 18));
//        resetButton.setBackground(Color.RED);
//        resetButton.setForeground(Color.WHITE);
//        resetButton.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
//        resetButton.setOpaque(true);
//        resetButton.setFocusPainted(false);
//        resetButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                display.setText("");
//            }
//        });
//        buttonPanel.add(resetButton);
//
//        frame.add(buttonPanel, BorderLayout.CENTER);
//        frame.setVisible(true);
//    }
//
//    private class ButtonClickListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            String buttonText = ((JButton) e.getSource()).getText();
//
//            if (buttonText.matches("[0-9\\.]")) {
//                display.setText(display.getText() + buttonText);
//            } else if (buttonText.matches("[\\+\\-\\*/]")) {
//                num1 = Double.parseDouble(display.getText());
//                operator = buttonText.charAt(0);
//                display.setText("");
//            } else if (buttonText.equals("=")) {
//                num2 = Double.parseDouble(display.getText());
//                switch (operator) {
//                    case '+':
//                        result = num1 + num2;
//                        break;
//                    case '-':
//                        result = num1 - num2;
//                        break;
//                    case '*':
//                        result = num1 * num2;
//                        break;
//                    case '/':
//                        if (num2 != 0)
//                            result = num1 / num2;
//                        else
//                            result = Double.NaN;
//                        break;
//                }
//                display.setText(String.valueOf(result));
//            } else if (buttonText.equals("C")) {
//                display.setText("");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new hw15();
//            }
//        });
//    }
//}
