import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class calcu extends JFrame implements ActionListener {
  JTextField t;
  JPanel l1, l2, l3, l4, l5;
  JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, beq, bclr, bdec;
  double a, b, result;
  int op;

  calcu() {
    setTitle("Calculator");
    setSize(150, 150);
    t = new JTextField(20);
    b0 = new JButton("0");
    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    badd = new JButton("+");
    bsub = new JButton("-");
    bmul = new JButton("*");
    bdiv = new JButton("/");
    bclr = new JButton("CLR");
    bdec = new JButton(".");
    beq = new JButton("=");
    l1 = new JPanel();
    l2 = new JPanel();
    l3 = new JPanel();
    l4 = new JPanel();
    l5 = new JPanel();
    l5.add(t);
    l1.add(b1);
    l1.add(b2);
    l1.add(b3);
    l1.add(badd);
    l2.add(b4);
    l2.add(b5);
    l2.add(b6);
    l2.add(bsub);
    l3.add(b7);
    l3.add(b8);
    l3.add(b9);
    l3.add(bmul);
    l4.add(b0);
    l4.add(bdiv);
    l4.add(bclr);
    l4.add(beq);
    l4.add(bdec);
    add(b0);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);
    add(badd);
    add(bsub);
    add(bmul);
    add(bdiv);
    add(bdec);
    add(bclr);
    add(beq);
    add(t);
    add(l5);
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(3);
    b0.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b9.addActionListener(this);
    badd.addActionListener(this);
    bsub.addActionListener(this);
    bmul.addActionListener(this);
    bdiv.addActionListener(this);
    bdec.addActionListener(this);
    beq.addActionListener(this);
    bclr.addActionListener(this);
    b8.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b0)
      t.setText(t.getText().concat("0"));
    if (e.getSource() == b1)
      t.setText(t.getText().concat("1"));
    if (e.getSource() == b2)
      t.setText(t.getText().concat("2"));
    if (e.getSource() == b3)
      t.setText(t.getText().concat("3"));
    if (e.getSource() == b4)
      t.setText(t.getText().concat("4"));
    if (e.getSource() == b5)
      t.setText(t.getText().concat("5"));
    if (e.getSource() == b6)
      t.setText(t.getText().concat("6"));
    if (e.getSource() == b7)
      t.setText(t.getText().concat("7"));
    if (e.getSource() == b8)
      t.setText(t.getText().concat("8"));
    if (e.getSource() == b9)
      t.setText(t.getText().concat("9"));
    if (e.getSource() == bclr) {
      t.setText((""));
    }
    if (e.getSource() == bdec)
      t.setText(t.getText().concat("."));
    if (e.getSource() == badd) {
      a = Double.parseDouble(t.getText());
      op = 1;
      t.setText("");
    }
    if (e.getSource() == bdiv) {
      a = Double.parseDouble(t.getText());
      op = 4;
      t.setText("");
    }
    if (e.getSource() == bsub) {
      a = Double.parseDouble(t.getText());
      op = 2;
      t.setText("");
    }
    if (e.getSource() == bmul) {
      a = Double.parseDouble(t.getText());
      op = 3;
      t.setText("");
    }

    if (e.getSource() == beq) {
      b = Double.parseDouble(t.getText());
      if (op == 1) {
        result = a + b;
        t.setText("" + result);
      }
      if (op == 2) {
        result = a - b;
        t.setText("" + result);
      }
      if (op == 3) {
        result = a * b;
        t.setText("" + result);
      }
      if (op == 4) {
        try {
          if (b == 0) {
            throw new ArithmeticException();
          } else {
            result = a / b;
            t.setText("" + result);
          }
        } catch (ArithmeticException ie) {
          t.setText("DIVISION BY ZERO");
        }
      }

    }
  }

  public static void main(String args[]) {
    calcu c = new calcu();
  }
}
