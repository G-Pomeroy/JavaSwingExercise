import javax.swing.*;
import java.awt.*;

public class SwingWindow extends JFrame{
    public SwingWindow() {

        //Left panel
        JPanel leftPanel = new JPanel();
        leftPanel.setSize(300, 200);
        leftPanel.setLocation(0, 50);
        leftPanel.setBackground(new Color(0, 0, 255));

        //Right Panel
        JPanel rightPanel = new JPanel();
        rightPanel.setSize(300, 200);
        rightPanel.setLocation(300, 50);
        rightPanel.setBackground(new Color(255, 0, 0));

        //Left Button
        JButton leftButton = new JButton("Toggle Left");
        leftButton.setBounds(75,0,150,50);

        //Right Button
        JButton rightButton = new JButton("Toggle Right");
        rightButton.setBounds(375,0,150,50);

        //Left Label
        JLabel leftLabel = new JLabel("This is the left panel",JLabel.CENTER);
        leftLabel.setFont(new Font("Serif", Font.BOLD, 30));
        leftLabel.setSize(300, 200);
        leftLabel.setLocation(0, 50);
        leftLabel.setForeground(Color.red);
        leftLabel.setBackground(new Color(255, 0, 0));

        //Right label
        JLabel rightLabel = new JLabel("This is the right panel",JLabel.CENTER);
        rightLabel.setFont(new Font("Serif", Font.BOLD, 30));
        rightLabel.setSize(300, 200);
        rightLabel.setLocation(0, 50);
        rightLabel.setForeground(Color.blue);
        rightLabel.setBackground(new Color(0, 0, 255));


        leftPanel.add(leftLabel);
        rightPanel.add(rightLabel);


        add(leftPanel);
        add(rightPanel);
        add(leftButton);
        add(rightButton);


        setLayout(null);
        setSize(613,300);
        setVisible(true);
    }








}
