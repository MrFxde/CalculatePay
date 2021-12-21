import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton launchButton;
    JLabel label;

    MyFrame () {
/*
        //Attempt at making a text explaining how it works
        label = new JLabel(); //create label
        label.setText("This program gives your weekly gross and net pay. Just click launch and input your pay per hour and hours!");  //set text of label
        //label.setHorizontalTextPosition(JLabel.LEFT);
        //label.setVerticalAlignment(JLabel.TOP);
        //label.setForeground(new Color(0,0,0));
        label.setFont(new Font("MV Boli", Font.PLAIN, 18));

 */
        label = new JLabel();
        launchButton = new JButton();
        launchButton.setBounds(200,100,300,50);
        launchButton.addActionListener(this);
        launchButton.setText("Click her to calculate your pay");

        this.setTitle("Calculate Weekly Pay");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(label);
        this.add(launchButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == launchButton) {
            CalculatePay.askForInfo();
        }
    }
}
