package com.uade.FacundoMayordomo1149479.repository;

import com.uade.FacundoMayordomo1149479.dto.CervezaDTO;
import com.uade.FacundoMayordomo1149479.model.Cerveza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CervezaRepository extends JpaRepository<Cerveza, Long>
{



}
