/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.interfaces;

import java.lang.reflect.Field;
import java.sql.ResultSet;

/**
 *
 * @author tiago.teixeira
 */
public abstract class SuperObject {

    public void setValuesByResultSet(ResultSet rst) {
        try {
            Field[] fields = this.getClass().getDeclaredFields();
            while (rst.next()) {
                for (Field field : fields) {
                    field.setAccessible(true);
                    if (!field.getName().equals("serialVersionUID")) {
                        field.set(this, rst.getObject(field.getName()));
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void printValues() {
        try {
            Field[] fields = this.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if (!field.getName().equals("serialVersionUID")) {
                    System.out.println(field.getName() + " > " + field.get(this));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
