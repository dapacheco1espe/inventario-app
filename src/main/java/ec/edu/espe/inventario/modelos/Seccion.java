package ec.edu.espe.inventario.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AF_SECCION")
public class Seccion {
    @Id
    @Column(name = "CODIGO_SECCION")
    private Integer codigoSeccion;
    @Column(name = "COD_AREA")
    private Integer codArea;
    @Column(name = "COD_DIRECCION")
    private Integer codDireccion;
    @Column(name = "DESC_SECCION", length = 50)
    private String descSeccion;
    public Seccion(Integer codigoSeccion) {
        this.codigoSeccion = codigoSeccion;
    }
    public Seccion() {
    }
    public Integer getCodigoSeccion() {
        return codigoSeccion;
    }
    public void setCodigoSeccion(Integer codigoSeccion) {
        this.codigoSeccion = codigoSeccion;
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
    public String getDescSeccion() {
        return descSeccion;
    }
    public void setDescSeccion(String descSeccion) {
        this.descSeccion = descSeccion;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoSeccion == null) ? 0 : codigoSeccion.hashCode());
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
        Seccion other = (Seccion) obj;
        if (codigoSeccion == null) {
            if (other.codigoSeccion != null)
                return false;
        } else if (!codigoSeccion.equals(other.codigoSeccion))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Seccion [codigoSeccion=" + codigoSeccion + ", codArea=" + codArea + ", codDireccion=" + codDireccion
                + ", descSeccion=" + descSeccion + "]";
    }
    
}
