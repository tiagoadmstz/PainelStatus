/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.interfaces;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author tiago.teixeira
 */
public abstract class SuperObject {

    private final String formatStr = "%1$,.1f";

    /**
     * Faz a formatação de uma variável float para uma string com apenas um
     * número após a vírgula.
     *
     * @param number float Número que deve ser formatado
     * @return String com valor formatado
     */
    protected String numberFormat(float number) {
        return String.format(formatStr, number);
    }

    /**
     * Faz a formatação de uma variável doable para uma string com apenas um
     * número após a vírgula.
     *
     * @param number double número que deve ser formatado
     * @return String com valor formatado
     */
    protected String numberFormat(double number) {
        return String.format(formatStr, number);
    }

    /**
     * Faz a formatação de uma variável double para uma string com apenas um
     * número após a vírgula e o símbolo de porcentagem.
     *
     * @param number double número que deve ser formatado
     * @return String com valor formatado
     */
    protected String percentFormat(double number) {
        return String.format(formatStr, number) + "%";
    }

    public void setValuesByResultSet(ResultSet rst) {
        try {
            Field[] fields = this.getClass().getDeclaredFields();
            while (rst.next()) {
                for (Field field : fields) {
                    field.setAccessible(true);
                    if (!field.getName().equals("serialVersionUID")) {
                        try {
                            field.set(this, rst.getObject(field.getName()));
                        } catch (SQLException sqlEx) {
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setValuesByResultSet(List<ResultSet> rstList) {
        try {
            rstList.forEach(rst -> setValuesByResultSet(rst));
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
