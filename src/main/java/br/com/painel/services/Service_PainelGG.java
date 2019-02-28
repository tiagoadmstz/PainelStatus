/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.services;

import br.com.painel.entities.PainelPrincipal;
import br.com.painel.framesGG.PainelGG;
import br.com.painel.interfaces.Service;
import br.com.painel.util.SQLUtil;

/**
 * Classe de serviço para o frame PainelGG.
 *
 * @author Tiago
 */
public final class Service_PainelGG extends Service<PainelGG> {

    public Service_PainelGG(PainelGG form) {
        super(form);
    }

    /**
     * Inicial as labels de alarme como false
     */
    public void initLabelsFrame() {
        form.getJLabelList().forEach(lb -> lb.setVisible(false));
    }

    public synchronized Thread painelPrincipal() {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        PainelPrincipal painelPrincipal = new PainelPrincipal();
                        painelPrincipal.setValuesByResultSet(SQLUtil.getResultSetPainelPrincipal());
                        setDados(form, painelPrincipal);
                        toogleOnOffFields(form.getOnOffFields());
                        alarmeVelocidade(painelPrincipal);
                        Thread.sleep(5000l);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    private void alarmeVelocidade(PainelPrincipal painelPrincipal) {
        form.getLabelVelocidadeAlarme()[0].setVisible(false);
        if (painelPrincipal.isAlarmeVelecidade()) {
            toogleAlarmeVelocidade(String.valueOf(painelPrincipal.getVelocidadeL11()));
        } else {
            toogleAlarmeVelocidade("0.0");
        }
    }

    private void toogleAlarmeVelocidade(String text) {
        form.getLb11Velocidade().setText(String.valueOf(text));
        toogleOnOffFields(form.getLabelVelocidadeAlarme());
    }

    public void painelPrincipalOut() {
        /*int delay = 1;   // delay de 5 seg.
        int interval = 5000;  // intervalo de 1 seg.
        Timer timer = new Timer();
        /////////////////////////////////////////////////L09
        timer.scheduleAtFixedRate(new TimerTask() {
        public void run() {
        try {
        Class.forName(Auxiliar.AcessoBanco.getDriver());
        Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
        String query1 = "SELECT TOP 1 (InicioProd) as inicioprod,(Status_Da_Linha) as value,(Perfil)as perfil, (TotalProdu) as pecatotal  FROM L09 ORDER BY E3TimeStamp DESC";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query1);
        float value = 0f;
        String inicioprod = "";
        String perfil = "";
        Float pecatotal = 0f;
        
        while (rs.next()) {
        value = rs.getFloat("value");
        perfil = rs.getString("perfil");
        inicioprod = rs.getString("inicioprod");
        perfil = rs.getString("perfil");
        pecatotal = rs.getFloat("pecatotal");
        }
        lb9Status.setText(String.valueOf(value));
        jLabel12.setText(perfil);
        lb09TotalPro.setText(String.valueOf(pecatotal));
        lb09Hora.setText(inicioprod);
        
        } catch (Exception e) {
        //                    e.printStackTrace();
        JOptionPane.showMessageDialog(null, e);
        }
        if (!lb9Status.getText().equals("0.0")) {
        jLabel16.setVisible(true);
        jLabel17.setVisible(false);
        } else {
        jLabel17.setVisible(true);
        jLabel16.setVisible(false);
        }
        }
        
        }, delay, interval);
        
        timer.scheduleAtFixedRate(new TimerTask() {
        public void run() {
        try {
        Class.forName(Auxiliar.AcessoBanco.getDriver());
        Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
        String query1 = "SELECT TOP 1 (ScrapTotal)as scraptotal, (FatorScrap)as porcscarp FROM L09_Doc ORDER BY E3TimeStamp DESC";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query1);
        
        float scraptotal = 0f;
        float porcscarp = 0f;
        
        while (rs.next()) {
        scraptotal = rs.getFloat("scraptotal");
        porcscarp = rs.getFloat("porcscarp");
        
        }
        lb09ScrapTotal.setText(String.valueOf(scraptotal));
        //                    lb09PorcScrap.setText(String.valueOf(porcscarp + "%"));
        lb09PorcScrap.setText(String.format("%.1f", porcscarp) + "%");
        } catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        }, delay, interval);
        
        ////////////////////////////////////////// L03
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        
        timer.scheduleAtFixedRate(new TimerTask() {
        public void run() {
        try {
        Class.forName(Auxiliar.AcessoBanco.getDriver());
        Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
        String query1 = "SELECT TOP 1 (Status_Da_Linha) as value,(Perfil) as perfil, (DDZ_CompTotal) as pecatotal FROM L03 ORDER BY E3TimeStamp DESC";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query1);
        float value = 0f;
        String perfil = "";
        float pecatotal = 0f;
        
        while (rs.next()) {
        value = rs.getFloat("value");
        perfil = rs.getString("perfil");
        pecatotal = rs.getFloat("pecatotal");
        
        }
        lb3Status.setText(String.valueOf(value));
        lb03Perfil.setText(perfil);
        lb03PecaTotal.setText(String.valueOf(pecatotal));
        
        } catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, e);
        }
        if (!lb3Status.getText().equals("0.0")) {
        jLabel18.setVisible(true);
        jLabel19.setVisible(false);
        } else {
        jLabel19.setVisible(true);
        jLabel18.setVisible(false);
        }
        }
        
        }, delay, interval);
        
        timer.scheduleAtFixedRate(new TimerTask() {
        public void run() {
        try {
        Class.forName(Auxiliar.AcessoBanco.getDriver());
        Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
        String query1 = "SELECT TOP 1 (HInicial) as value, (ScrapTotal)as scraptotal, (FatorScrap)as porcscarp  FROM L03_Doc ORDER BY E3TimeStamp DESC";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query1);
        String value = "";
        float scraptotal = 0f;
        float porcscarp = 0f;
        
        while (rs.next()) {
        value = rs.getString("value");
        scraptotal = rs.getFloat("scraptotal");
        porcscarp = rs.getFloat("porcscarp");
        
        }
        lb03Data.setText(value);
        lb03ScrapTotal.setText(String.valueOf(scraptotal));
        lb03PorcScrap.setText(String.format("%.1f", porcscarp) + "%");
        
        } catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, e);
        }
        }
        
        }, delay, interval);
        
        /////////////////////////////////////////////////////////////////////////////// L11
        jLabel30.setVisible(false);
        jLabel31.setVisible(false);
        
        timer.scheduleAtFixedRate(new TimerTask() {
        public void run() {
        try {
        Class.forName(Auxiliar.AcessoBanco.getDriver());
        Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
        String query1 = "SELECT TOP 1 (ExtA_Bar) as value,(ExtB_Bar)as value2,(ExtC_Bar)as value3,(ExtD_Bar)as value4, (Perfil)as perfil,(Puller1_IndVelocidade)as velocidade,(HoarioLancamento)as horalancamento, (TotalProduzido)as totalproduzido FROM L11 ORDER BY E3TimeStamp DESC";
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query1);
        float value = 0f;
        float value2 = 0f;
        float value3 = 0f;
        float value4 = 0f;
        String perfil = "";
        float velocidade = 0f;
        float totalproduzido = 0f;
        
        String horalancamento = "";
        
        while (rs.next()) {
        value = rs.getFloat("value");
        value2 = rs.getFloat("value2");
        value3 = rs.getFloat("value3");
        value4 = rs.getFloat("value4");
        perfil = rs.getString("perfil");
        velocidade = rs.getFloat("velocidade");
        horalancamento = rs.getString("horalancamento");
        totalproduzido = rs.getFloat("totalproduzido");
        
        }
        lb11Status.setText(String.valueOf(value));
        lb11Status1.setText(String.valueOf(value2));
        lb11Status2.setText(String.valueOf(value3));
        lb11Status3.setText(String.valueOf(value4));
        lb11Perfil.setText(perfil);
        lb11Lancamento.setText(horalancamento);
        lb11Velocidade1.setText(String.valueOf(totalproduzido));
        double lb = Double.parseDouble(lb11Status.getText());
        double lb1 = Double.parseDouble(lb11Status1.getText());
        double lb2 = Double.parseDouble(lb11Status2.getText());
        double lb3 = Double.parseDouble(lb11Status3.getText());
        if (lb > 10 || lb1 > 10 || lb2 > 10 || lb3 > 10) {
        lb11Velocidade.setText(String.valueOf(velocidade));
        jLabel30.setVisible(true);
        jLabel31.setVisible(false);
        } else {
        lb11Velocidade.setText(String.valueOf("0.0"));
        jLabel31.setVisible(true);
        jLabel30.setVisible(false);
        }
        } catch (Exception e) {
        //                    e.printStackTrace();
        JOptionPane.showMessageDialog(null, e);
        }
        
        }
        
        }, delay, interval);*/
    }

}
