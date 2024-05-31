import javax.swing.*; 
import java.awt.*;

public class LabelEx extends JFrame {
    public LabelEx() {
        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel textLabel = new JLabel("하늘");

        ImageIcon img = new ImageIcon("./img/s.jpg");
        JLabel imageLabel = new JLabel(img);

        ImageIcon icon = new ImageIcon("./img/b.jpg");
        JLabel label = new JLabel("그냥 하늘", icon, SwingConstants.CENTER);

        c.add(textLabel); c.add(imageLabel); c.add(label);
        setSize(300, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new LabelEx();
    }
}