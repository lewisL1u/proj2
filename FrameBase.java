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

public class FrameBase extends Frame implements ItemListener, TextListener, ActionListener {

    protected Database db;

    public FrameBase(){}
    
    public FrameBase(Database db){
      this();
      this.db = db;
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {

        String choice = (String)e.getItem();

        switch(choice) {
            case "Register":
                Register reg = new Register(this.db);
                break;
            case "Search by Id":
                Search search = new Search(this.db);
                break;
            case "Total Number":
                TotalNumber tn = new TotalNumber(this.db);
                break;
            case "List":
                List list = new List(this.db);
                break;
            case "Quit":
                System.exit(0);
                break;

        }

    }

}
