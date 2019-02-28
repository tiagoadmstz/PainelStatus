/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.util;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * Classe de utilidades com métodos úteis globais.
 *
 * @author Tiago
 */
public final class Utilidades {

    public static Dimension getResolutionScreen() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }

}
