package ec.edu.espe.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.inventario.modelos.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
    Usuario findByLogin(String login);
}
