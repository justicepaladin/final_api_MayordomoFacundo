package com.uade.FacundoMayordomo1149479.repository;


import com.uade.FacundoMayordomo1149479.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
}
