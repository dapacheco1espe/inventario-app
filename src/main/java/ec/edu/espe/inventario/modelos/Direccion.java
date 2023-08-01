package ec.edu.espe.inventario.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AF_DIRECCION")
public class Direccion {
    @Id
    @Column(name = "CODIGO_DIRECCION")
    private Integer codigoDireccion;
    @Column(name = "DESC_DIRECCION", length = 50)
    private String descDireccion;
    public Direccion() {
    }
    public Direccion(Integer codigoDireccion) {
        this.codigoDireccion = codigoDireccion;
    }
    public Integer getCodigoDireccion() {
        return codigoDireccion;
    }
    public void setCodigoDireccion(Integer codigoDireccion) {
        this.codigoDireccion = codigoDireccion;
    }
    public String getDescDireccion() {
        return descDireccion;
    }
    public void setDescDireccion(String descDireccion) {
        this.descDireccion = descDireccion;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoDireccion == null) ? 0 : codigoDireccion.hashCode());
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
        Direccion other = (Direccion) obj;
        if (codigoDireccion == null) {
            if (other.codigoDireccion != null)
                return false;
        } else if (!codigoDireccion.equals(other.codigoDireccion))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Direccion [codigoDireccion=" + codigoDireccion + ", descDireccion=" + descDireccion + "]";
    }

}
