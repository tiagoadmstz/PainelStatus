/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.util;

/**
 *
 * @author rafae
 */
public class Auxiliar {

    public static class Usuario {

        private static String tipo_usuario;

        public static void setTipo_usuario(String tipo_usuario) {
            Usuario.tipo_usuario = tipo_usuario;
        }

        public static String getTipo_usuario() {
            return tipo_usuario;
        }
    }

    public static class AcessoBanco {

        private final static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        private final static String URL = "jdbc:sqlserver://VARWSQL1;databaseName=SUPERVISORIO";
        private final static String USER = "SUPERVISORIO";
        private final static String PASS = "";

        public static String getDriver() {
            return DRIVER;
        }

        public static String getUrl() {
            return URL;
        }

        public static String getUser() {
            return USER;
        }

        public static String getPass() {
            return PASS;
        }

    }
}
