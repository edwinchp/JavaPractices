package SwingForm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormButton extends JFrame implements ActionListener {
    JButton close;
    //constructor
    public FormButton(){
        setLayout(null);//put components using coordinates
        close = new JButton("Close");
        //position in the form
        close.setBounds(300,250,100,30);
        add(close);
        //waiting the event to close variable
        close.addActionListener(this);
    }
    //capturing the event
    public void actionPerformed(ActionEvent eventName){
        if (eventName.getSource() == close){
            System.exit(0);
        }
    }

    public static void main(String args[]){
        FormButton formObject = new FormButton();
        formObject.setBounds(0,0,400,350);//form dimension
        formObject.setVisible(true);
        formObject.setResizable(false);
        formObject.setLocationRelativeTo(null);
    }


}
