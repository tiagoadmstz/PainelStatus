/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.interfaces;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Tiago
 */
public abstract class ManipulaFrame extends JFrame {

    private static final long serialVersionUID = 2159867396703895660L;

    public List<JLabel> getJLabelList() {
        return new ArrayList();
    }

    public List<JButton> getJButtonList() {
        return new ArrayList();
    }

    public void setImageIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/painel/img/iconprincipal.png")));
    }

    public void maximize() {
        setExtendedState(MAXIMIZED_BOTH);
    }

    public abstract JLabel[][] getOnOffFields();
    
}
