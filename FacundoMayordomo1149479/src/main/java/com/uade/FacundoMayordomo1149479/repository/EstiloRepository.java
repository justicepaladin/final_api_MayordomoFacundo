package com.uade.FacundoMayordomo1149479.repository;

import com.uade.FacundoMayordomo1149479.model.Estilo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstiloRepository extends JpaRepository<Estilo, Long>
{

}
