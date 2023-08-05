package ec.edu.espe.inventario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.inventario.modelos.Activo;

public interface ActivoRepository extends JpaRepository<Activo,Integer>{
    List<Activo> findByCustodio1(String custodio1);
}
