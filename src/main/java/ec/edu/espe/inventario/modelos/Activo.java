package ec.edu.espe.inventario.modelos;


import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AF_ACTIVOFIJOB")
public class Activo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CODIGO", nullable = false)
    private Integer codigo;
    @Column(name = "CODIGO_EMPRESA" , nullable = false)
    private Integer codigoEmpresa;
    @Column(name = "LOCALIDAD", nullable = false)
    private Integer localidad;
    @Column(name = "ORIGEN", nullable = false)
    private Integer origen;
    @Column(name = "TIPO", nullable = false)
    private Integer tipo;
    @Column(name = "SUBTIPO", nullable = false)
    private Integer subtipo;
    @Column(name = "CLASE", nullable = false)
    private Integer clase;
    @Column(name = "COD_LOCALIDAD", nullable = false)
    private Integer codLocalidad;
    @Column(name = "CONCEPTO_TRANSACCION")
    private Integer conceptoTransaccion;
    @Column(name = "LOTE")
    private Integer lote;
    @Column(name = "SUBLOTE")
    private Integer sublote;
    // @Column(name = "HISTORIAL", precision = 38, scale = 10)
    // private Float historial;
    // @Column(name = "TIPOTRANSACCION", length = 2)
    // private String tipoTransaccion;
    // @Column(name = "NUMERO_TRANSACCION", precision = 38, scale = 10)
    // private Float numeroTransaccion;
    // @Column(name = "FECHA_TRANSACCION")
    // private Date fechaTransaccion;
    // @Column(name = "PRINCIPAL", precision = 38, scale = 10)
    // private Float principal;
    // @Column(name = "SINUSO")
    // private Integer sinUso;
    // @Column(name = "ACTIVIDAD")
    // private Integer actividad;
    @Column(name = "DESCRIPCION", length = 1000)
    private String descripcion;
    @Column(name = "OBSERVACION", length = 1000)
    private String observacion;
    // @Column(name = "CANTIDADORIGINAL")
    // private Integer cantidadOriginal;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    // @Column(name = "AVALUOTECNICO")
    // private Integer avaluoTecnico;
    @Column(name = "VALOR", precision = 38, scale = 10)
    private BigDecimal valor;
    // @Column(name = "VALORME", precision = 38, scale = 10)
    // private Float valorMe;
    // @Column(name = "VALORAVALUO", precision = 38, scale = 10)
    // private Float valorAvaluo;
    // @Column(name = "VALORAVALUOME", precision = 38, scale = 10)
    // private Float valorAvaluoMe;
    // @Column(name = "DEPRECH", precision = 38, scale = 10)
    // private Float deprech;
    // @Column(name = "DEPRECHME", precision = 38, scale = 10)
    // private Float deprechMe;
    // @Column(name = "VIDAUTIL")
    // private Integer vidaUtil;
    // @Column(name = "PORCDEPRE", precision = 38, scale = 10)
    // private Float porcDepre;
    // @Column(name = "PORCDEPREMENSUAL", precision = 38, scale = 10)
    // private Float porcDepreMensual;
    @Column(name = "FECHAADQUISICION")
    private Date fechaAdquisicion;
    // @Column(name = "FECHAAPLICACION")
    // private Date fechaAplicacion;
    // @Column(name = "ESTADOCONS")
    // private Integer estadoCons;
    // @Column(name = "ESTRUCTURABIEN")
    // private Integer estructuraBien;
    // @Column(name = "COLOR")
    // private Integer color;
    // @Column(name = "DIMENSIONES", length = 150)
    // private String dimensiones;
    // @Column(name = "MARCA", length = 150)
    // private String marca;
    // @Column(name = "MODELO", length = 150)
    // private String modelo;
    // @Column(name = "NSERIE", length = 150)
    // private String nSerie;
    // @Column(name = "PLACA", length = 150)
    // private String placa;
    // @Column(name = "MOTOR", length = 150)
    // private String motor;
    // @Column(name = "CHASIS", length = 150)
    // private String chasis;
    // @Column(name = "CLASEVEHICULO", length = 150)
    // private String claseVehiculo;
    // @Column(name = "TIPOVEHICULO", length = 150)
    // private String tipoVehiculo;
    // @Column(name = "ANIOFABRICA")
    // private Integer anioFabrica;
    // @Column(name = "OBRA", length = 150)
    // private String obra;
    // @Column(name = "AUTOR", length = 150)
    // private String autor;
    // @Column(name = "TIPOOBRA", length = 150)
    // private String tipoObra;
    // @Column(name = "NOMBRE", length = 150)
    // private String nombre;
    // @Column(name = "ARETE", length = 150)
    // private String arete;
    // @Column(name = "FECHA_NACIMIENTO")
    // private Date fechaNacimiento;
    // @Column(name = "RAZA", length = 50)
    // private String raza;
    // @Column(name = "SEXO", length = 1)
    // private String sexo;
    // @Column(name = "AREACONS", length = 150)
    // private String areaCons;
    // @Column(name = "VALORCOMERCIAL", precision = 38, scale = 10)
    // private String valorComercial;
    // @Column(name = "INFRAESTRUCTURA", length = 150)
    // private String infraestructura;
    // @Column(name = "REGISTROPROPIEDAD")
    // private Date registroPropiedad;
    // @Column(name = "LINDEROS", length = 150)
    // private String linderos;
    // @Column(name = "ORIGENCOMPRA")
    // private Integer origenCompra;
    // @Column(name = "ORIGENFONDO")
    // private Integer origenFondo;
    // @Column(name = "TIPOCOMODATO")
    // private Integer tipoComodato;
    // @Column(name = "NPROPIETARIO", length = 15)
    // private String nPropietario;
    @Column(name = "CUSTODIO1", length = 15)
    private String custodio1;
    @Column(name = "CUSTODIO2", length = 15)
    private String custodio2;
    // @Column(name = "UNIONOPERATIVA")
    // private Integer unionOperativa;
    // @Column(name = "SUCURSAL")
    // private Integer sucursal;
    // @Column(name = "PROVINCIA")
    // private Integer provincia;
    // @Column(name = "CANTON")
    // private Integer canton;
    // @Column(name = "PARROQUIA")
    // private Integer parroquia;
    // @Column(name = "DIRECCION")
    // private Integer direccion;
    // @Column(name = "AREA")
    // private Integer area;
    // @Column(name = "SECCION")
    // private Integer seccion;
    // @Column(name = "SUBSECCION")
    // private Integer subseccion;
    // @Column(name = "FECHAGARANTIA")
    // private Date fechaGarantia;
    // @Column(name = "DEPREANT", precision = 38, scale = 10)
    // private Float depreAnt;
    // @Column(name = "DEPREANTME", precision = 38, scale = 10)
    // private Float depreAntMe;
    // @Column(name = "DEPREACTUAL", precision = 38, scale = 10)
    // private Float depreActual;
    // @Column(name = "DEPREACTUALME", precision = 38, scale = 10)
    // private Float depreActualMe;
    // @Column(name = "DEPREINICIAL", precision = 38, scale = 10)
    // private Float depreInicial;
    // @Column(name = "DEPREINICIALME", precision = 38, scale = 10)
    // private Float depreInicialMe;
    // @Column(name = "DEPRECI", precision = 38, scale = 10)
    // private Float depreci;
    // @Column(name = "DEPRECIME", precision = 38, scale = 10)
    // private Float depreciMe;
    // @Column(name = "GENASIENTO", precision = 38, scale = 10)
    // private Float genAsiento;
    // @Column(name = "MONEDA")
    // private Integer moneda;
    // @Column(name = "COTIZACION", precision = 38, scale = 10)
    // private Float cotizacion;
    // @Column(name = "SINREVISARTF")
    // private Integer sinRevisarTf;
    // @Column(name = "FECHA_TOMAF")
    // private Date fechTomaf;
    // @Column(name = "VALOREREP", precision = 38, scale = 10)
    // private Float valorRep;
    // @Column(name = "CONCEPTO", length = 50)
    // private String concepto;
    // @Column(name = "NCOMPONENTES")
    // private Integer nComponentes;
    // @Column(name = "TRANSFERIDOCI")
    // private Integer transferiDoci;
    // @Column(name = "FOTO", length = 250)
    // private String foto;
    // @Column(name = "DEPRECIADOTOTAL")
    // private Integer depreciadoTotal;
    // @Column(name = "ESTADO", length = 3)
    // private String estado;
    // @Column(name = "ASEGURADO")
    // private Integer asegurado;
    @Column(name = "USUARIO", length = 50)
    private String usuario;
    // @Column(name = "FECHACRE")
    // private Date fechaCre;
    // @Column(name = "USUARIOM", length = 50)
    // private String usuarioM;
    // @Column(name = "FECHAUAC")
    // private Date fechaUac;
    // @Column(name = "BRECHA1", precision = 38, scale = 10)
    // private Float brecha1;
    // @Column(name = "PERMISOBORRADO")
    // private Integer permisoBorrado;
    // @Column(name = "LOCALIDAD_EGRESO", length = 10)
    // private String localidadEgreso;
    // @Column(name = "LOCALIDAD_INGRESO", length = 10)
    // private String localidadIngreso;
    // @Column(name = "ESTUVOSINUSO")
    // private Integer estuvoSinUso;
    // @Column(name = "CONJUNTO", precision = 38, scale = 10)
    // private Float conjunto;
    // @Column(name = "DISPOSITIVO")
    // private Integer dispositivo;
    // @Column(name = "MOTIVOBAJA")
    // private Integer motivoBaja;
    // @Column(name = "AUTORIZABAJA", length = 15)
    // private String autorizaBaja;
    // @Column(name = "DETALLEBAJA", length = 500)
    // private String detalleBaja;
    // @Column(name = "AQUIEN", length = 15)
    // private String aQuien;
    // @Column(name = "ESPECIFIQUE")
    // private Integer especifique;
    // @Column(name = "LOCALIDADINGRESO")
    // private Integer localidadIngresoInt;
    // @Column(name = "LOCALIDADEGRESO")
    // private Integer localidadEgresoInt;
    // @Column(name = "ULTIMADP")
    // private Integer ultimaDp;
    // @Column(name = "POLIZA", precision = 38, scale = 10)
    // private Float poliza;
    // @Column(name = "ENVIADO")
    // private Integer enviado;
    // @Column(name = "TIPO_TOMAF")
    // private Integer tipoTomaF;
    // @Column(name = "PAISFABRICA")
    // private Integer paisFabrica;
    // @Column(name = "CATASTRO", length = 50)
    // private String catastro;
    // @Column(name = "DIGITAVU")
    // private Integer digitaVu;
    // @Column(name = "FECHAEC")
    // private Date fechEc;
    // @Column(name = "ANIOEC")
    // private Integer anioEc;
    // @Column(name = "FECHAECH")
    // private Date fechaEch;
    // @Column(name = "OEMPRESA", length = 15)
    // private String oEmpresa;
    // @Column(name = "NUM_EGRESO", precision = 38, scale = 10)
    // private Float numEgreso;
    // @Column(name = "GENASIENTOCO")
    // private Integer genAsientoco;
    // @Column(name = "EXCEL")
    // private Integer excel;
    // @Column(name = "ARCEXCEL", length = 250)
    // private String arcExcel;
    // @Column(name = "CODIGONUEVO")
    // private Integer codigoNuevo;
    // @Column(name = "CODIGORIG")
    // private Integer codigoRig;
    // @Column(name = "CAMBIADO")
    // private Integer cambiado;
    // @Column(name = "NUM_DEVOLUCION", precision = 38, scale = 10)
    // private Float NumDevolucion;
    // @Column(name = "IMPRESO")
    // private Integer impreso;
    // @Column(name = "IMPRESOETQ", length = 50)
    // private String impresoEtq;
    // @Column(name = "PROGRAMA", precision = 38, scale = 10)
    // private Float programa;
    // @Column(name = "PROYECTO", precision = 38, scale = 10)
    // private Float proyecto;
    // @Column(name = "CODIGOANT", length = 20)
    // private String codigoAnt;
    // @Column(name = "CODIGOGRUPO", precision = 38, scale = 10)
    // private Float codigoGrupo;
    // @Column(name = "SUBCLASE")
    // private Integer subclase;
    // @Column(name = "DETALLETRA", length = 1000)
    // private String detalleTra;
    // @Column(name = "RECUPERADOB")
    // private Integer recuperadoB;
    // @Column(name = "NUEVOVALOR", precision = 38, scale = 10)
    // private Float nuevoValor;
    // @Column(name = "IVA", precision = 38, scale = 10)
    // private Float iva;
    // @Column(name = "SUBTOTAL", precision = 38, scale = 10)
    // private Float subtotal;
    // @Column(name = "OLVIDADOCI")
    // private Integer olvidadoCi;
    // @Column(name = "NACTALEV")
    // private Integer nActaLev;
    @Column(name = "MEF", length = 700)
    private String mef;
    @Column(name = "CODMEF", length = 150)
    private String codMef;
    // @Column(name = "PARTIDAMEF", length = 150)
    // private String partidaMef;
    // @Column(name = "CUENTAMEF", length = 150)
    // private String cuentaMef;
    // @Column(name = "TPROYEMEF", length = 50)
    // private String tProyMef;
    // @Column(name = "ITEMPRESUMEF", length = 150)
    // private String itemPresuMef;
    // @Column(name = "PTOORIGEN")
    // private Integer ptoOrigen;
    // @Column(name = "PORCIVA", precision = 38, scale = 10)
    // private Float porcIva;
    // @Column(name = "CSOLIDARIA")
    // private Integer cSolidaria;
    // @Column(name = "NUMREVALUO")
    // private Integer numRemvaluo;
    // @Column(name = "FECHA_APLRV")
    // private Date fechaAplrv;
    // @Column(name = "VIDAUTILRV", precision = 4, scale = 2)
    // private Float vidaUtilRv;
    // @Column(name = "VALORRV", precision = 28, scale = 10)
    // private Float valorRv;
    // @Column(name = "VALORDEPRECIARLUEGORV", precision = 28, scale = 10)
    // private Float valorDepreciarLuegoRv;
    // @Column(name = "NUEVOCH", precision = 28, scale = 10)
    // private Float nuevoCh;
    // @Column(name = "NUEVADPRACUM", precision = 28, scale = 10)
    // private Float nuevaDpracum;
    // @Column(name = "DEPREANTRV", precision = 28, scale = 10)
    // private Float depreAntRv;
    // @Column(name = "DEPREACTRV", precision = 28, scale = 10)
    // private Float depreActRv;
    
    public Activo(Integer codigo, Integer codigoEmpresa, Integer localidad, Integer origen, Integer tipo,
            Integer subtipo, Integer clase, Integer codLocalidad) {
        this.codigo = codigo;
        this.codigoEmpresa = codigoEmpresa;
        this.localidad = localidad;
        this.origen = origen;
        this.tipo = tipo;
        this.subtipo = subtipo;
        this.clase = clase;
        this.codLocalidad = codLocalidad;
    }
    public Activo() {
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
    // public Float getHistorial() {
    //     return historial;
    // }
    // public void setHistorial(Float historial) {
    //     this.historial = historial;
    // }
    // public String getTipoTransaccion() {
    //     return tipoTransaccion;
    // }
    // public void setTipoTransaccion(String tipoTransaccion) {
    //     this.tipoTransaccion = tipoTransaccion;
    // }
    // public Float getNumeroTransaccion() {
    //     return numeroTransaccion;
    // }
    // public void setNumeroTransaccion(Float numeroTransaccion) {
    //     this.numeroTransaccion = numeroTransaccion;
    // }
    // public Date getFechaTransaccion() {
    //     return fechaTransaccion;
    // }
    // public void setFechaTransaccion(Date fechaTransaccion) {
    //     this.fechaTransaccion = fechaTransaccion;
    // }
    // public Float getPrincipal() {
    //     return principal;
    // }
    // public void setPrincipal(Float principal) {
    //     this.principal = principal;
    // }
    // public Integer getSinUso() {
    //     return sinUso;
    // }
    // public void setSinUso(Integer sinUso) {
    //     this.sinUso = sinUso;
    // }
    // public Integer getActividad() {
    //     return actividad;
    // }
    // public void setActividad(Integer actividad) {
    //     this.actividad = actividad;
    // }
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
    // public Integer getCantidadOriginal() {
    //     return cantidadOriginal;
    // }
    // public void setCantidadOriginal(Integer cantidadOriginal) {
    //     this.cantidadOriginal = cantidadOriginal;
    // }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    // public Integer getAvaluoTecnico() {
    //     return avaluoTecnico;
    // }
    // public void setAvaluoTecnico(Integer avaluoTecnico) {
    //     this.avaluoTecnico = avaluoTecnico;
    // }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    // public Float getValorMe() {
    //     return valorMe;
    // }
    // public void setValorMe(Float valorMe) {
    //     this.valorMe = valorMe;
    // }
    // public Float getValorAvaluo() {
    //     return valorAvaluo;
    // }
    // public void setValorAvaluo(Float valorAvaluo) {
    //     this.valorAvaluo = valorAvaluo;
    // }
    // public Float getValorAvaluoMe() {
    //     return valorAvaluoMe;
    // }
    // public void setValorAvaluoMe(Float valorAvaluoMe) {
    //     this.valorAvaluoMe = valorAvaluoMe;
    // }
    // public Float getDeprech() {
    //     return deprech;
    // }
    // public void setDeprech(Float deprech) {
    //     this.deprech = deprech;
    // }
    // public Float getDeprechMe() {
    //     return deprechMe;
    // }
    // public void setDeprechMe(Float deprechMe) {
    //     this.deprechMe = deprechMe;
    // }
    // public Integer getVidaUtil() {
    //     return vidaUtil;
    // }
    // public void setVidaUtil(Integer vidaUtil) {
    //     this.vidaUtil = vidaUtil;
    // }
    // public Float getPorcDepre() {
    //     return porcDepre;
    // }
    // public void setPorcDepre(Float porcDepre) {
    //     this.porcDepre = porcDepre;
    // }
    // public Float getPorcDepreMensual() {
    //     return porcDepreMensual;
    // }
    // public void setPorcDepreMensual(Float porcDepreMensual) {
    //     this.porcDepreMensual = porcDepreMensual;
    // }
    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }
    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }
    // public Date getFechaAplicacion() {
    //     return fechaAplicacion;
    // }
    // public void setFechaAplicacion(Date fechaAplicacion) {
    //     this.fechaAplicacion = fechaAplicacion;
    // }
    // public Integer getEstadoCons() {
    //     return estadoCons;
    // }
    // public void setEstadoCons(Integer estadoCons) {
    //     this.estadoCons = estadoCons;
    // }
    // public Integer getEstructuraBien() {
    //     return estructuraBien;
    // }
    // public void setEstructuraBien(Integer estructuraBien) {
    //     this.estructuraBien = estructuraBien;
    // }
    // public Integer getColor() {
    //     return color;
    // }
    // public void setColor(Integer color) {
    //     this.color = color;
    // }
    // public String getDimensiones() {
    //     return dimensiones;
    // }
    // public void setDimensiones(String dimensiones) {
    //     this.dimensiones = dimensiones;
    // }
    // public String getMarca() {
    //     return marca;
    // }
    // public void setMarca(String marca) {
    //     this.marca = marca;
    // }
    // public String getModelo() {
    //     return modelo;
    // }
    // public void setModelo(String modelo) {
    //     this.modelo = modelo;
    // }
    // public String getnSerie() {
    //     return nSerie;
    // }
    // public void setnSerie(String nSerie) {
    //     this.nSerie = nSerie;
    // }
    // public String getPlaca() {
    //     return placa;
    // }
    // public void setPlaca(String placa) {
    //     this.placa = placa;
    // }
    // public String getMotor() {
    //     return motor;
    // }
    // public void setMotor(String motor) {
    //     this.motor = motor;
    // }
    // public String getChasis() {
    //     return chasis;
    // }
    // public void setChasis(String chasis) {
    //     this.chasis = chasis;
    // }
    // public String getClaseVehiculo() {
    //     return claseVehiculo;
    // }
    // public void setClaseVehiculo(String claseVehiculo) {
    //     this.claseVehiculo = claseVehiculo;
    // }
    // public String getTipoVehiculo() {
    //     return tipoVehiculo;
    // }
    // public void setTipoVehiculo(String tipoVehiculo) {
    //     this.tipoVehiculo = tipoVehiculo;
    // }
    // public Integer getAnioFabrica() {
    //     return anioFabrica;
    // }
    // public void setAnioFabrica(Integer anioFabrica) {
    //     this.anioFabrica = anioFabrica;
    // }
    // public String getObra() {
    //     return obra;
    // }
    // public void setObra(String obra) {
    //     this.obra = obra;
    // }
    // public String getAutor() {
    //     return autor;
    // }
    // public void setAutor(String autor) {
    //     this.autor = autor;
    // }
    // public String getTipoObra() {
    //     return tipoObra;
    // }
    // public void setTipoObra(String tipoObra) {
    //     this.tipoObra = tipoObra;
    // }
    // public String getNombre() {
    //     return nombre;
    // }
    // public void setNombre(String nombre) {
    //     this.nombre = nombre;
    // }
    // public String getArete() {
    //     return arete;
    // }
    // public void setArete(String arete) {
    //     this.arete = arete;
    // }
    // public Date getFechaNacimiento() {
    //     return fechaNacimiento;
    // }
    // public void setFechaNacimiento(Date fechaNacimiento) {
    //     this.fechaNacimiento = fechaNacimiento;
    // }
    // public String getRaza() {
    //     return raza;
    // }
    // public void setRaza(String raza) {
    //     this.raza = raza;
    // }
    // public String getSexo() {
    //     return sexo;
    // }
    // public void setSexo(String sexo) {
    //     this.sexo = sexo;
    // }
    // public String getAreaCons() {
    //     return areaCons;
    // }
    // public void setAreaCons(String areaCons) {
    //     this.areaCons = areaCons;
    // }
    // public String getValorComercial() {
    //     return valorComercial;
    // }
    // public void setValorComercial(String valorComercial) {
    //     this.valorComercial = valorComercial;
    // }
    // public String getInfraestructura() {
    //     return infraestructura;
    // }
    // public void setInfraestructura(String infraestructura) {
    //     this.infraestructura = infraestructura;
    // }
    // public Date getRegistroPropiedad() {
    //     return registroPropiedad;
    // }
    // public void setRegistroPropiedad(Date registroPropiedad) {
    //     this.registroPropiedad = registroPropiedad;
    // }
    // public String getLinderos() {
    //     return linderos;
    // }
    // public void setLinderos(String linderos) {
    //     this.linderos = linderos;
    // }
    // public Integer getOrigenCompra() {
    //     return origenCompra;
    // }
    // public void setOrigenCompra(Integer origenCompra) {
    //     this.origenCompra = origenCompra;
    // }
    // public Integer getOrigenFondo() {
    //     return origenFondo;
    // }
    // public void setOrigenFondo(Integer origenFondo) {
    //     this.origenFondo = origenFondo;
    // }
    // public Integer getTipoComodato() {
    //     return tipoComodato;
    // }
    // public void setTipoComodato(Integer tipoComodato) {
    //     this.tipoComodato = tipoComodato;
    // }
    // public String getnPropietario() {
    //     return nPropietario;
    // }
    // public void setnPropietario(String nPropietario) {
    //     this.nPropietario = nPropietario;
    // }
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
    // public Integer getUnionOperativa() {
    //     return unionOperativa;
    // }
    // public void setUnionOperativa(Integer unionOperativa) {
    //     this.unionOperativa = unionOperativa;
    // }
    // public Integer getSucursal() {
    //     return sucursal;
    // }
    // public void setSucursal(Integer sucursal) {
    //     this.sucursal = sucursal;
    // }
    // public Integer getProvincia() {
    //     return provincia;
    // }
    // public void setProvincia(Integer provincia) {
    //     this.provincia = provincia;
    // }
    // public Integer getCanton() {
    //     return canton;
    // }
    // public void setCanton(Integer canton) {
    //     this.canton = canton;
    // }
    // public Integer getParroquia() {
    //     return parroquia;
    // }
    // public void setParroquia(Integer parroquia) {
    //     this.parroquia = parroquia;
    // }
    // public Integer getDireccion() {
    //     return direccion;
    // }
    // public void setDireccion(Integer direccion) {
    //     this.direccion = direccion;
    // }
    // public Integer getArea() {
    //     return area;
    // }
    // public void setArea(Integer area) {
    //     this.area = area;
    // }
    // public Integer getSeccion() {
    //     return seccion;
    // }
    // public void setSeccion(Integer seccion) {
    //     this.seccion = seccion;
    // }
    // public Integer getSubseccion() {
    //     return subseccion;
    // }
    // public void setSubseccion(Integer subseccion) {
    //     this.subseccion = subseccion;
    // }
    // public Date getFechaGarantia() {
    //     return fechaGarantia;
    // }
    // public void setFechaGarantia(Date fechaGarantia) {
    //     this.fechaGarantia = fechaGarantia;
    // }
    // public Float getDepreAnt() {
    //     return depreAnt;
    // }
    // public void setDepreAnt(Float depreAnt) {
    //     this.depreAnt = depreAnt;
    // }
    // public Float getDepreAntMe() {
    //     return depreAntMe;
    // }
    // public void setDepreAntMe(Float depreAntMe) {
    //     this.depreAntMe = depreAntMe;
    // }
    // public Float getDepreActual() {
    //     return depreActual;
    // }
    // public void setDepreActual(Float depreActual) {
    //     this.depreActual = depreActual;
    // }
    // public Float getDepreActualMe() {
    //     return depreActualMe;
    // }
    // public void setDepreActualMe(Float depreActualMe) {
    //     this.depreActualMe = depreActualMe;
    // }
    // public Float getDepreInicial() {
    //     return depreInicial;
    // }
    // public void setDepreInicial(Float depreInicial) {
    //     this.depreInicial = depreInicial;
    // }
    // public Float getDepreInicialMe() {
    //     return depreInicialMe;
    // }
    // public void setDepreInicialMe(Float depreInicialMe) {
    //     this.depreInicialMe = depreInicialMe;
    // }
    // public Float getDepreci() {
    //     return depreci;
    // }
    // public void setDepreci(Float depreci) {
    //     this.depreci = depreci;
    // }
    // public Float getDepreciMe() {
    //     return depreciMe;
    // }
    // public void setDepreciMe(Float depreciMe) {
    //     this.depreciMe = depreciMe;
    // }
    // public Float getGenAsiento() {
    //     return genAsiento;
    // }
    // public void setGenAsiento(Float genAsiento) {
    //     this.genAsiento = genAsiento;
    // }
    // public Integer getMoneda() {
    //     return moneda;
    // }
    // public void setMoneda(Integer moneda) {
    //     this.moneda = moneda;
    // }
    // public Float getCotizacion() {
    //     return cotizacion;
    // }
    // public void setCotizacion(Float cotizacion) {
    //     this.cotizacion = cotizacion;
    // }
    // public Integer getSinRevisarTf() {
    //     return sinRevisarTf;
    // }
    // public void setSinRevisarTf(Integer sinRevisarTf) {
    //     this.sinRevisarTf = sinRevisarTf;
    // }
    // public Date getFechTomaf() {
    //     return fechTomaf;
    // }
    // public void setFechTomaf(Date fechTomaf) {
    //     this.fechTomaf = fechTomaf;
    // }
    // public Float getValorRep() {
    //     return valorRep;
    // }
    // public void setValorRep(Float valorRep) {
    //     this.valorRep = valorRep;
    // }
    // public String getConcepto() {
    //     return concepto;
    // }
    // public void setConcepto(String concepto) {
    //     this.concepto = concepto;
    // }
    // public Integer getnComponentes() {
    //     return nComponentes;
    // }
    // public void setnComponentes(Integer nComponentes) {
    //     this.nComponentes = nComponentes;
    // }
    // public Integer getTransferiDoci() {
    //     return transferiDoci;
    // }
    // public void setTransferiDoci(Integer transferiDoci) {
    //     this.transferiDoci = transferiDoci;
    // }
    // public String getFoto() {
    //     return foto;
    // }
    // public void setFoto(String foto) {
    //     this.foto = foto;
    // }
    // public Integer getDepreciadoTotal() {
    //     return depreciadoTotal;
    // }
    // public void setDepreciadoTotal(Integer depreciadoTotal) {
    //     this.depreciadoTotal = depreciadoTotal;
    // }
    // public String getEstado() {
    //     return estado;
    // }
    // public void setEstado(String estado) {
    //     this.estado = estado;
    // }
    // public Integer getAsegurado() {
    //     return asegurado;
    // }
    // public void setAsegurado(Integer asegurado) {
    //     this.asegurado = asegurado;
    // }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    // public Date getFechaCre() {
    //     return fechaCre;
    // }
    // public void setFechaCre(Date fechaCre) {
    //     this.fechaCre = fechaCre;
    // }
    // public String getUsuarioM() {
    //     return usuarioM;
    // }
    // public void setUsuarioM(String usuarioM) {
    //     this.usuarioM = usuarioM;
    // }
    // public Date getFechaUac() {
    //     return fechaUac;
    // }
    // public void setFechaUac(Date fechaUac) {
    //     this.fechaUac = fechaUac;
    // }
    // public Float getBrecha1() {
    //     return brecha1;
    // }
    // public void setBrecha1(Float brecha1) {
    //     this.brecha1 = brecha1;
    // }
    // public Integer getPermisoBorrado() {
    //     return permisoBorrado;
    // }
    // public void setPermisoBorrado(Integer permisoBorrado) {
    //     this.permisoBorrado = permisoBorrado;
    // }
    // public String getLocalidadEgreso() {
    //     return localidadEgreso;
    // }
    // public void setLocalidadEgreso(String localidadEgreso) {
    //     this.localidadEgreso = localidadEgreso;
    // }
    // public String getLocalidadIngreso() {
    //     return localidadIngreso;
    // }
    // public void setLocalidadIngreso(String localidadIngreso) {
    //     this.localidadIngreso = localidadIngreso;
    // }
    // public Integer getEstuvoSinUso() {
    //     return estuvoSinUso;
    // }
    // public void setEstuvoSinUso(Integer estuvoSinUso) {
    //     this.estuvoSinUso = estuvoSinUso;
    // }
    // public Float getConjunto() {
    //     return conjunto;
    // }
    // public void setConjunto(Float conjunto) {
    //     this.conjunto = conjunto;
    // }
    // public Integer getDispositivo() {
    //     return dispositivo;
    // }
    // public void setDispositivo(Integer dispositivo) {
    //     this.dispositivo = dispositivo;
    // }
    // public Integer getMotivoBaja() {
    //     return motivoBaja;
    // }
    // public void setMotivoBaja(Integer motivoBaja) {
    //     this.motivoBaja = motivoBaja;
    // }
    // public String getAutorizaBaja() {
    //     return autorizaBaja;
    // }
    // public void setAutorizaBaja(String autorizaBaja) {
    //     this.autorizaBaja = autorizaBaja;
    // }
    // public String getDetalleBaja() {
    //     return detalleBaja;
    // }
    // public void setDetalleBaja(String detalleBaja) {
    //     this.detalleBaja = detalleBaja;
    // }
    // public String getaQuien() {
    //     return aQuien;
    // }
    // public void setaQuien(String aQuien) {
    //     this.aQuien = aQuien;
    // }
    // public Integer getEspecifique() {
    //     return especifique;
    // }
    // public void setEspecifique(Integer especifique) {
    //     this.especifique = especifique;
    // }
    // public Integer getLocalidadIngresoInt() {
    //     return localidadIngresoInt;
    // }
    // public void setLocalidadIngresoInt(Integer localidadIngresoInt) {
    //     this.localidadIngresoInt = localidadIngresoInt;
    // }
    // public Integer getLocalidadEgresoInt() {
    //     return localidadEgresoInt;
    // }
    // public void setLocalidadEgresoInt(Integer localidadEgresoInt) {
    //     this.localidadEgresoInt = localidadEgresoInt;
    // }
    // public Integer getUltimaDp() {
    //     return ultimaDp;
    // }
    // public void setUltimaDp(Integer ultimaDp) {
    //     this.ultimaDp = ultimaDp;
    // }
    // public Float getPoliza() {
    //     return poliza;
    // }
    // public void setPoliza(Float poliza) {
    //     this.poliza = poliza;
    // }
    // public Integer getEnviado() {
    //     return enviado;
    // }
    // public void setEnviado(Integer enviado) {
    //     this.enviado = enviado;
    // }
    // public Integer getTipoTomaF() {
    //     return tipoTomaF;
    // }
    // public void setTipoTomaF(Integer tipoTomaF) {
    //     this.tipoTomaF = tipoTomaF;
    // }
    // public Integer getPaisFabrica() {
    //     return paisFabrica;
    // }
    // public void setPaisFabrica(Integer paisFabrica) {
    //     this.paisFabrica = paisFabrica;
    // }
    // public String getCatastro() {
    //     return catastro;
    // }
    // public void setCatastro(String catastro) {
    //     this.catastro = catastro;
    // }
    // public Integer getDigitaVu() {
    //     return digitaVu;
    // }
    // public void setDigitaVu(Integer digitaVu) {
    //     this.digitaVu = digitaVu;
    // }
    // public Date getFechEc() {
    //     return fechEc;
    // }
    // public void setFechEc(Date fechEc) {
    //     this.fechEc = fechEc;
    // }
    // public Integer getAnioEc() {
    //     return anioEc;
    // }
    // public void setAnioEc(Integer anioEc) {
    //     this.anioEc = anioEc;
    // }
    // public Date getFechaEch() {
    //     return fechaEch;
    // }
    // public void setFechaEch(Date fechaEch) {
    //     this.fechaEch = fechaEch;
    // }
    // public String getoEmpresa() {
    //     return oEmpresa;
    // }
    // public void setoEmpresa(String oEmpresa) {
    //     this.oEmpresa = oEmpresa;
    // }
    // public Float getNumEgreso() {
    //     return numEgreso;
    // }
    // public void setNumEgreso(Float numEgreso) {
    //     this.numEgreso = numEgreso;
    // }
    // public Integer getGenAsientoco() {
    //     return genAsientoco;
    // }
    // public void setGenAsientoco(Integer genAsientoco) {
    //     this.genAsientoco = genAsientoco;
    // }
    // public Integer getExcel() {
    //     return excel;
    // }
    // public void setExcel(Integer excel) {
    //     this.excel = excel;
    // }
    // public String getArcExcel() {
    //     return arcExcel;
    // }
    // public void setArcExcel(String arcExcel) {
    //     this.arcExcel = arcExcel;
    // }
    // public Integer getCodigoNuevo() {
    //     return codigoNuevo;
    // }
    // public void setCodigoNuevo(Integer codigoNuevo) {
    //     this.codigoNuevo = codigoNuevo;
    // }
    // public Integer getCodigoRig() {
    //     return codigoRig;
    // }
    // public void setCodigoRig(Integer codigoRig) {
    //     this.codigoRig = codigoRig;
    // }
    // public Integer getCambiado() {
    //     return cambiado;
    // }
    // public void setCambiado(Integer cambiado) {
    //     this.cambiado = cambiado;
    // }
    // public Float getNumDevolucion() {
    //     return NumDevolucion;
    // }
    // public void setNumDevolucion(Float numDevolucion) {
    //     NumDevolucion = numDevolucion;
    // }
    // public Integer getImpreso() {
    //     return impreso;
    // }
    // public void setImpreso(Integer impreso) {
    //     this.impreso = impreso;
    // }
    // public String getImpresoEtq() {
    //     return impresoEtq;
    // }
    // public void setImpresoEtq(String impresoEtq) {
    //     this.impresoEtq = impresoEtq;
    // }
    // public Float getPrograma() {
    //     return programa;
    // }
    // public void setPrograma(Float programa) {
    //     this.programa = programa;
    // }
    // public Float getProyecto() {
    //     return proyecto;
    // }
    // public void setProyecto(Float proyecto) {
    //     this.proyecto = proyecto;
    // }
    // public String getCodigoAnt() {
    //     return codigoAnt;
    // }
    // public void setCodigoAnt(String codigoAnt) {
    //     this.codigoAnt = codigoAnt;
    // }
    // public Float getCodigoGrupo() {
    //     return codigoGrupo;
    // }
    // public void setCodigoGrupo(Float codigoGrupo) {
    //     this.codigoGrupo = codigoGrupo;
    // }
    // public Integer getSubclase() {
    //     return subclase;
    // }
    // public void setSubclase(Integer subclase) {
    //     this.subclase = subclase;
    // }
    // public String getDetalleTra() {
    //     return detalleTra;
    // }
    // public void setDetalleTra(String detalleTra) {
    //     this.detalleTra = detalleTra;
    // }
    // public Integer getRecuperadoB() {
    //     return recuperadoB;
    // }
    // public void setRecuperadoB(Integer recuperadoB) {
    //     this.recuperadoB = recuperadoB;
    // }
    // public Float getNuevoValor() {
    //     return nuevoValor;
    // }
    // public void setNuevoValor(Float nuevoValor) {
    //     this.nuevoValor = nuevoValor;
    // }
    // public Float getIva() {
    //     return iva;
    // }
    // public void setIva(Float iva) {
    //     this.iva = iva;
    // }
    // public Float getSubtotal() {
    //     return subtotal;
    // }
    // public void setSubtotal(Float subtotal) {
    //     this.subtotal = subtotal;
    // }
    // public Integer getOlvidadoCi() {
    //     return olvidadoCi;
    // }
    // public void setOlvidadoCi(Integer olvidadoCi) {
    //     this.olvidadoCi = olvidadoCi;
    // }
    // public Integer getnActaLev() {
    //     return nActaLev;
    // }
    // public void setnActaLev(Integer nActaLev) {
    //     this.nActaLev = nActaLev;
    // }
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
    // public String getPartidaMef() {
    //     return partidaMef;
    // }
    // public void setPartidaMef(String partidaMef) {
    //     this.partidaMef = partidaMef;
    // }
    // public String getCuentaMef() {
    //     return cuentaMef;
    // }
    // public void setCuentaMef(String cuentaMef) {
    //     this.cuentaMef = cuentaMef;
    // }
    // public String gettProyMef() {
    //     return tProyMef;
    // }
    // public void settProyMef(String tProyMef) {
    //     this.tProyMef = tProyMef;
    // }
    // public String getItemPresuMef() {
    //     return itemPresuMef;
    // }
    // public void setItemPresuMef(String itemPresuMef) {
    //     this.itemPresuMef = itemPresuMef;
    // }
    // public Integer getPtoOrigen() {
    //     return ptoOrigen;
    // }
    // public void setPtoOrigen(Integer ptoOrigen) {
    //     this.ptoOrigen = ptoOrigen;
    // }
    // public Float getPorcIva() {
    //     return porcIva;
    // }
    // public void setPorcIva(Float porcIva) {
    //     this.porcIva = porcIva;
    // }
    // public Integer getcSolidaria() {
    //     return cSolidaria;
    // }
    // public void setcSolidaria(Integer cSolidaria) {
    //     this.cSolidaria = cSolidaria;
    // }
    // public Integer getNumRemvaluo() {
    //     return numRemvaluo;
    // }
    // public void setNumRemvaluo(Integer numRemvaluo) {
    //     this.numRemvaluo = numRemvaluo;
    // }
    // public Date getFechaAplrv() {
    //     return fechaAplrv;
    // }
    // public void setFechaAplrv(Date fechaAplrv) {
    //     this.fechaAplrv = fechaAplrv;
    // }
    // public Float getVidaUtilRv() {
    //     return vidaUtilRv;
    // }
    // public void setVidaUtilRv(Float vidaUtilRv) {
    //     this.vidaUtilRv = vidaUtilRv;
    // }
    // public Float getValorRv() {
    //     return valorRv;
    // }
    // public void setValorRv(Float valorRv) {
    //     this.valorRv = valorRv;
    // }
    // public Float getValorDepreciarLuegoRv() {
    //     return valorDepreciarLuegoRv;
    // }
    // public void setValorDepreciarLuegoRv(Float valorDepreciarLuegoRv) {
    //     this.valorDepreciarLuegoRv = valorDepreciarLuegoRv;
    // }
    // public Float getNuevoCh() {
    //     return nuevoCh;
    // }
    // public void setNuevoCh(Float nuevoCh) {
    //     this.nuevoCh = nuevoCh;
    // }
    // public Float getNuevaDpracum() {
    //     return nuevaDpracum;
    // }
    // public void setNuevaDpracum(Float nuevaDpracum) {
    //     this.nuevaDpracum = nuevaDpracum;
    // }
    // public Float getDepreAntRv() {
    //     return depreAntRv;
    // }
    // public void setDepreAntRv(Float depreAntRv) {
    //     this.depreAntRv = depreAntRv;
    // }
    // public Float getDepreActRv() {
    //     return depreActRv;
    // }
    // public void setDepreActRv(Float depreActRv) {
    //     this.depreActRv = depreActRv;
    // }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoEmpresa == null) ? 0 : codigoEmpresa.hashCode());
        result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
        result = prime * result + ((origen == null) ? 0 : origen.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        result = prime * result + ((subtipo == null) ? 0 : subtipo.hashCode());
        result = prime * result + ((clase == null) ? 0 : clase.hashCode());
        result = prime * result + ((codLocalidad == null) ? 0 : codLocalidad.hashCode());
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
        Activo other = (Activo) obj;
        if (codigoEmpresa == null) {
            if (other.codigoEmpresa != null)
                return false;
        } else if (!codigoEmpresa.equals(other.codigoEmpresa))
            return false;
        if (localidad == null) {
            if (other.localidad != null)
                return false;
        } else if (!localidad.equals(other.localidad))
            return false;
        if (origen == null) {
            if (other.origen != null)
                return false;
        } else if (!origen.equals(other.origen))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (subtipo == null) {
            if (other.subtipo != null)
                return false;
        } else if (!subtipo.equals(other.subtipo))
            return false;
        if (clase == null) {
            if (other.clase != null)
                return false;
        } else if (!clase.equals(other.clase))
            return false;
        if (codLocalidad == null) {
            if (other.codLocalidad != null)
                return false;
        } else if (!codLocalidad.equals(other.codLocalidad))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Activo [codigo=" + codigo + ", codigoEmpresa=" + codigoEmpresa + ", localidad=" + localidad
                + ", origen=" + origen + ", tipo=" + tipo + ", subtipo=" + subtipo + ", clase=" + clase
                + ", codLocalidad=" + codLocalidad + ", conceptoTransaccion=" + conceptoTransaccion + ", lote=" + lote
                + ", sublote=" + sublote + ", descripcion=" + descripcion + ", observacion=" + observacion
                + ", cantidad=" + cantidad + ", valor=" + valor + ", fechaAdquisicion=" + fechaAdquisicion
                + ", custodio1=" + custodio1 + ", custodio2=" + custodio2 + ", usuario=" + usuario + ", mef=" + mef
                + ", codMef=" + codMef + "]";
    }
   
}
