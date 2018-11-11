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

public class SelectMenu extends Frame implements ItemListener{
	
    //field
    Checkbox cb1 = new Checkbox("Register");
    Checkbox cb2 = new Checkbox("Search by Id");
    Checkbox cb3 = new Checkbox("Total Number");
    Checkbox cb4 = new Checkbox("List");
    Checkbox cb5 = new Checkbox("Quit");
	
    //constructor
    public SelectMenu(){
		
        //container
        Frame f = new Frame();
        f.setTitle("Select Menu");
        f.setBounds(10,10,800,600);
        f.setVisible(true);

        //layout
        GridLayout gl = new GridLayout(6,1);
        f.setLayout(gl);

        //components
        Font ft = new Font("Times New Romans", Font.BOLD, 18);

        //top
        Label lTop = new Label("Select Menu", Label.CENTER);
        lTop.setFont(ft);
        lTop.setForeground(Color.blue);

        f.add(lTop);

        //middle
        Panel p2 = new Panel();
        f.add(p2);
        Panel p3 = new Panel();

        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        cb5.addItemListener(this);

        p3.add(cb1); p3.add(cb2); p3.add(cb3); p3.add(cb4); p3.add(cb5); 
        f.add(p3);

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

}

