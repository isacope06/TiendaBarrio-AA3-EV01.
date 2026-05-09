package com.tienda.tienda_barrio.service;

import com.tienda.tienda_barrio.model.Producto;
import com.tienda.tienda_barrio.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repository;

    // metodo para guardar productos
    public Producto guardarProducto(Producto producto) {

        return repository.save(producto);
    }

    // Metodo para listar productos
    public List<Producto> listarProductos() {

        return repository.findAll();
    }

    // Metodo para eliminar productos
    public void eliminarProducto(Long id) {

        repository.deleteById(id);
    }
}