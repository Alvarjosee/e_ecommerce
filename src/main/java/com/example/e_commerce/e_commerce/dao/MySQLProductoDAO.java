package com.example.e_commerce.e_commerce.dao;


import com.example.e_commerce.e_commerce.model.Producto;
import java.util.ArrayList;
import java.util.List;


public class MySQLProductoDAO implements ProductoDAO {
    private List<Producto> productos = new ArrayList<>();

    @Override
    public void guardarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public Producto obtenerProducto(Long id) {
        return productos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productos;
    }
}
