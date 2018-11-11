/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_proj2;

/**
 *
 * @author yilei
 */

import java.awt.*;
import java.awt.event.*;

import oop_proj1.*;

public class Front extends Frame implements ActionListener, TextListener {

    //field
    TextField tf1 = new TextField(10);
    TextField tf2 = new TextField(10);
    Button b1 = new Button("Log in");
    Button b2 = new Button("Exit");
	
    //constructor
    public Front() {
		
	//container
	Frame f = new Frame();
	f.setTitle("Employee System Log In");
	f.setBounds(10,10,800,600);
	f.setVisible(true);
		
        //layout
	GridLayout gl = new GridLayout(6, 1);
	f.setLayout(gl);
		
	//components
	Font ft = new Font("Times New Romans", Font.BOLD, 18);
		
	//top
	Label lTop = new Label("Welcome to Employee System", Label.CENTER);
	lTop.setFont(ft);
	lTop.setForeground(Color.blue);
		
	f.add(lTop);
		
	//middle
	Panel p2 = new Panel();
	f.add(p2);
	Panel p3 = new Panel();
		
	Label l1 = new Label("User name: ");
	tf1.addTextListener(this);
	p3.add(l1); p3.add(tf1);
		
	Label l2 = new Label("Password: ");
	tf2.addTextListener(this);
	tf2.setEchoChar('*');			//make tf2 to be '*'
	p3.add(l2); p3.add(tf2);
		
	f.add(p3);
		
	//bottom
	Panel p4 = new Panel();
		
	b1.addActionListener(this);
	b2.addActionListener(this);
	p4.add(b1); p4.add(b2);
		
	f.add(p4);
		
	//default closure operation
	f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
		System.exit(0);
            }
	});
		
	}

	@Override
	public void textValueChanged(TextEvent arg0) {
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
            String un = tf1.getText();
            String pw = tf2.getText();
		
            if(event.getSource()==b1) {
                if(un.equals("oop") && pw.equals("oop")) {
                    new SelectMenu();
		}
            }else if(event.getSource()==b2) {
		System.exit(0);
            }
		
	}
	
}
