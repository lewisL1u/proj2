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

}
