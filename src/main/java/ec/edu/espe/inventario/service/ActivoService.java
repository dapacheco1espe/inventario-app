package ec.edu.espe.inventario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.inventario.controller.dto.ActivoRQ;
import ec.edu.espe.inventario.modelos.Activo;
import ec.edu.espe.inventario.repository.ActivoRepository;



@Service
public class ActivoService {
     private final ActivoRepository activoRepository;

    public ActivoService(ActivoRepository activoRepository){
        this.activoRepository = activoRepository;
    }

    public List<Activo> obtenerActivoByCustodio1(ActivoRQ activoRfidRQ){
        Activo activoRfid = this.transformRQ(activoRfidRQ);
        return this.activoRepository.findByCustodio1(activoRfid.getCustodio1());
    }

    private Activo transformRQ(ActivoRQ activoRQ){
        Activo activo =  new Activo();
        activo.setCodigo(activoRQ.getCodigo());
        activo.setCodigoEmpresa(activoRQ.getCodigoEmpresa());
        activo.setLocalidad(activoRQ.getLocalidad());
        activo.setOrigen(activoRQ.getOrigen());
        activo.setTipo(activoRQ.getTipo());
        activo.setSubtipo(activoRQ.getSubtipo());
        activo.setClase(activoRQ.getClase());
        activo.setCodLocalidad(activoRQ.getCodLocalidad());
        activo.setConceptoTransaccion(activoRQ.getConceptoTransaccion());
        activo.setLote(activoRQ.getLote());
        activo.setSublote(activoRQ.getSublote());
        activo.setDescripcion(activoRQ.getDescripcion());
        activo.setObservacion(activoRQ.getObservacion());
        activo.setCantidad(activoRQ.getCantidad());
        activo.setValor(activoRQ.getValor());
        activo.setFechaAdquisicion(activoRQ.getFechaAdquisicion());
        activo.setCustodio1(activoRQ.getCustodio1());
        activo.setCustodio2(activoRQ.getCustodio2());
        activo.setMef(activoRQ.getMef());
        activo.setCodMef(activoRQ.getCodMef());
        activo.setUsuario(activoRQ.getUsuario());
        return activo;
    }
}
