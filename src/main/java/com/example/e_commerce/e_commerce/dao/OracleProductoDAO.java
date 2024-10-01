package com.example.e_commerce.e_commerce.dao;


import com.example.e_commerce.e_commerce.model.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class OracleProductoDAO implements ProductoDAO {
    private Map<Long, Producto> productos = new HashMap<>();

    @Override
    public void guardarProducto(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public Producto obtenerProducto(Long id) {
        return productos.get(id);
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return new ArrayList<>(productos.values());
    }
}
