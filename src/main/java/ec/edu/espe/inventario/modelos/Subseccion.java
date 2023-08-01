package ec.edu.espe.inventario.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AF_SUBSECCION")
public class Subseccion {
    @Id
    @Column(name = "CODIGO_SUBSECCION")
    private Integer codigoSubseccion;
    @Column(name = "COD_SECCION")
    private Integer codSeccion;
    @Column(name = "COD_AREA")
    private Integer codArea;
    @Column(name = "COD_DIRECCION")
    private Integer codDireccion;
    @Column(name = "DESC_SUBSECCION", length = 50)
    private String descSubseccion;
    public Subseccion() {
    }
    public Subseccion(Integer codigoSubseccion) {
        this.codigoSubseccion = codigoSubseccion;
    }
    public Integer getCodigoSubseccion() {
        return codigoSubseccion;
    }
    public void setCodigoSubseccion(Integer codigoSubseccion) {
        this.codigoSubseccion = codigoSubseccion;
    }
    public Integer getCodSeccion() {
        return codSeccion;
    }
    public void setCodSeccion(Integer codSeccion) {
        this.codSeccion = codSeccion;
    }
    public Integer getCodArea() {
        return codArea;
    }
    public void setCodArea(Integer codArea) {
        this.codArea = codArea;
    }
    public Integer getCodDireccion() {
        return codDireccion;
    }
    public void setCodDireccion(Integer codDireccion) {
        this.codDireccion = codDireccion;
    }
    public String getDescSubseccion() {
        return descSubseccion;
    }
    public void setDescSubseccion(String descSubseccion) {
        this.descSubseccion = descSubseccion;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoSubseccion == null) ? 0 : codigoSubseccion.hashCode());
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
        Subseccion other = (Subseccion) obj;
        if (codigoSubseccion == null) {
            if (other.codigoSubseccion != null)
                return false;
        } else if (!codigoSubseccion.equals(other.codigoSubseccion))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Subseccion [codigoSubseccion=" + codigoSubseccion + ", codSeccion=" + codSeccion + ", codArea="
                + codArea + ", codDireccion=" + codDireccion + ", descSubseccion=" + descSubseccion + "]";
    }
    
}
