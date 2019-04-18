package SwingForm;
import javax.swing.*;
public class FormTwo extends JFrame{
    //create constructor
    public FormTwo(){
        setLayout(null);//use of coordinate
    }

    public static void main(String args[]){
        FormTwo formObject = new FormTwo();
        //interface position and dimensions
        formObject.setBounds(300,500,400,550);
        formObject.setVisible(true); //make visible

        //start in center of screen
        formObject.setLocationRelativeTo(null);
        formObject.setResizable(false);
    }
}
