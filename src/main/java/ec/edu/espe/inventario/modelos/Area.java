package ec.edu.espe.inventario.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AF_AREA")
public class Area {
    @Id
    @Column(name = "CODIGO_AREA")
    private Integer codigoArea;
    @Column(name = "COD_DIRECCION")
    private Integer codDireccion;
    @Column(name = "DESC_AREA", length = 50)
    private String descArea;
    public Area() {
    }
    public Area(Integer codigoArea) {
        this.codigoArea = codigoArea;
    }
    public Integer getCodigoArea() {
        return codigoArea;
    }
    public void setCodigoArea(Integer codigoArea) {
        this.codigoArea = codigoArea;
    }
    public Integer getCodDireccion() {
        return codDireccion;
    }
    public void setCodDireccion(Integer codDireccion) {
        this.codDireccion = codDireccion;
    }
    public String getDescArea() {
        return descArea;
    }
    public void setDescArea(String descArea) {
        this.descArea = descArea;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoArea == null) ? 0 : codigoArea.hashCode());
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
        Area other = (Area) obj;
        if (codigoArea == null) {
            if (other.codigoArea != null)
                return false;
        } else if (!codigoArea.equals(other.codigoArea))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Area [codigoArea=" + codigoArea + ", codDireccion=" + codDireccion + ", descArea=" + descArea + "]";
    }
    
}
