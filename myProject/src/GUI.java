import java.util.Scanner;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class GUI {
    public GUI(){
        int x;
    Frame frame = new Frame("My first gui in java ");
    Button btn = new Button("Compute");
    Label label = new Label("Enter any number -> ");
    Label name = new Label("My name is Yash and I am a coder . .");
    Scanner sc = new Scanner(System.in);
    Label result = new Label();
    TextField number = new TextField();
        frame.setBackground(Color.black);
                label.setBounds(800,60,150,30);
                label.setBackground(Color.red);
                label.setForeground(Color.white);
                number.setBounds(800,90,150,30);
                number.setBackground(Color.yellow);
                number.setForeground(Color.black);
                btn.setBounds(800,150,100,30);
                btn.setBackground(Color.green);
                result.setBounds(800,200,150,30);
                btn.setForeground(Color.black);
                name.setBounds(700,400,300,60);
                name.setBackground(Color.green);

                frame.add(name);
                frame.add(btn);
                frame.add(label);
                frame.add(number);
                frame.add(result);

                frame.setSize(45,78);
                frame.setLayout(null);
                frame.setVisible(true);

                frame.addWindowListener(new

    WindowAdapter() {
        @Override
        public void windowClosing (WindowEvent myWindow){
            frame.dispose();
        }
    });


               String s =  number.getText();
               x = Integer.parseInt(s);
        if (x%2==0) {
            result.setText("This number is even");
        }
        else {
            result.setText("This number is odd");
        }

}
    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}


















