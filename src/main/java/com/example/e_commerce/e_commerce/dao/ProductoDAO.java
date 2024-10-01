package com.example.e_commerce.e_commerce.dao;

import com.example.e_commerce.e_commerce.model.Producto;
import java.util.ArrayList;
import java.util.List;

public interface ProductoDAO {
    void guardarProducto(Producto producto);
    Producto obtenerProducto(Long id);
    List<Producto> obtenerTodosLosProductos();
}
