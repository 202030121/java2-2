import javax.swing.*; 
import java.awt.*;

public class CheckBoxEx extends JFrame {
    public CheckBoxEx() {
        setTitle("체크박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon sky = new ImageIcon("./img/s.jpg");

        //3개의 체크박스 생성  
        JCheckBox apple = new JCheckBox("사과");
        JCheckBox pear = new JCheckBox("배", true); //선택 상태의 체크박스 생성
        JCheckBox cherry = new JCheckBox("체리", sky);

        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(250, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
