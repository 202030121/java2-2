import java.awt.*; 
import javax.swing.*;

class TimerThread extends Thread {
    private JLabel timerLabel; // 타이머 값이 출력되는 레이블 
    public TimerThread(JLabel timerLabel) {
        this.timerLabel = timerLabel; 
    }

    @Override
    public void run() {
        int n=0; // 타이머 카운트 값 
        while(true) { // 무한 루프
            timerLabel.setText(Integer.toString(n)); 
            n++; // 카운트 증가
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) { return;} 
        }
    } 
}

public class ThreadTimerEx extends JFrame { 
    public ThreadTimerEx() {
        setTitle("Thread를 상속받은 타이머 스레드 예제"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Container c = getContentPane();
        c.setLayout(new FlowLayout()); 
 
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80)); 
        c.add(timerLabel);

        TimerThread th = new TimerThread(timerLabel); 
        setSize(250,150);
        setVisible(true);
        th.start();
    }
    public static void main(String[] args) { 
        new ThreadTimerEx();
    } 
}