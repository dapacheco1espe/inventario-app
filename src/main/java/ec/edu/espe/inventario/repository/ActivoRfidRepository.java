package ec.edu.espe.inventario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.inventario.modelos.ActivoRfid;

public interface ActivoRfidRepository extends JpaRepository<ActivoRfid,Integer>{
    ActivoRfid findByCodigo(Integer codigo);
    List<ActivoRfid> findAll();
    ActivoRfid findByCodigoRfid(String codigoRfid);
    List<ActivoRfid> findByCustodio1(String custodio1);
    List<ActivoRfid> findByUsuario(String usuario);
}
