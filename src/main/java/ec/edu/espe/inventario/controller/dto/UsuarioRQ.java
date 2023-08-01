package ec.edu.espe.inventario.controller.dto;

import java.util.Date;

public class UsuarioRQ {
    private String login;
    private String passwd;
    private Integer tryAccess;
    private Date dateTry;
    public UsuarioRQ() {
    }
    public UsuarioRQ(String login, String passwd, Integer tryAccess, Date dateTry) {
        this.login = login;
        this.passwd = passwd;
        this.tryAccess = tryAccess;
        this.dateTry = dateTry;
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
    
}
