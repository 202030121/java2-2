import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
    private String [] fruits = {"sky1", "sky2", "sky3"}; 
    private ImageIcon [] images = { new ImageIcon("./img/s.jpg"),
                            new ImageIcon("./img/ss.jpg"), 
                            new ImageIcon("./img/sss.jpg") };
    private JLabel imgLabel = new JLabel(images[0]); 

    public ComboActionEx() { 
        setTitle("콤보박스 활용 예제");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JComboBox<String> combo = new JComboBox<String>(fruits);
        c.add(combo); c.add(imgLabel);

        combo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> cb = (JComboBox<String>)e.getSource();
                int index = cb.getSelectedIndex();
                imgLabel.setIcon(images[index]);
            }
        });

        setSize(500, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ComboActionEx();
    }
}