package ec.edu.espe.inventario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.inventario.modelos.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer>{
    List<Funcionario> findByNombreContainingIgnoreCase(String nombre);
}
