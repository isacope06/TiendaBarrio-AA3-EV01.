package com.tienda.tienda_barrio.controller;

import com.tienda.tienda_barrio.model.Producto;
import com.tienda.tienda_barrio.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductoController {

    @Autowired
    private ProductoService service;

    // Mostrar formulario y lista de productos
    @GetMapping("/")
    public String mostrarFormulario(Model model) {

        model.addAttribute("producto", new Producto());

        model.addAttribute(
                "lista",
                service.listarProductos()
        );

        return "index";
    }

    // Guardar productos
    @PostMapping("/guardar")
    public String guardarProducto(Producto producto) {

        service.guardarProducto(producto);

        return "redirect:/";
    }
}