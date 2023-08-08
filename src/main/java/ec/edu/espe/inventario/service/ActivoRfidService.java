package ec.edu.espe.inventario.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.inventario.controller.dto.ActivoRfidRQ;
import ec.edu.espe.inventario.controller.dto.ActivoRfidRS;
import ec.edu.espe.inventario.modelos.ActivoRfid;
import ec.edu.espe.inventario.repository.ActivoRfidRepository;

@Service
public class ActivoRfidService {
    private final ActivoRfidRepository activoRfidRepository;

    public ActivoRfidService(ActivoRfidRepository activoRfidRepository){
        this.activoRfidRepository = activoRfidRepository;
    }

    public List<ActivoRfidRS> listarActivosRfid(){
        List<ActivoRfid> activos = this.activoRfidRepository.findAll();
        List<ActivoRfidRS> activosRS = new ArrayList<ActivoRfidRS>();
        for(ActivoRfid act : activos){
            activosRS.add(this.transformRS(act));
        }
        return activosRS;
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

    private ActivoRfidRS transformRS(ActivoRfid activo){
        ActivoRfidRS activoRfidRS = new ActivoRfidRS();
        activoRfidRS.setCodigo(activo.getCodigo());
        activoRfidRS.setCodigoRfid(activo.getCodigoRfid());
        activoRfidRS.setCustodio1(activo.getCustodio1());
        activoRfidRS.setCustodio2(activo.getCustodio2());
        activoRfidRS.setDescripcion(activo.getDescripcion());
        activoRfidRS.setEstadoJustificado(activo.getEstadoJustificado());
        activoRfidRS.setEstadoTransaccion(activo.getEstadoTransaccion());
        activoRfidRS.setUsuario(activo.getUsuario());
        return activoRfidRS;
    }
    // String subirFile(MultipartFile file, ActivoRfid activo){

    // }
}
