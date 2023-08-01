package ec.edu.espe.inventario.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ACTIVOSRFID")
public class ActivoRfid {
    @Id
    @Column(name = "CODIGO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACTIVOSRFIDSQ")
    @SequenceGenerator(name = "ACTIVOSRFIDSQ", sequenceName = "ACTIVOSRFIDSQ", allocationSize = 1)
    private Integer codigo;
    @Column(name = "CODIGO_RFID", length = 100)
    private String codigoRfid;
    @Column(name = "CUSTODIO1", length = 300)
    private String custodio1;
    @Column(name = "CUSTODIO2", length = 300)
    private String custodio2;
    @Column(name = "DESCRIPCION", length = 300)
    private String descripcion;
    @Column(name = "USUARIO", length = 255)
    private String usuario;
    @Column(name = "ESTADOJUSTIFICADO", length = 15)
    private String estadoJustificado;
    @Column(name = "ESTADOTRANSACCION", length = 15)
    private String estadoTransaccion;
    @Column(name = "FECHA_LECTURA")
    private Date fechaLectura;
    public ActivoRfid() {
    }
    public ActivoRfid(Integer codigo) {
        this.codigo = codigo;
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
    public String getCustodio2() {
        return custodio2;
    }
    public void setCustodio2(String custodio2) {
        this.custodio2 = custodio2;
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
        ActivoRfid other = (ActivoRfid) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "ActivoRfid [codigo=" + codigo + ", codigoRfid=" + codigoRfid + ", custodio1=" + custodio1
                + ", custodio2=" + custodio2 + ", descripcion=" + descripcion + ", usuario=" + usuario
                + ", estadoJustificado=" + estadoJustificado + ", estadoTransaccion=" + estadoTransaccion
                + ", fechaLectura=" + fechaLectura + "]";
    }
}
