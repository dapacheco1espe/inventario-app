package ec.edu.espe.inventario.controller.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ActivoRQ {
    private Integer codigo;
    private Integer codigoEmpresa;
    private Integer localidad;
    private Integer origen;
    private Integer tipo;
    private Integer subtipo;
    private Integer clase;
    private Integer codLocalidad;
    private Integer conceptoTransaccion;
    private Integer lote;
    private Integer sublote;
    private String descripcion;
    private String observacion;
    private Integer cantidad;
    private BigDecimal valor;
    private Date fechaAdquisicion;
    private String custodio1;
    private String custodio2;
    private String usuario;
    private String mef;
    private String codMef;
    public ActivoRQ() {
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Integer getCodigoEmpresa() {
        return codigoEmpresa;
    }
    public void setCodigoEmpresa(Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }
    public Integer getLocalidad() {
        return localidad;
    }
    public void setLocalidad(Integer localidad) {
        this.localidad = localidad;
    }
    public Integer getOrigen() {
        return origen;
    }
    public void setOrigen(Integer origen) {
        this.origen = origen;
    }
    public Integer getTipo() {
        return tipo;
    }
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    public Integer getSubtipo() {
        return subtipo;
    }
    public void setSubtipo(Integer subtipo) {
        this.subtipo = subtipo;
    }
    public Integer getClase() {
        return clase;
    }
    public void setClase(Integer clase) {
        this.clase = clase;
    }
    public Integer getCodLocalidad() {
        return codLocalidad;
    }
    public void setCodLocalidad(Integer codLocalidad) {
        this.codLocalidad = codLocalidad;
    }
    public Integer getConceptoTransaccion() {
        return conceptoTransaccion;
    }
    public void setConceptoTransaccion(Integer conceptoTransaccion) {
        this.conceptoTransaccion = conceptoTransaccion;
    }
    public Integer getLote() {
        return lote;
    }
    public void setLote(Integer lote) {
        this.lote = lote;
    }
    public Integer getSublote() {
        return sublote;
    }
    public void setSublote(Integer sublote) {
        this.sublote = sublote;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }
    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }
    public String getCustodio1() {
        return custodio1;
    }
    public void setCustodio1(String custodio1) {
        this.custodio1 = custodio1;
    }
    public String getCustodio2() {
        return custodio2;
    }
    public void setCustodio2(String custodio2) {
        this.custodio2 = custodio2;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getMef() {
        return mef;
    }
    public void setMef(String mef) {
        this.mef = mef;
    }
    public String getCodMef() {
        return codMef;
    }
    public void setCodMef(String codMef) {
        this.codMef = codMef;
    }
    
}
