import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    public NullContainerEx() {
        setTitle("절대 위치 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null); // 컨텐츠팬의 배치관리자 제거

        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setBounds(130, 50, 200, 20);
        contentPane.add(la);

        for(int i=1; i<10; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i*15, i*15);
            b.setSize(50, 20);
            contentPane.add(b);
        }

        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new NullContainerEx();
    }
}