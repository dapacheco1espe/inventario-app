package ec.edu.espe.inventario.controller.dto;

import java.util.List;

public class ActivosRfidList {
    private List<ActivoRfidRQ> listaActivosRfid;
        
    public ActivosRfidList() {
    }

    public List<ActivoRfidRQ> getListaActivosRfid() {
        return listaActivosRfid;
    }

    public void setListaActivosRfid(List<ActivoRfidRQ> listaActivosRfid) {
        this.listaActivosRfid = listaActivosRfid;
    }
    
}
