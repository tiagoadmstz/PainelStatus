/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiago.teixeira
 */
public class SQLUtil {

    public static int L03 = 0, L03_CRITICOS = 1, L09 = 2, L09_CRITICOS = 3;

    public static ResultSet getResultSet(int query) {
        switch (query) {
            case 0:
                return getExecuteQuery(getQueryL03());
            case 1:
                return getExecuteQuery(getQueryL03_Criticos());
            case 2:
                return getExecuteQuery(getQueryL09());
            case 3:
                return getExecuteQuery(getQueryL09_Criticos());
            default:
                return null;
        }
    }

    public static List<ResultSet> getResultSetPainelPrincipal() {
        List<ResultSet> rs = new ArrayList();
        for (String sql : getQuerysPainelPrincipal()) {
            rs.add(getExecuteQuery(sql));
        }
        return rs;
    }

    private static ResultSet getExecuteQuery(String query) {
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private static String getQueryL03() {
        return "SELECT TOP 1 (Microondas_EsqPCT_Ind) as micropctind, (Microondas_EsqPCT_Set) as micropctset,"
                + "(Microondas_Esq1_Ind)as microesqind,(Microondas_Esq1_Set)as microesqset,"
                + "(Microondas_TapeteEntrada_Ind)as microesteiraind,(Microondas_TapeteEntrada_Set)as microesteiraset,"
                + "(Microondas_Exaustao_Ind)as microexaustorind, (Microondas_Exaustao_Set)as microexaustorset,"
                + "(Microondas_ArRefrigerado_Ind)as microrefrigeradoind,(Microondas_ArRefrigerado_Set)as microrefrigeradoset,"
                + "(Vulc1_IndTempControle1)as vulc1queimadorind,(Vulc1_SetTempControle1)as vulc1queimadorset,"
                + "(Vulc1_IndTempControle2)as vulc1queimador2ind,(Vulc1_SetTempControle2)as vulc1queimador2set,"
                + "(ExtA_IndRpm)as extarpm,(ExtB_IndRpm)as extbrpm,(ExtC_IndRpm)as extcrpm,(ExtD_IndRpm)as extdrpm,"
                + "(ExtA_Bar)as extabar,(ExtB_Bar)as extbbar,(ExtC_Bar)as extcbar,(ExtD_Bar)as extdbar,"
                + "(Vulc1_IndEsteira)as vulc1esteiraind,(Vulc1_SetEsteira)as vulc1esteiraset,"
                + "(Puller1_IndVelocidade)as puller1velocidadeind,(Puller1_SetVelocidade)as puller1velocidadeset,"
                + "(Puller2_IndVelocidade)as puller2velocidadeind,(Puller2_SetVelocidade)as puller2velocidadeset,"
                + "(Puller3_IndVelocidade)as puller3velocidadeind,(Puller3_SetVelocidade)as puller3velocidadeset,"
                + "(VUlc2_IndTempControle1)as vulc2queimadorind,(Vulc2_SetTempControle1)as vulc2queimadorset,"
                + "(Vulc2_IndTempControle2)as vulc2queimador2ind,(Vulc2_SetTempControle2)as vulc2queimador2set,"
                + "(Vulc1_IndEsteira)as vulc2esteiraind,(Vulc1_SetEsteira)as vulc2esteiraset,"
                + "(Banheira1_BombaPerfil_OnOff)as banheira1onof, (Banheira1_BombaTanque_OnOff)as banheira1bombatanqueonof,"
                + "(Banheira1_IndTempChiller)as b1tempchillerind,(Banheira1_SetTempChiller)as b1tempchillerset,"
                + "(Banheira1_IndTempReservatorio)as banheira1reservatorioind,(Banheira1_SetTempReservatorio)as b1reserset,"
                + "(Banheira2_BombaPerfil_OnOff)as banheira2onof, (Banheira2_BombaTanque_OnOff)as banheira2bombatanqueonof,"
                + "(Banheira2_InfTempChiller)as b2tempchillerind,(Banheira2_SetTempChiller)as b2tempchillerset,"
                + "(Banheira2_IndTempTanque)as banheira2reservatorioind,(Banheira2_SetTempTanque)as b2reserset,"
                + "(Banheira3_BombaPerfil_OnOff)as banheira3onof, (Banheira3_BombaTanque_OnOff)as banheira3bombatanqueonof,"
                + "(Banheira3_IndTempChiller)as b3tempchillerind,(Banheira3_SetTempChiller)as b3tempchillerset,"
                + "(Banheira3_IndTempTanque)as banheira3reservatorioind,(Banheira3_SetTempTanque)as b3reserset,"
                + "(Puller1_Inversor_OnOff) as pullerinversoronof,(Puller2_Inversor_OnOff) as puller2inversoronof,(Puller3_InversorOnOff)as puller3inversoronof,"
                + "(Pintura_B1_Set)as pinturab1set,(Pintura_B1_OnOff) as pintura1onof,"
                + "(Pintura_B2_Set)as pinturab2set,(Pintura_B2_OnOff)as pintura2onof,"
                + "(Pintura_B3_Set)as pinturab3set, (Pintura_B3_OnOff)as pintura3onof,"
                + "(Pintura_B4_Set)as pinturab4set, (Pintura_B4_OnOff)as pintura4onof,"
                + "(InfraRed_SetLampFrontal)as iflampfrontal,(InfraRed_LampFrontal_OnOff)as iflampfonof, "
                + "(InfraRed_SetLampCentral)as iflampcentral, (InfraRed_LampCentral_OnOff)as iflampconof,"
                + "(InfraRed_SetLampTraseira)as iflamptraseira,(InfraRed_LampTraseira_OnOff)as iflamptonof,"
                + "(Perfil)as perfil,(InfraRed_Exaustor_OnOff)as ifexaustoronof, "
                + "(InfraRed_IndEsteira)as ifesteiraind, (InfraRed_SetEsteira)as ifesteiraset,"
                + "(InfraRed_Vent2)as ifventilador FROM L03 ORDER BY E3TimeStamp DESC";
    }

    private static String getQueryL03_Criticos() {
        return "SELECT TOP 1 (ExtA_Rotacao)as extarpm,(ExtB_Rotacao)as extbrpm,(ExtC_Rotacao)as extcrpm,(ExtD_Rotacao)as extdrpm,"
                + "(ExtA_Pressao)as extabar,(ExtB_Pressao)as extbbar,(ExtC_Pressao)as extcbar,(ExtD_Pressao)as extdbar,"
                + "(Puller1_Velocidade)as puller1velocidadeind,(Puller2_Velocidade)as puller2velocidadeind,(Puller3_Velocidade)as puller3velocidadeind"
                + " FROM L03_Criticos ORDER BY E3TimeStamp DESC";
    }

    private static String getQueryL09() {
        return "SELECT TOP 1 (Microondas_EsqPCT_Ind) as micropctind, (Microondas_EsqPCT_Set) as micropctset,"
                + "(Microondas_Esq1_Ind)as microesqind,(Microondas_Esq1_Set)as microesqset,"
                + "(Microondas_TapeteEntrada_Ind)as microesteiraind,(Microondas_TapeteEntrada_Set)as microesteiraset,"
                + "(Microondas_Exaustao_Ind)as microexaustorind, (Microondas_Exaustao_Set)as microexaustorset,"
                + "(Microondas_ArRefrigerado_Ind)as microrefrigeradoind,(Microondas_ArRefrigerado_Set)as microrefrigeradoset,"
                + "(Vulc1_IndTempControle1)as vulc1queimadorind,(Vulc1_SetTempControle1)as vulc1queimadorset,"
                + "(Vulc1_IndTempControle2)as vulc1queimador2ind,(Vulc1_SetTempControle2)as vulc1queimador2set,"
                + "(ExtA_IndRpm)as extarpm,(ExtB_IndRpm)as extbrpm,(ExtC_IndRpm)as extcrpm,(ExtD_IndRpm)as extdrpm,"
                + "(ExtA_Bar)as extabar,(ExtB_Bar)as extbbar,(ExtC_Bar)as extcbar,(ExtD_Bar)as extdbar,"
                + "(Vulc1_IndEsteira)as vulc1esteiraind,(Vulc1_SetEsteira)as vulc1esteiraset,"
                + "(Puller1_IndVelocidade)as puller1velocidadeind,(Puller1_SetVelocidade)as puller1velocidadeset,"
                + "(VUlc2_IndTempControle1)as vulc2queimadorind,(Vulc2_SetTempControle1)as vulc2queimadorset,"
                + "(Vulc2_IndTempControle2)as vulc2queimador2ind,(Vulc2_SetTempControle2)as vulc2queimador2set,"
                + "(Vulc1_IndEsteira)as vulc2esteiraind,(Vulc1_SetEsteira)as vulc2esteiraset,"
                + "(Banheira1_SetTempReservatorio)as banheira1reservatorioind,"
                + "(Banheira1_BombaPerfil_OnOff)as banheira1onof, (Banheira1_BombaTanque_OnOff)as banheira1bombatanqueonof,"
                + "(Puller1_Inversor_OnOff) as pullerinversoronof,"
                + "(Pintura_B1_Set)as pinturab1set,(Pintura_B1_OnOff) as pintura1onof,"
                + "(Pintura_B2_Set)as pinturab2set,(Pintura_B2_OnOff)as pintura2onof,"
                + "(Pintura_B3_Set)as pinturab3set, (Pintura_B3_OnOff)as pintura3onof,"
                + "(Pintura_B4_Set)as pinturab4set, (Pintura_B4_OnOff)as pintura4onof,"
                + "(InfraRedForno_SetLampFrontal)as iflampfrontal,(InfraRedForno_IndLampFrontalOnOff)as iflampfonof, "
                + "(InfraRedForno_SetLampCentral)as iflampcentral, (InfraRedForno_IndLamCentralOnOff)as iflampconof,"
                + "(InfraRedForno_SetLampTraseira)as iflamptraseira,(InfraRedForno_IndLampTraseiraOnOff)as iflamptonof,"
                + "(InfraRedForno_IndEsteira2)as ifesteira2ind,(InfraRedForno_SetEsteira2)as ifesteira2set,"
                + "(Perfil)as perfil,"
                + "(InfraRedForno_IndEsteira1)as ifesteiraind, (InfraRedForno_SetEsteira1)as ifesteiraset FROM L09 ORDER BY E3TimeStamp DESC";
    }

    private static String getQueryL09_Criticos() {
        return "SELECT TOP 1 (ExtA_RPM)as extarpm,(ExtB_RPM)as extbrpm,(ExtC_RPM)as extcrpm,(ExtD_RPM)as extdrpm,"
                + "(ExtA_Pressao)as extabar,(ExtB_Pressao)as extbbar,(ExtC_Pressao)as extcbar,(ExtD_Pressao)as extdbar,"
                + "(Puller_Velocidade)as puller1velocidadeind FROM L09_Criticos ORDER BY E3TimeStamp DESC";
    }

    private static String[] getQuerysPainelPrincipal() {
        return new String[]{"SELECT TOP 1 (InicioProd) as inicioprodL09,(Status_Da_Linha) as valueL09,(Perfil)as perfilL09, (TotalProdu) as pecatotalL09 FROM L09 ORDER BY E3TimeStamp DESC",
            "SELECT TOP 1 (ScrapTotal)as scraptotalL09Doc, (FatorScrap) as porcscarpL09Doc FROM L09_Doc ORDER BY E3TimeStamp DESC",
            "SELECT TOP 1 (Status_Da_Linha) as valueL03,(Perfil) as perfilL03, (DDZ_CompTotal) as pecatotalL03 FROM L03 ORDER BY E3TimeStamp DESC",
            "SELECT TOP 1 (HInicial) as valueL03Doc, (ScrapTotal) as scraptotalL03Doc, (FatorScrap) as porcscarpL03Doc FROM L03_Doc ORDER BY E3TimeStamp DESC",
            "SELECT TOP 1 (ExtA_Bar) as valueL11,(ExtB_Bar) as value2L11,(ExtC_Bar) as value3L11,(ExtD_Bar) as value4L11, (Perfil) as perfilL11,(Puller1_IndVelocidade) as velocidadeL11,(HoarioLancamento) as horalancamentoL11, (TotalProduzido) as totalproduzidoL11 FROM L11 ORDER BY E3TimeStamp DESC"};
    }

}
