package frameSystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.calculation_lib;

public class FrameSystem_view 
extends Frame implements ActionListener,WindowListener{

private TextField text1 = new TextField("",10);
private TextField text2 = new TextField("",10);
private TextField text3 = new TextField("",10);
private TextField text4 = new TextField("",10);
private Button button1 = new Button("足し算");



	public FrameSystem_view(){
		setTitle("FrameSystem");
		addWindowListener(this);
	
		setLayout(new FlowLayout(FlowLayout.CENTER));

    add(text1);
    
    add(new Label("+"));

    add(text2);

    add(button1);
    
    add(new Label("答え"));
   
    add(text3);
    
    add(new Label("引き算"));
   
    add(new Label("-"));
    
    add(new Label("答え"));
    
    add(text4);
   
    button1.addActionListener(this);
 
    
	
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
	calculation_lib clib = new calculation_lib(val1, val2);

	text3.setText(String.valueOf(clib.getPlus()));
	text4.setText(String.valueOf(clib.getMinus()));
	


		
	}
	

}
