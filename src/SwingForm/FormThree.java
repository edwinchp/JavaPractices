package SwingForm;
import javax.swing.*;
public class FormThree extends JFrame {

    private JLabel title;
    private JLabel text;

    //constructor
    public FormThree(){
        setLayout(null);//coordinates

        title = new JLabel("This is a title :D");
        title.setBounds(10, 20, 300, 30);
        add(title);//important to add the add lol

        text = new JLabel("This is a paragraph");
        text.setBounds(10,100, 300,30);
        add(text);
    }

    public static void main(String args[]){
        FormThree formObject = new FormThree();
        formObject.setBounds(0,0,300,200);
        //formObject.setResizable(false);
        formObject.setVisible(true);
        formObject.setLocationRelativeTo(null);
    }


}
