package com.inventario.api_productos.repository;

import com.inventario.api_productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Consulta personalizada derivada del nombre del método
    List<Producto> findByCategoria(String categoria);
}
