package ec.edu.espe.inventario.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.inventario.controller.dto.ActivoRfidRQ;
import ec.edu.espe.inventario.modelos.ActivoRfid;
import ec.edu.espe.inventario.repository.ActivoRfidRepository;

@Service
public class ActivoRfidService {
    private final ActivoRfidRepository activoRfidRepository;

    public ActivoRfidService(ActivoRfidRepository activoRfidRepository){
        this.activoRfidRepository = activoRfidRepository;
    }

    public List<ActivoRfid> listarActivosRfid(){
        return this.activoRfidRepository.findAll();
    }

    public List<ActivoRfid> obtenerActivoRfidByCustodio1(ActivoRfidRQ activoRfidRQ){
        ActivoRfid activoRfid = this.transformRQ(activoRfidRQ);
        return this.activoRfidRepository.findByCustodio1(activoRfid.getCustodio1());
    }

    public List<ActivoRfid> obtenerActivoRfidByUsuario(ActivoRfidRQ activoRfidRQ){
        ActivoRfid activoRfid = this.transformRQ(activoRfidRQ);
        return this.activoRfidRepository.findByUsuario(activoRfid.getUsuario());
    }

    public ActivoRfid obtenerActivoRfid(ActivoRfidRQ activoRfidRQ){
        ActivoRfid activoRfid = this.transformRQ(activoRfidRQ);
        return this.activoRfidRepository.findByCodigo(activoRfid.getCodigo());
    }
    
    public ActivoRfid obtenerActivoRfidByCodigoR(ActivoRfidRQ activoRfidRQ){
        ActivoRfid activoRfid = this.transformRQ(activoRfidRQ);
        return this.activoRfidRepository.findByCodigoRfid(activoRfid.getCodigoRfid());
    }

    public ActivoRfid agregarActivoRfid(ActivoRfidRQ activorRfidRQ){
        ActivoRfid activoRfid = this.transformRQ(activorRfidRQ);
        return this.activoRfidRepository.save(activoRfid);
    }

    public ActivoRfid editarActivoRfid(ActivoRfidRQ activorRfidRQ){
        ActivoRfid activoRfid = this.transformRQ(activorRfidRQ);
        ActivoRfid tmpActivo = this.activoRfidRepository.findByCodigoRfid(activoRfid.getCodigoRfid());
        //aqui validacion si existe o no el activo para actualizar
        ActivoRfid newActivo = new ActivoRfid();
        newActivo.setCodigo(tmpActivo.getCodigo());
        newActivo.setCodigoRfid(activoRfid.getCodigoRfid());
        newActivo.setCustodio1(activoRfid.getCustodio1());
        newActivo.setCustodio2(activoRfid.getCustodio2());
        newActivo.setDescripcion(activoRfid.getDescripcion());
        newActivo.setEstadoJustificado(activoRfid.getEstadoJustificado());
        newActivo.setEstadoTransaccion(activoRfid.getEstadoTransaccion());
        newActivo.setFechaLectura(new Date());
        newActivo.setUsuario(activoRfid.getUsuario());
        return this.activoRfidRepository.save(newActivo);
    }

    private ActivoRfid transformRQ(ActivoRfidRQ activoRQ){
        ActivoRfid activoRfid =  new ActivoRfid();
        activoRfid.setCodigo(activoRQ.getCodigo());
        activoRfid.setCodigoRfid(activoRQ.getCodigoRfid());
        activoRfid.setCustodio1(activoRQ.getCustodio1());
        activoRfid.setDescripcion(activoRQ.getDescripcion());
        activoRfid.setEstadoJustificado(activoRQ.getEstadoJustificado());
        activoRfid.setEstadoTransaccion(activoRQ.getEstadoTransaccion());
        activoRfid.setFechaLectura(activoRQ.getFechaLectura());
        activoRfid.setUsuario(activoRQ.getUsuario());
        return activoRfid;
    }

    // String subirFile(MultipartFile file, ActivoRfid activo){

    // }
}
