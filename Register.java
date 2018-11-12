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

public class Register extends FrameBase {

    //field main
    Frame f = new Frame();
    TextArea ta;
    GridLayout gl;
    Font ft;
    Panel p1, p2, p3, p4, p5, p6;
    Label lTop, l1, l2, l3;

    //field(select menu)
    Checkbox cb1 = new Checkbox("Register");
    Checkbox cb2 = new Checkbox("Search by Id");
    Checkbox cb3 = new Checkbox("Total Number");
    Checkbox cb4 = new Checkbox("List");
    Checkbox cb5 = new Checkbox("Quit");

    //field(register)
    TextField tf1 = new TextField(10);
    TextField tf2 = new TextField(10);
    TextField tf3 = new TextField(10);
    Button b = new Button("Register");

    
    //constructor
    public Register(){
        
        //super(id, name, dob);
        
        //container
        f.setTitle("Select Menu");
        f.setBounds(10,10,800,600);
        f.setVisible(true);

        //layout
        gl = new GridLayout(6,1);
        f.setLayout(gl);

        //components
        ft = new Font("Times New Romans", Font.BOLD, 18);

        //top
        lTop = new Label("Select Menu", Label.CENTER);
        lTop.setFont(ft);
        lTop.setForeground(Color.blue);

        f.add(lTop);

        //middle
        p2 = new Panel();
        f.add(p2);
        p3 = new Panel();

        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        cb5.addItemListener(this);

        p3.add(cb1); p3.add(cb2); p3.add(cb3); p3.add(cb4); p3.add(cb5); 
        f.add(p3);

        //middle(register)
        p4 = new Panel();

        l1 = new Label("Id");
        tf1.addTextListener(this);
        p4.add(l1); p4.add(tf1);

        l2 = new Label("Name");
        tf2.addTextListener(this);
        p4.add(l2); p4.add(tf2);

        l3 = new Label("DOB");
        tf3.addTextListener(this);
        p4.add(l3); p4.add(tf3);

        f.add(p4);

        //bottom
        p5 = new Panel();

        b.addActionListener(this);
        p5.add(b);
        f.add(p5);

        p6 = new Panel();

        ta = new TextArea(2, 60);	//import get info
        ta.setVisible(true);
        p6.add(ta);
        f.add(p6);

        //event
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });

    }

    

    @Override
    public void actionPerformed(ActionEvent e) {

        String id = tf1.getText();
        String name = tf2.getText();
        String dob = tf3.getText();
        // init new employee
        Employee employee = new Employee(id, name, dob);
        // register
        this.db.register(employee);
        
        ta.setText(id + " " + name + " " + dob + 
            ".......................... registered successfully!");     //import getInfo
        ta.setVisible(false);

    }

    @Override
    public void textValueChanged(TextEvent arg0) {
        
    }

}
