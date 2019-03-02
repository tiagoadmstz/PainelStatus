/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.entities;

import br.com.painel.interfaces.SuperObject;
import java.util.Date;

/**
 *
 * @author Tiago
 */
public class PainelPrincipal extends SuperObject {

    //L03
    private int valueL03;
    private String perfilL03;
    private int pecatotalL03;
    //L03_Doc
    private Date valueL03Doc;
    private double scraptotalL03Doc;
    private double porcscarpL03Doc;
    //L09
    private int valueL09;
    private Date inicioprodL09;
    private String perfilL09;
    private int pecatotalL09;
    //L09_Doc
    private double scraptotalL09Doc;
    private double porcscarpL09Doc;
    //L11
    private double valueL11;
    private double value2L11;
    private double value3L11;
    private double value4L11;
    private String perfilL11;
    private Date horalancamentoL11;
    private int velocidadeL11;
    private int totalproduzidoL11;

    public PainelPrincipal() {
        valueL09 = 0;
        inicioprodL09 = null;
        perfilL09 = "";
        pecatotalL09 = 0;
        scraptotalL09Doc = 0;
        porcscarpL09Doc = 0;
        valueL03 = 0;
        perfilL03 = "";
        pecatotalL03 = 0;
        valueL03Doc = null;
        scraptotalL03Doc = 0f;
        porcscarpL03Doc = 0f;
        valueL11 = 0;
        value2L11 = 0;
        value3L11 = 0;
        value4L11 = 0;
        perfilL11 = "";
        velocidadeL11 = 0;
        totalproduzidoL11 = 0;
    }

    public String getPorcscarpL09DocStr() {
        return percentFormat(porcscarpL09Doc);
    }

    public String getPorcscarpL03DocStr() {
        return percentFormat(porcscarpL03Doc);
    }

    public boolean isAlarmeVelocidade() {
        return valueL11 > 10 || value2L11 > 10 || value3L11 > 10 || value4L11 > 10;
    }

    public int getValueL09() {
        return valueL09;
    }

    public void setValueL09(int valueL09) {
        this.valueL09 = valueL09;
    }

    public Date getInicioprodL09() {
        return inicioprodL09;
    }

    public void setInicioprodL09(Date inicioprodL09) {
        this.inicioprodL09 = inicioprodL09;
    }

    public String getPerfilL09() {
        return perfilL09;
    }

    public void setPerfilL09(String perfilL09) {
        this.perfilL09 = perfilL09;
    }

    public int getPecatotalL09() {
        return pecatotalL09;
    }

    public void setPecatotalL09(int pecatotalL09) {
        this.pecatotalL09 = pecatotalL09;
    }

    public double getScraptotalL09Doc() {
        return scraptotalL09Doc;
    }

    public void setScraptotalL09Doc(double scraptotalL09Doc) {
        this.scraptotalL09Doc = scraptotalL09Doc;
    }

    public double getPorcscarpL09Doc() {
        return porcscarpL09Doc;
    }

    public void setPorcscarpL09Doc(double porcscarpL09Doc) {
        this.porcscarpL09Doc = porcscarpL09Doc;
    }

    public int getValueL03() {
        return valueL03;
    }

    public void setValueL03(int valueL03) {
        this.valueL03 = valueL03;
    }

    public String getPerfilL03() {
        return perfilL03;
    }

    public void setPerfilL03(String perfilL03) {
        this.perfilL03 = perfilL03;
    }

    public int getPecatotalL03() {
        return pecatotalL03;
    }

    public void setPecatotalL03(int pecatotalL03) {
        this.pecatotalL03 = pecatotalL03;
    }

    public Date getValueL03Doc() {
        return valueL03Doc;
    }

    public void setValueL03Doc(Date valueL03Doc) {
        this.valueL03Doc = valueL03Doc;
    }

    public double getScraptotalL03Doc() {
        return scraptotalL03Doc;
    }

    public void setScraptotalL03Doc(double scraptotalL03Doc) {
        this.scraptotalL03Doc = scraptotalL03Doc;
    }

    public double getPorcscarpL03Doc() {
        return porcscarpL03Doc;
    }

    public void setPorcscarpL03Doc(double porcscarpL03Doc) {
        this.porcscarpL03Doc = porcscarpL03Doc;
    }

    public double getValueL11() {
        return valueL11;
    }

    public void setValueL11(double valueL11) {
        this.valueL11 = valueL11;
    }

    public double getValue2L11() {
        return value2L11;
    }

    public void setValue2L11(double value2L11) {
        this.value2L11 = value2L11;
    }

    public double getValue3L11() {
        return value3L11;
    }

    public void setValue3L11(double value3L11) {
        this.value3L11 = value3L11;
    }

    public double getValue4L11() {
        return value4L11;
    }

    public void setValue4L11(double value4L11) {
        this.value4L11 = value4L11;
    }

    public String getPerfilL11() {
        return perfilL11;
    }

    public void setPerfilL11(String perfilL11) {
        this.perfilL11 = perfilL11;
    }

    public Date getHoralancamentoL11() {
        return horalancamentoL11;
    }

    public void setHoralancamentoL11(Date horalancamentoL11) {
        this.horalancamentoL11 = horalancamentoL11;
    }

    public int getVelocidadeL11() {
        return velocidadeL11;
    }

    public void setVelocidadeL11(int velocidadeL11) {
        this.velocidadeL11 = velocidadeL11;
    }

    public int getTotalproduzidoL11() {
        return totalproduzidoL11;
    }

    public void setTotalproduzidoL11(int totalproduzidoL11) {
        this.totalproduzidoL11 = totalproduzidoL11;
    }

}
