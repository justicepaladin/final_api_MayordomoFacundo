package com.uade.FacundoMayordomo1149479.repository;

import com.uade.FacundoMayordomo1149479.model.Cerveza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CervezaRepository extends JpaRepository<Cerveza, Long>
{

    Optional<List<Cerveza>> findCervezaByEstilo_Id(Long id);

    Optional<Cerveza> findCervezaByNombreAndEstiloId(String nombre, Long estilo_id);
}
