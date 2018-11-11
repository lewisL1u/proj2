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

public class TotalNumber extends Employer implements ItemListener, ActionListener {

    //field main
    Frame f = new Frame();
    TextArea ta;
    GridLayout gl;
    Font ft;
    Panel p1, p2, p3, p4, p5;
    Label lTop;

    //field
    Checkbox cb1 = new Checkbox("Register");
    Checkbox cb2 = new Checkbox("Search by Id");
    Checkbox cb3 = new Checkbox("Total Number");
    Checkbox cb4 = new Checkbox("List");
    Checkbox cb5 = new Checkbox("Quit");

    //field(TotalNumber)
    TextField tf1 = new TextField(10);
    Button b = new Button("Number");

    //constructor
    public TotalNumber(){
        
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

        //middle(TotalNumber)
        p4 = new Panel();

        b.addActionListener(this);
        p4.add(b);
        f.add(p4);

        p5 = new Panel();

        ta = new TextArea(1, 60);
        ta.setVisible(true);
        p5.add(ta);
        f.add(p5);

        //event
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        String choice = (String)e.getItem();

        switch(choice) {
            case "Register":
                Register reg = new Register();
                break;
            case "Search by Id":
                Search search = new Search();
                break;
            case "Total Number":
                TotalNumber tn = new TotalNumber();
                break;
            case "List":
                List list = new List();
                break;
            case "Quit":
                System.exit(0);
                break;

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Employer employer = new Employer();
        ta.setText("TOTAL NUMBER OF EMPLOYEE: " + employer.count());

    }

}
