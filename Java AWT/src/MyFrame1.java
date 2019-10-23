/*

AWT Example by Inheritance

 */


import java.awt.*;
import java.awt.event.WindowEvent;

class MyFrame1 extends Frame{  
        
public MyFrame1() { 

Button b=new Button("click me");
b.setBounds(30,100,80,30);


add(b);
setSize(300,300);
setLayout(null);
setVisible(true);

}

public void windowClosing(WindowEvent e) {
	
	dispose();
	
}

 public static void main(String args[]){

MyFrame1 f = new MyFrame1();

}
}