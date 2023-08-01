package ec.edu.espe.inventario.controller.dto;

import java.util.Date;

public class ActivoRfidRQ {
    private Integer codigo;
    private String codigoRfid;
    private String custodio1;
    private String descripcion;
    private String usuario;
    private String estadoJustificado;
    private String estadoTransaccion;
    private Date fechaLectura;
    public ActivoRfidRQ() {
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getCodigoRfid() {
        return codigoRfid;
    }
    public void setCodigoRfid(String codigoRfid) {
        this.codigoRfid = codigoRfid;
    }
    public String getCustodio1() {
        return custodio1;
    }
    public void setCustodio1(String custodio1) {
        this.custodio1 = custodio1;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getEstadoJustificado() {
        return estadoJustificado;
    }
    public void setEstadoJustificado(String estadoJustificado) {
        this.estadoJustificado = estadoJustificado;
    }
    public String getEstadoTransaccion() {
        return estadoTransaccion;
    }
    public void setEstadoTransaccion(String estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }
    public Date getFechaLectura() {
        return fechaLectura;
    }
    public void setFechaLectura(Date fechaLectura) {
        this.fechaLectura = fechaLectura;
    }
    
}
