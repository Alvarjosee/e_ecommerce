package com.example.e_commerce.e_commerce.controller;


import com.example.e_commerce.e_commerce.config.ConfiguracionDB;
import com.example.e_commerce.e_commerce.model.Producto;
import com.example.e_commerce.e_commerce.dao.ProductoDAO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @PostMapping
    public ResponseEntity<String> agregarProducto(@RequestBody Producto producto) {
        ConfiguracionDB.getProductoDAO().guardarProducto(producto);
        return ResponseEntity.ok("Producto guardado exitosamente");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Long id) {
        Producto producto = ConfiguracionDB.getProductoDAO().obtenerProducto(id);
        return producto != null ? ResponseEntity.ok(producto) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Producto>> obtenerTodosLosProductos() {
        List<Producto> productos = ConfiguracionDB.getProductoDAO().obtenerTodosLosProductos();
        return ResponseEntity.ok(productos);
    }
}
