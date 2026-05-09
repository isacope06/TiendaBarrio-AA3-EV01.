package com.tienda.tienda_barrio.repository;

import com.tienda.tienda_barrio.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository encargado del CRUD de productos
public interface ProductoRepository
        extends JpaRepository<Producto, Long> {

}