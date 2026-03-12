package Calculatorr;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Calc {

    private JFrame frame;
    private JTextField textField;
    double intI , intII,total;
    String action ; //contain +,-*,/
    String answer;//contain the final sol
    static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calc window = new Calc();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Calc() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 620, 528);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(20, 10, 565, 80);
        textField.setFont(new Font("Algerian", Font.BOLD, 26));
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnSin = new JButton("Sin");
        btnSin.setFont(new Font("Arial", Font.BOLD, 20));
        btnSin.setBounds(20, 107, 78, 62);
        btnSin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI=Double.parseDouble(textField.getText());
                String a=String.format("Sin(%.1f) ", intI);
                textField.setText(a);
                action="sin";
            }
        });
        frame.getContentPane().add(btnSin);

        JButton btnPlus = new JButton("+");
        btnPlus.setFont(new Font("Arial", Font.BOLD, 25));
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI=Double.parseDouble(textField.getText());
                textField.setText("");
                action ="+";
            }
        });
        btnPlus.setBounds(465, 179, 120, 62);
        frame.getContentPane().add(btnPlus);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textField.getText()+btn7.getText();
                textField.setText(number);
            }
        });
        btn7.setFont(new Font("Arial", Font.BOLD, 25));
        btn7.setBounds(20, 179, 78, 62);
        frame.getContentPane().add(btn7);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textField.getText()+btn4.getText();
                textField.setText(number);
            }
        });
        btn4.setFont(new Font("Arial", Font.BOLD, 25));
        btn4.setBounds(20, 251, 78, 62);
        frame.getContentPane().add(btn4);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textField.getText()+btn1.getText();
                textField.setText(number);
            }
        });
        btn1.setFont(new Font("Arial", Font.BOLD, 25));
        btn1.setBounds(20, 323, 78, 62);
        frame.getContentPane().add(btn1);

        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textField.getText()+btn0.getText();
                textField.setText(number);
            }
        });
        btn0.setFont(new Font("Arial", Font.BOLD, 25));
        btn0.setBounds(20, 395, 166, 62);
        frame.getContentPane().add(btn0);

        JButton btnCos = new JButton("Cos");
        btnCos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI=Double.parseDouble(textField.getText());
                String a=String.format("Cos(%.1f) ", intI);
                textField.setText(a);
                action="cos";
            }
        });
        btnCos.setFont(new Font("Arial", Font.BOLD, 20));
        btnCos.setBounds(115, 107, 78, 62);
        frame.getContentPane().add(btnCos);

        JButton btntan = new JButton("Tan");
        btntan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI=Double.parseDouble(textField.getText());
                String a=String.format("Tan(%.1f) ", intI);
                textField.setText(a);
                action="tan";
            }
        });
        btntan.setFont(new Font("Arial", Font.BOLD, 20));
        btntan.setBounds(201, 106, 78, 62);
        frame.getContentPane().add(btntan);

        JButton btnBS = new JButton("X");
        btnBS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bck=null;
                if(textField.getText().length()>0) {
                    StringBuilder str=new StringBuilder(textField.getText());
                    str.deleteCharAt(textField.getText().length()-1);
                    bck=str.toString();
                    textField.setText(bck);
                }
            }
        });
        btnBS.setFont(new Font("Arial", Font.BOLD, 20));
        btnBS.setBounds(289, 106, 78, 62);
        frame.getContentPane().add(btnBS);

        JButton btnC = new JButton("AC");
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
            }
        });
        btnC.setFont(new Font("Arial", Font.BOLD, 22));
        btnC.setBounds(377, 106, 208, 62);
        frame.getContentPane().add(btnC);

        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textField.getText()+btnDot.getText();
                textField.setText(number);
            }
        });
        btnDot.setFont(new Font("Arial Black", Font.BOLD, 25));
        btnDot.setBounds(201, 393, 78, 62);
        frame.getContentPane().add(btnDot);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textField.getText()+btn8.getText();
                textField.setText(number);
            }
        });
        btn8.setFont(new Font("Arial", Font.BOLD, 25));
        btn8.setBounds(115, 179, 78, 62);
        frame.getContentPane().add(btn8);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textField.getText()+btn5.getText();
                textField.setText(number);
            }
        });
        btn5.setFont(new Font("Arial", Font.BOLD, 25));
        btn5.setBounds(115, 251, 78, 62);
        frame.getContentPane().add(btn5);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textField.getText()+btn2.getText();
                textField.setText(number);
            }
        });
        btn2.setFont(new Font("Arial", Font.BOLD, 25));
        btn2.setBounds(115, 323, 78, 62);
        frame.getContentPane().add(btn2);

        JButton btnEqul = new JButton("=");
        btnEqul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(action=="+")
                {
                    intII= Double.parseDouble(textField.getText());
                    total=intI+intII;
                    answer=String.format("%.1f + %.1f = %.2f", intI, intII, total);
                    textField.setText(answer);

                }
                else if(action=="-")
                {
                    intII= Double.parseDouble(textField.getText());
                    total=intI-intII;
                    answer=String.format("%.1f - %.1f = %.2f", intI, intII, total);
                    textField.setText(answer);
                }
                else if(action=="*")
                {    intII= Double.parseDouble(textField.getText());
                    total=intI*intII;
                    answer=String.format("%.1f * %.1f = %.2f", intI, intII, total);
                    textField.setText(answer);
                }
                else if(action=="/")
                {    intII= Double.parseDouble(textField.getText());
                    total=intI/intII;
                    answer=String.format("%.1f / %.1f = %.2f", intI, intII, total);
                    textField.setText(answer);
                }
                else if(action=="sin") {
                    total=Math.sin(intI);
                    answer=String.format("Sin(%.1f) = %.2f", intI,total);
                    textField.setText(answer);
                }
                else if(action=="cos") {
                    total=Math.cos(intI);
                    answer=String.format("Cos(%.1f) = %.2f ",intI, total );
                    textField.setText(answer);
                }
                else if(action=="tan") {
                    total=Math.tan(intI);
                    answer=String.format("Tan(%.1f) = %.2f ",intI, total );
                    textField.setText(answer);
                }
                else if(action=="sqrt") {
                    total=Math.sqrt(intI);
                    answer=String.format("Sqrt(%.1f) = %.2f", intI,total);
                    textField.setText(answer);
                }
                else if(action=="log") {
                    total=Math.log(intI);
                    answer=String.format("log(%.1f) = %.2f", intI,total);
                    textField.setText(answer);
                }
                else if(action=="power") {
                    total=intI*intI;
                    answer=String.format("%.1f^2 = %.2f", intI,total);
                    textField.setText(answer);
                }
                else if(action=="power2") {
                    intII= Double.parseDouble(textField.getText());
                    total=Math.pow(intI, intII);
                    answer=String.format("%.1f^%.1f = %.2f", intI,intII,total);
                    textField.setText(answer);
                }
                else if(action=="cube") {
                    total=intI*intI*intI;
                    answer=String.format("%.1f^3 = %.2f", intI,total);
                    textField.setText(answer);
                }
                else if(action=="fact") {
                    int num1=(int)intI;
                    long res=factorial(num1);
                    answer=String.format("%.1f ! = %d", intI,res);
                    textField.setText(answer);
                }
            }
        });
        btnEqul.setFont(new Font("Arial", Font.BOLD, 25));
        btnEqul.setBounds(289, 395, 166, 62);
        frame.getContentPane().add(btnEqul);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textField.getText()+btn9.getText();
                textField.setText(number);
            }
        });
        btn9.setFont(new Font("Arial", Font.BOLD, 25));
        btn9.setBounds(201, 179, 78, 62);
        frame.getContentPane().add(btn9);

        JButton btnX = new JButton("x^2");
        btnX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI= Double.parseDouble(textField.getText());
                String a=intI + "^2 ";
                textField.setText(a);
                action="power";
            }
        });
        btnX.setFont(new Font("Arial", Font.BOLD, 21));
        btnX.setBounds(289, 180, 78, 62);
        frame.getContentPane().add(btnX);

        JButton btnFact = new JButton("x!");
        btnFact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI= Double.parseDouble(textField.getText());
                String a=intI + " ! ";
                textField.setText(a);
                action="fact";
            }
        });
        btnFact.setFont(new Font("Arial", Font.BOLD, 21));
        btnFact.setBounds(377, 180, 78, 62);
        frame.getContentPane().add(btnFact);

        JButton btnXy = new JButton("x^y");
        btnXy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI= Double.parseDouble(textField.getText());
                textField.setText("");
                action="power2";
            }
        });
        btnXy.setFont(new Font("Arial", Font.BOLD, 21));
        btnXy.setBounds(377, 252, 78, 62);
        frame.getContentPane().add(btnXy);

        JButton btnx3 = new JButton("x^3");
        btnx3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI= Double.parseDouble(textField.getText());
                String a=intI + "^3 ";
                textField.setText(a);
                action="cube";
            }
        });
        btnx3.setFont(new Font("Arial", Font.BOLD, 21));
        btnx3.setBounds(289, 252, 78, 62);
        frame.getContentPane().add(btnx3);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textField.getText()+btn6.getText();
                textField.setText(number);
            }
        });
        btn6.setFont(new Font("Arial", Font.BOLD, 25));
        btn6.setBounds(201, 251, 78, 62);
        frame.getContentPane().add(btn6);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textField.getText()+btn3.getText();
                textField.setText(number);
            }
        });
        btn3.setFont(new Font("Arial", Font.BOLD, 25));
        btn3.setBounds(201, 323, 78, 62);
        frame.getContentPane().add(btn3);

        JButton btnSqrt = new JButton("Sqrt");
        btnSqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI=Double.parseDouble(textField.getText());
                String a=String.format("Sqrt(%.1f) ", intI);
                textField.setText(a);
                action="sqrt";
            }
        });
        btnSqrt.setFont(new Font("Arial", Font.BOLD, 20));
        btnSqrt.setBounds(289, 324, 78, 62);
        frame.getContentPane().add(btnSqrt);

        JButton btnLog = new JButton("log");
        btnLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI=Double.parseDouble(textField.getText());
                String a=String.format("log(%.1f) ", intI);
                textField.setText(a);
                action="log";
            }
        });
        btnLog.setFont(new Font("Arial", Font.BOLD, 21));
        btnLog.setBounds(377, 324, 78, 62);
        frame.getContentPane().add(btnLog);

        JButton btnMins = new JButton("-");
        btnMins.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI=Double.parseDouble(textField.getText());
                textField.setText("");
                action ="-";
            }
        });
        btnMins.setFont(new Font("Arial Black", Font.BOLD, 25));
        btnMins.setBounds(465, 249, 120, 62);
        frame.getContentPane().add(btnMins);

        JButton btnMultiply = new JButton("X");
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI=Double.parseDouble(textField.getText());
                textField.setText("");
                action ="*";
            }
        });
        btnMultiply.setFont(new Font("Arial", Font.BOLD, 20));
        btnMultiply.setBounds(465, 324, 120, 62);
        frame.getContentPane().add(btnMultiply);

        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                intI=Double.parseDouble(textField.getText());
                textField.setText("");
                action ="/";
            }
        });
        btnDivide.setFont(new Font("Arial Black", Font.BOLD, 25));
        btnDivide.setBounds(465, 393, 120, 62);
        frame.getContentPane().add(btnDivide);

        JRadioButton btnOpen = new JRadioButton("Open");
        btnOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnSin.setEnabled(true);
                btnCos.setEnabled(true);
                btntan.setEnabled(true);
                btnX.setEnabled(true);
                btnFact.setEnabled(true);
                btnLog.setEnabled(true);
                btnXy.setEnabled(true);
                btnx3.setEnabled(true);
                btnSqrt.setEnabled(true);
            }
        });
        btnOpen.setFont(new Font("Arial", Font.BOLD, 20));
        btnOpen.setBounds(20, 463, 102, 22);
        frame.getContentPane().add(btnOpen);

        JRadioButton btnClose = new JRadioButton("Close");
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnSin.setEnabled(false);
                btnCos.setEnabled(false);
                btntan.setEnabled(false);
                btnX.setEnabled(false);
                btnFact.setEnabled(false);
                btnLog.setEnabled(false);
                btnXy.setEnabled(false);
                btnx3.setEnabled(false);
                btnSqrt.setEnabled(false);
            }
        });
        btnClose.setFont(new Font("Arial", Font.BOLD, 20));
        btnClose.setBounds(483, 461, 102, 22);
        frame.getContentPane().add(btnClose);
    }
}
