package ec.edu.espe.inventario.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VA_FUNCIONARIO")
public class Funcionario {
    @Id
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "CODIGO_EMPRESA")
    private Integer codigoEmpresa;
    @Column(name = "LOCALIDAD")
    private Integer localidad;
    @Column(name = "NOMBRE", length = 80)
    private String nombre;
    @Column(name = "IDENTIFICACION", length = 20)
    private String identificacion;
    public Funcionario() {
    }
    public Funcionario(Integer codigo) {
        this.codigo = codigo;
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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Funcionario [codigo=" + codigo + ", codigoEmpresa=" + codigoEmpresa + ", localidad=" + localidad
                + ", nombre=" + nombre + ", identificacion=" + identificacion + "]";
    }
    
}
