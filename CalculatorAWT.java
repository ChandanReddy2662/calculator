package calculator;


import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT extends Frame implements ActionListener
{
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button bx;
    private Button bd;
    private Button ba;
    private Button bs;
    private Button bc;
    private Button be;

    private Button bp;

    private TextField enter;
    public CalculatorAWT()
    {
//        this.setLayout(new BorderLayout());

        this.b1 = new Button("1");
        this.b2 = new Button("2");
        this.b3 = new Button("3");
        this.b4 = new Button("4");
        this.b5 = new Button("5");
        this.b6 = new Button("6");
        this.b7 = new Button("7");
        this.b8 = new Button("8");
        this.b9 = new Button("9");
        this.b0 = new Button("0");
        this.ba = new Button("+");
        this.bs = new Button("-");
        this.bx = new Button("*");
        this.bd = new Button("/");
        this.bc = new Button("C");
        this.be = new Button("=");
        this.bp = new Button(".");
        this.enter = new TextField(15);
        this.add(this.enter);
        this.enter.setBounds(20, 20, 230, 50);
        this.add(this.b1);
        this.b1.setBounds(20, 80, 50, 50);
        this.add(this.b2);
        this.b2.setBounds(80, 80, 50, 50);
        this.add(this.b3);
        this.b3.setBounds(140, 80, 50, 50);
        this.add(this.ba);
        this.ba.setBounds(200, 80, 50, 50);
        this.add(this.b4);
        this.b4.setBounds(20, 140, 50, 50);
        this.add(this.b5);
        this.b5.setBounds(80, 140, 50, 50);
        this.add(this.b6);
        this.b6.setBounds(140, 140, 50, 50);
        this.add(this.bs);
        this.bs.setBounds(200, 140, 50, 50);
        this.add(this.b7);
        this.b7.setBounds(20, 200, 50, 50);
        this.add(this.b8);
        this.b8.setBounds(80, 200, 50, 50);
        this.add(this.b9);
        this.b9.setBounds(140, 200, 50, 50);
        this.add(this.bx);
        this.bx.setBounds(200, 200,50, 50);
        this.add(this.bp);
        this.bp.setBounds(20, 260, 50,50);
        this.add(this.b0);
        this.b0.setBounds(80, 260,50, 50);
        this.add(this.be);
        this.be.setBounds(140, 260, 50, 50);
        this.add(this.bd);
        this.bd.setBounds(200, 260, 50,50);
        this.add(this.bc);
        this.bc.setBounds(110, 320, 50, 50);

    }
    public static void main(String[] args)
    {
        CalculatorAWT c = new CalculatorAWT();
        c.setSize(800,800);
        c.setTitle("MyCalculator");
        c.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        c.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {

    }
}
