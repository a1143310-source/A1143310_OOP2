import javax.swing.*;
import java.awt.*;

public class A1143310_Hw1 {
    static JFrame frm = new JFrame("骰子模擬器");
    static JPanel pne = new JPanel();
    static JButton btn = new JButton("擲骰子");
    static JLabel lab = new JLabel();
    static JLabel lab2 = new JLabel();

    public static void main(String args[]) {
        BorderLayout border = new BorderLayout(2, 5);
        frm.setLayout(border);
        frm.add(btn, BorderLayout.SOUTH);
        frm.add(lab, BorderLayout.CENTER);
        frm.add(lab2, BorderLayout.NORTH);
        int number = 1;
        String dice = String.valueOf(number);
        lab.setText(dice);
        lab.setFont(lab.getFont().deriveFont(60f));
        lab.setHorizontalAlignment(JLabel.CENTER);
        int times = 1;
        int total = 1;
        lab2.setText("已擲" + times + "次,總和" + total + ",平均" + total / times);
        lab2.setHorizontalAlignment(JLabel.CENTER);
        frm.setSize(400, 320);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}