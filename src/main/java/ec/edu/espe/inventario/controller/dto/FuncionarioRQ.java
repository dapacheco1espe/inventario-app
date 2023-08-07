package ec.edu.espe.inventario.controller.dto;


public class FuncionarioRQ {
    private Integer codigo;
    private Integer codigoEmpresa;
    private Integer localidad;
    private String nombre;
    private String identificacion;
    public FuncionarioRQ() {
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
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
}
