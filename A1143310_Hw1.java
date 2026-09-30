import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A1143310_Hw1 extends JFrame implements ActionListener {
    static A1143310_Hw1 frm = new A1143310_Hw1();
    static JPanel pne = new JPanel();
    static JButton btn = new JButton("擲骰子");
    static JLabel lab = new JLabel();
    static JLabel lab2 = new JLabel();
    static int times = 0;
    static int total = 0;

    public static void main(String args[]) {
        frm.setTitle("骰子模擬器");
        BorderLayout border = new BorderLayout(2, 5);
        frm.setLayout(border);
        frm.add(btn, BorderLayout.SOUTH);
        frm.add(lab, BorderLayout.CENTER);
        frm.add(lab2, BorderLayout.NORTH);
        int number = 0;
        String dice = String.valueOf(number);
        lab.setText(dice);
        lab.setFont(lab.getFont().deriveFont(60f));
        lab.setHorizontalAlignment(JLabel.CENTER);
        lab2.setText("已擲0次,總和0,平均0");
        lab2.setHorizontalAlignment(JLabel.CENTER);
        btn.addActionListener(frm);
        frm.setSize(400, 320);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int number = (int) (Math.random() * 6) + 1;
        times++;
        total += number;
        double avg = (double) total / times;
        lab.setText(String.valueOf(number));
        if (number == 6) {
            lab.setForeground(Color.GREEN);
        } else if (number == 1) {
            lab.setForeground(Color.RED);
        } else {
            lab.setForeground(Color.BLACK);
        }
        lab2.setText(String.format("已擲%d次,總和%d,平均%.2f", times, total, avg));
    }
}
