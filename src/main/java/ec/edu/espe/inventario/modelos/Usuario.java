package ec.edu.espe.inventario.modelos;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USR")
public class Usuario {
    @Id
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "LOGIN", length = 20)
    private String login;
    @Column(name = "PASSWD", length = 100)
    private String passwd;
    @Column(name = "TIPO")
    private Integer tipo;
    @Column(name = "CAJA", precision = 38, scale = 10)
    private BigDecimal caja;
    @Column(name = "ACCESO")
    private Integer acceso;
    @Column(name = "CADENA", length = 50)
    private String cadena;
    @Column(name = "IDRUC")
    private Integer idRuc;
    @Column(name = "IDENTIFICACION", length = 20)
    private String identificacion;
    @Column(name = "NOMBRE", length = 150)
    private String nombre;
    @Column(name = "EMAIL", length = 50)
    private String email;
    @Column(name = "PERIODOP")
    private Integer periodop;
    @Column(name = "TRY")
    private Integer tryAccess;
    @Column(name = "DATETRY")
    private Date dateTry;
    public Usuario() {
    }
    public Usuario(Integer codigo) {
        this.codigo = codigo;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public Integer getTipo() {
        return tipo;
    }
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    public BigDecimal getCaja() {
        return caja;
    }
    public void setCaja(BigDecimal caja) {
        this.caja = caja;
    }
    public Integer getAcceso() {
        return acceso;
    }
    public void setAcceso(Integer acceso) {
        this.acceso = acceso;
    }
    public String getCadena() {
        return cadena;
    }
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public Integer getIdRuc() {
        return idRuc;
    }
    public void setIdRuc(Integer idRuc) {
        this.idRuc = idRuc;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmai() {
        return email;
    }
    public void setEmai(String email) {
        this.email = email;
    }
    public Integer getPeriodop() {
        return periodop;
    }
    public void setPeriodop(Integer periodop) {
        this.periodop = periodop;
    }
    public Integer getTryAccess() {
        return tryAccess;
    }
    public void setTryAccess(Integer tryAccess) {
        this.tryAccess = tryAccess;
    }
    public Date getDateTry() {
        return dateTry;
    }
    public void setDateTry(Date dateTry) {
        this.dateTry = dateTry;
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
        Usuario other = (Usuario) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Usuario [codigo=" + codigo + ", login=" + login + ", passwd=" + passwd + ", tipo=" + tipo + ", caja="
                + caja + ", acceso=" + acceso + ", cadena=" + cadena + ", idRuc=" + idRuc + ", identificacion="
                + identificacion + ", nombre=" + nombre + ", emai=" + email + ", periodop=" + periodop + ", tryAccess="
                + tryAccess + ", dateTry=" + dateTry + "]";
    }
    
}
