package com.example.e_commerce.e_commerce.config;


import com.example.e_commerce.e_commerce.dao.ProductoDAO;
import com.example.e_commerce.e_commerce.dao.MySQLProductoDAO;
import com.example.e_commerce.e_commerce.dao.OracleProductoDAO;
public class ConfiguracionDB {
    private static ProductoDAO productoDAO;

    public static void configurarAdaptadorDB(String tipoDB) {
        if (tipoDB.equalsIgnoreCase("mysql")) {
            productoDAO = new MySQLProductoDAO();
        } else if (tipoDB.equalsIgnoreCase("oracle")) {
            productoDAO = new OracleProductoDAO();
        }
    }

    public static ProductoDAO getProductoDAO() {
        return productoDAO;
    }
}
