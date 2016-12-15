package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;
//import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the INMUEBLES database table.
 * 
 */
//@Entity
//@Table(name="INMUEBLES")
//@NamedQuery(name="Inmueble.findAll", query="SELECT i FROM Inmueble i")
public class Inmueble implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private String idinmueble;

	private double ancho;

	private String apellidospropietario;

	private String archivotarifas;

	private double area;

	private double areaconstruida;

	private String barrio;

	private String calificacionoficina;

	private BigDecimal capacidad;

	private String ciudadpropietario;

	private String claseapto;

	private String clavetemporal;

	private String codigoaviso;

	private String comentarioeliminacion;

	private String comentariopublicacion;

	private String comollegar;

	private String compartido;

	private BigDecimal completitud;

	private String conhipoteca;

	private String conmuebles;

	private String conmueblesequipo;

	private String conoficinas;

	private String conoficinascompartidas;

	private String conplano;

	private String contourvirtual;

	private String convideo;

	private String derechosfidu;

	private String descripcionarchivocomollegar;

	private String destacado;

	private String destacadoenhome;

	private String destacadoenlistados;

	private String destacadoenzona;

	private String direccion;

	private String direccionaproximada;

	private String direccionpropietario;

	private String documentosnecesarios;

	private String emailpropietario;

	private String enedicion;

	private String eninterior;

	private String enpublicacion;

	private String esdacionenpago;

	private String esnuevo;

	private String estadopublicacion;

	private String estapublicado;

	private String estrato;

	private String estratows;

	//    @Temporal(TemporalType.DATE)
	private Date fechaactualizacion;

	//    @Temporal(TemporalType.DATE)
	private Date fechaaprobacionfotos;

	//    @Temporal(TemporalType.DATE)
	private Date fechaeliminacion;

	//    @Temporal(TemporalType.DATE)
	private Date fechaexpiracion;

	//    @Temporal(TemporalType.DATE)
	private Date fechaoriginalpublicacion;

	//    @Temporal(TemporalType.DATE)
	private Date fechapublicacion;

	//    @Temporal(TemporalType.DATE)
	private Date fecharegistro;

	//    @Temporal(TemporalType.DATE)
	private Date fecharepublicacion;

	private double fondo;

	private String fueexportado;

	private String fueimportado;

	private String fuepublicado;

	private BigDecimal georefaproximacion;

	private BigDecimal idbarriocomun;

	private BigDecimal idcategoria;

	private BigDecimal idcategoriainmueble;

	private BigDecimal iddestacadohome;

	private BigDecimal iddestacadozona;

	private BigDecimal idmicrosite;

	private BigDecimal idproducto;

	private BigDecimal idpropietario;

	private BigDecimal idsector;

	private BigDecimal idtipoinmueble;

	private BigDecimal idtiponegocio;

	private String inmueblecompartido;

	private double latitud;

	private double longitud;

	private String matricula;

	private BigDecimal membresiaid;

	private String negociarprecio;

	private String nombrecomunbarrio;

	private String nombreedificio;

	private String nombrefinca;

	private String nombrepropietario;

	private String nombrepueblo;

	private String nroapto;

	private String nrobanos;

	private String nrobodega;

	private String nroconsultorio;

	private String nrocuartos;

	private BigDecimal nroestrellas;

	private BigDecimal nrofotos;

	private String nrogarajes;

	private BigDecimal nrogarajesoficina;

	private String nrointerior;

	private String nrolocal;

	private String nrolote;

	private String nrooficina;

	private BigDecimal nroperiodospublicacion;

	private BigDecimal nropiso;

	private String oficinasinteligentes;

	private String otrostelefonospropietario;

	private String planoaprobado;

	private BigDecimal precionoche;

	private String pxdireccion;

	private String razondespublicacion;

	private String restriccioneslote;

	private String searrienda;

	private String sepermuta;

	private String sevende;

	private String solicitudserviciofotos;

	private String solicitudservicioplano;

	private String telefono;

	private String telefonopropietario;

	private BigDecimal themecode;

	private String tiempoarriendo;

	private String tiempoconstruido;

	private String tipobodega;

	private String tipoconsultorio;

	private String tipofinca;

	private String tipogaraje;

	private BigDecimal tipoinmueble;

	private String tipolocal;

	private String tipolote;

	private String tipooficina;

	private String titulo;

	private String touraprobado;

	private String unidadarea;

	private String usolote;

	private double valoradmon;

	private double valorarriendo;

	private double valorhipoteca;

	private double valorventa;

	private BigDecimal vecesvisto;

	private String verificado;

	private String videoaprobado;

	private String vip;

	//bi-directional many-to-one association to Agenteinmobiliario
//	@OneToMany(mappedBy="inmueble")
	private List<Agenteinmobiliario> agenteinmobiliarios;

	//bi-directional many-to-one association to Ciudade
//	@ManyToOne
//	@JoinColumn(name="IDCIUDAD")
	private Ciudade ciudade;

	//bi-directional many-to-one association to Visitor
//	@ManyToOne
//	@JoinColumn(name="VISITORID")
	private Visitor visitor;

	//bi-directional many-to-one association to Videoinmueble
//	@OneToMany(mappedBy="inmueble")
	private List<Videoinmueble> videoinmuebles;

	public Inmueble() {
	}

	public String getIdinmueble() {
		return this.idinmueble;
	}

	public void setIdinmueble(String idinmueble) {
		this.idinmueble = idinmueble;
	}

	public double getAncho() {
		return this.ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public String getApellidospropietario() {
		return this.apellidospropietario;
	}

	public void setApellidospropietario(String apellidospropietario) {
		this.apellidospropietario = apellidospropietario;
	}

	public String getArchivotarifas() {
		return this.archivotarifas;
	}

	public void setArchivotarifas(String archivotarifas) {
		this.archivotarifas = archivotarifas;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getAreaconstruida() {
		return this.areaconstruida;
	}

	public void setAreaconstruida(double areaconstruida) {
		this.areaconstruida = areaconstruida;
	}

	public String getBarrio() {
		return this.barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getCalificacionoficina() {
		return this.calificacionoficina;
	}

	public void setCalificacionoficina(String calificacionoficina) {
		this.calificacionoficina = calificacionoficina;
	}

	public BigDecimal getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(BigDecimal capacidad) {
		this.capacidad = capacidad;
	}

	public String getCiudadpropietario() {
		return this.ciudadpropietario;
	}

	public void setCiudadpropietario(String ciudadpropietario) {
		this.ciudadpropietario = ciudadpropietario;
	}

	public String getClaseapto() {
		return this.claseapto;
	}

	public void setClaseapto(String claseapto) {
		this.claseapto = claseapto;
	}

	public String getClavetemporal() {
		return this.clavetemporal;
	}

	public void setClavetemporal(String clavetemporal) {
		this.clavetemporal = clavetemporal;
	}

	public String getCodigoaviso() {
		return this.codigoaviso;
	}

	public void setCodigoaviso(String codigoaviso) {
		this.codigoaviso = codigoaviso;
	}

	public String getComentarioeliminacion() {
		return this.comentarioeliminacion;
	}

	public void setComentarioeliminacion(String comentarioeliminacion) {
		this.comentarioeliminacion = comentarioeliminacion;
	}

	public String getComentariopublicacion() {
		return this.comentariopublicacion;
	}

	public void setComentariopublicacion(String comentariopublicacion) {
		this.comentariopublicacion = comentariopublicacion;
	}

	public String getComollegar() {
		return this.comollegar;
	}

	public void setComollegar(String comollegar) {
		this.comollegar = comollegar;
	}

	public String getCompartido() {
		return this.compartido;
	}

	public void setCompartido(String compartido) {
		this.compartido = compartido;
	}

	public BigDecimal getCompletitud() {
		return this.completitud;
	}

	public void setCompletitud(BigDecimal completitud) {
		this.completitud = completitud;
	}

	public String getConhipoteca() {
		return this.conhipoteca;
	}

	public void setConhipoteca(String conhipoteca) {
		this.conhipoteca = conhipoteca;
	}

	public String getConmuebles() {
		return this.conmuebles;
	}

	public void setConmuebles(String conmuebles) {
		this.conmuebles = conmuebles;
	}

	public String getConmueblesequipo() {
		return this.conmueblesequipo;
	}

	public void setConmueblesequipo(String conmueblesequipo) {
		this.conmueblesequipo = conmueblesequipo;
	}

	public String getConoficinas() {
		return this.conoficinas;
	}

	public void setConoficinas(String conoficinas) {
		this.conoficinas = conoficinas;
	}

	public String getConoficinascompartidas() {
		return this.conoficinascompartidas;
	}

	public void setConoficinascompartidas(String conoficinascompartidas) {
		this.conoficinascompartidas = conoficinascompartidas;
	}

	public String getConplano() {
		return this.conplano;
	}

	public void setConplano(String conplano) {
		this.conplano = conplano;
	}

	public String getContourvirtual() {
		return this.contourvirtual;
	}

	public void setContourvirtual(String contourvirtual) {
		this.contourvirtual = contourvirtual;
	}

	public String getConvideo() {
		return this.convideo;
	}

	public void setConvideo(String convideo) {
		this.convideo = convideo;
	}

	public String getDerechosfidu() {
		return this.derechosfidu;
	}

	public void setDerechosfidu(String derechosfidu) {
		this.derechosfidu = derechosfidu;
	}

	public String getDescripcionarchivocomollegar() {
		return this.descripcionarchivocomollegar;
	}

	public void setDescripcionarchivocomollegar(String descripcionarchivocomollegar) {
		this.descripcionarchivocomollegar = descripcionarchivocomollegar;
	}

	public String getDestacado() {
		return this.destacado;
	}

	public void setDestacado(String destacado) {
		this.destacado = destacado;
	}

	public String getDestacadoenhome() {
		return this.destacadoenhome;
	}

	public void setDestacadoenhome(String destacadoenhome) {
		this.destacadoenhome = destacadoenhome;
	}

	public String getDestacadoenlistados() {
		return this.destacadoenlistados;
	}

	public void setDestacadoenlistados(String destacadoenlistados) {
		this.destacadoenlistados = destacadoenlistados;
	}

	public String getDestacadoenzona() {
		return this.destacadoenzona;
	}

	public void setDestacadoenzona(String destacadoenzona) {
		this.destacadoenzona = destacadoenzona;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccionaproximada() {
		return this.direccionaproximada;
	}

	public void setDireccionaproximada(String direccionaproximada) {
		this.direccionaproximada = direccionaproximada;
	}

	public String getDireccionpropietario() {
		return this.direccionpropietario;
	}

	public void setDireccionpropietario(String direccionpropietario) {
		this.direccionpropietario = direccionpropietario;
	}

	public String getDocumentosnecesarios() {
		return this.documentosnecesarios;
	}

	public void setDocumentosnecesarios(String documentosnecesarios) {
		this.documentosnecesarios = documentosnecesarios;
	}

	public String getEmailpropietario() {
		return this.emailpropietario;
	}

	public void setEmailpropietario(String emailpropietario) {
		this.emailpropietario = emailpropietario;
	}

	public String getEnedicion() {
		return this.enedicion;
	}

	public void setEnedicion(String enedicion) {
		this.enedicion = enedicion;
	}

	public String getEninterior() {
		return this.eninterior;
	}

	public void setEninterior(String eninterior) {
		this.eninterior = eninterior;
	}

	public String getEnpublicacion() {
		return this.enpublicacion;
	}

	public void setEnpublicacion(String enpublicacion) {
		this.enpublicacion = enpublicacion;
	}

	public String getEsdacionenpago() {
		return this.esdacionenpago;
	}

	public void setEsdacionenpago(String esdacionenpago) {
		this.esdacionenpago = esdacionenpago;
	}

	public String getEsnuevo() {
		return this.esnuevo;
	}

	public void setEsnuevo(String esnuevo) {
		this.esnuevo = esnuevo;
	}

	public String getEstadopublicacion() {
		return this.estadopublicacion;
	}

	public void setEstadopublicacion(String estadopublicacion) {
		this.estadopublicacion = estadopublicacion;
	}

	public String getEstapublicado() {
		return this.estapublicado;
	}

	public void setEstapublicado(String estapublicado) {
		this.estapublicado = estapublicado;
	}

	public String getEstrato() {
		return this.estrato;
	}

	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}

	public String getEstratows() {
		return this.estratows;
	}

	public void setEstratows(String estratows) {
		this.estratows = estratows;
	}

	public Date getFechaactualizacion() {
		return this.fechaactualizacion;
	}

	public void setFechaactualizacion(Date fechaactualizacion) {
		this.fechaactualizacion = fechaactualizacion;
	}

	public Date getFechaaprobacionfotos() {
		return this.fechaaprobacionfotos;
	}

	public void setFechaaprobacionfotos(Date fechaaprobacionfotos) {
		this.fechaaprobacionfotos = fechaaprobacionfotos;
	}

	public Date getFechaeliminacion() {
		return this.fechaeliminacion;
	}

	public void setFechaeliminacion(Date fechaeliminacion) {
		this.fechaeliminacion = fechaeliminacion;
	}

	public Date getFechaexpiracion() {
		return this.fechaexpiracion;
	}

	public void setFechaexpiracion(Date fechaexpiracion) {
		this.fechaexpiracion = fechaexpiracion;
	}

	public Date getFechaoriginalpublicacion() {
		return this.fechaoriginalpublicacion;
	}

	public void setFechaoriginalpublicacion(Date fechaoriginalpublicacion) {
		this.fechaoriginalpublicacion = fechaoriginalpublicacion;
	}

	public Date getFechapublicacion() {
		return this.fechapublicacion;
	}

	public void setFechapublicacion(Date fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}

	public Date getFecharegistro() {
		return this.fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public Date getFecharepublicacion() {
		return this.fecharepublicacion;
	}

	public void setFecharepublicacion(Date fecharepublicacion) {
		this.fecharepublicacion = fecharepublicacion;
	}

	public double getFondo() {
		return this.fondo;
	}

	public void setFondo(double fondo) {
		this.fondo = fondo;
	}

	public String getFueexportado() {
		return this.fueexportado;
	}

	public void setFueexportado(String fueexportado) {
		this.fueexportado = fueexportado;
	}

	public String getFueimportado() {
		return this.fueimportado;
	}

	public void setFueimportado(String fueimportado) {
		this.fueimportado = fueimportado;
	}

	public String getFuepublicado() {
		return this.fuepublicado;
	}

	public void setFuepublicado(String fuepublicado) {
		this.fuepublicado = fuepublicado;
	}

	public BigDecimal getGeorefaproximacion() {
		return this.georefaproximacion;
	}

	public void setGeorefaproximacion(BigDecimal georefaproximacion) {
		this.georefaproximacion = georefaproximacion;
	}

	public BigDecimal getIdbarriocomun() {
		return this.idbarriocomun;
	}

	public void setIdbarriocomun(BigDecimal idbarriocomun) {
		this.idbarriocomun = idbarriocomun;
	}

	public BigDecimal getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(BigDecimal idcategoria) {
		this.idcategoria = idcategoria;
	}

	public BigDecimal getIdcategoriainmueble() {
		return this.idcategoriainmueble;
	}

	public void setIdcategoriainmueble(BigDecimal idcategoriainmueble) {
		this.idcategoriainmueble = idcategoriainmueble;
	}

	public BigDecimal getIddestacadohome() {
		return this.iddestacadohome;
	}

	public void setIddestacadohome(BigDecimal iddestacadohome) {
		this.iddestacadohome = iddestacadohome;
	}

	public BigDecimal getIddestacadozona() {
		return this.iddestacadozona;
	}

	public void setIddestacadozona(BigDecimal iddestacadozona) {
		this.iddestacadozona = iddestacadozona;
	}

	public BigDecimal getIdmicrosite() {
		return this.idmicrosite;
	}

	public void setIdmicrosite(BigDecimal idmicrosite) {
		this.idmicrosite = idmicrosite;
	}

	public BigDecimal getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(BigDecimal idproducto) {
		this.idproducto = idproducto;
	}

	public BigDecimal getIdpropietario() {
		return this.idpropietario;
	}

	public void setIdpropietario(BigDecimal idpropietario) {
		this.idpropietario = idpropietario;
	}

	public BigDecimal getIdsector() {
		return this.idsector;
	}

	public void setIdsector(BigDecimal idsector) {
		this.idsector = idsector;
	}

	public BigDecimal getIdtipoinmueble() {
		return this.idtipoinmueble;
	}

	public void setIdtipoinmueble(BigDecimal idtipoinmueble) {
		this.idtipoinmueble = idtipoinmueble;
	}

	public BigDecimal getIdtiponegocio() {
		return this.idtiponegocio;
	}

	public void setIdtiponegocio(BigDecimal idtiponegocio) {
		this.idtiponegocio = idtiponegocio;
	}

	public String getInmueblecompartido() {
		return this.inmueblecompartido;
	}

	public void setInmueblecompartido(String inmueblecompartido) {
		this.inmueblecompartido = inmueblecompartido;
	}

	public double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public BigDecimal getMembresiaid() {
		return this.membresiaid;
	}

	public void setMembresiaid(BigDecimal membresiaid) {
		this.membresiaid = membresiaid;
	}

	public String getNegociarprecio() {
		return this.negociarprecio;
	}

	public void setNegociarprecio(String negociarprecio) {
		this.negociarprecio = negociarprecio;
	}

	public String getNombrecomunbarrio() {
		return this.nombrecomunbarrio;
	}

	public void setNombrecomunbarrio(String nombrecomunbarrio) {
		this.nombrecomunbarrio = nombrecomunbarrio;
	}

	public String getNombreedificio() {
		return this.nombreedificio;
	}

	public void setNombreedificio(String nombreedificio) {
		this.nombreedificio = nombreedificio;
	}

	public String getNombrefinca() {
		return this.nombrefinca;
	}

	public void setNombrefinca(String nombrefinca) {
		this.nombrefinca = nombrefinca;
	}

	public String getNombrepropietario() {
		return this.nombrepropietario;
	}

	public void setNombrepropietario(String nombrepropietario) {
		this.nombrepropietario = nombrepropietario;
	}

	public String getNombrepueblo() {
		return this.nombrepueblo;
	}

	public void setNombrepueblo(String nombrepueblo) {
		this.nombrepueblo = nombrepueblo;
	}

	public String getNroapto() {
		return this.nroapto;
	}

	public void setNroapto(String nroapto) {
		this.nroapto = nroapto;
	}

	public String getNrobanos() {
		return this.nrobanos;
	}

	public void setNrobanos(String nrobanos) {
		this.nrobanos = nrobanos;
	}

	public String getNrobodega() {
		return this.nrobodega;
	}

	public void setNrobodega(String nrobodega) {
		this.nrobodega = nrobodega;
	}

	public String getNroconsultorio() {
		return this.nroconsultorio;
	}

	public void setNroconsultorio(String nroconsultorio) {
		this.nroconsultorio = nroconsultorio;
	}

	public String getNrocuartos() {
		return this.nrocuartos;
	}

	public void setNrocuartos(String nrocuartos) {
		this.nrocuartos = nrocuartos;
	}

	public BigDecimal getNroestrellas() {
		return this.nroestrellas;
	}

	public void setNroestrellas(BigDecimal nroestrellas) {
		this.nroestrellas = nroestrellas;
	}

	public BigDecimal getNrofotos() {
		return this.nrofotos;
	}

	public void setNrofotos(BigDecimal nrofotos) {
		this.nrofotos = nrofotos;
	}

	public String getNrogarajes() {
		return this.nrogarajes;
	}

	public void setNrogarajes(String nrogarajes) {
		this.nrogarajes = nrogarajes;
	}

	public BigDecimal getNrogarajesoficina() {
		return this.nrogarajesoficina;
	}

	public void setNrogarajesoficina(BigDecimal nrogarajesoficina) {
		this.nrogarajesoficina = nrogarajesoficina;
	}

	public String getNrointerior() {
		return this.nrointerior;
	}

	public void setNrointerior(String nrointerior) {
		this.nrointerior = nrointerior;
	}

	public String getNrolocal() {
		return this.nrolocal;
	}

	public void setNrolocal(String nrolocal) {
		this.nrolocal = nrolocal;
	}

	public String getNrolote() {
		return this.nrolote;
	}

	public void setNrolote(String nrolote) {
		this.nrolote = nrolote;
	}

	public String getNrooficina() {
		return this.nrooficina;
	}

	public void setNrooficina(String nrooficina) {
		this.nrooficina = nrooficina;
	}

	public BigDecimal getNroperiodospublicacion() {
		return this.nroperiodospublicacion;
	}

	public void setNroperiodospublicacion(BigDecimal nroperiodospublicacion) {
		this.nroperiodospublicacion = nroperiodospublicacion;
	}

	public BigDecimal getNropiso() {
		return this.nropiso;
	}

	public void setNropiso(BigDecimal nropiso) {
		this.nropiso = nropiso;
	}

	public String getOficinasinteligentes() {
		return this.oficinasinteligentes;
	}

	public void setOficinasinteligentes(String oficinasinteligentes) {
		this.oficinasinteligentes = oficinasinteligentes;
	}

	public String getOtrostelefonospropietario() {
		return this.otrostelefonospropietario;
	}

	public void setOtrostelefonospropietario(String otrostelefonospropietario) {
		this.otrostelefonospropietario = otrostelefonospropietario;
	}

	public String getPlanoaprobado() {
		return this.planoaprobado;
	}

	public void setPlanoaprobado(String planoaprobado) {
		this.planoaprobado = planoaprobado;
	}

	public BigDecimal getPrecionoche() {
		return this.precionoche;
	}

	public void setPrecionoche(BigDecimal precionoche) {
		this.precionoche = precionoche;
	}

	public String getPxdireccion() {
		return this.pxdireccion;
	}

	public void setPxdireccion(String pxdireccion) {
		this.pxdireccion = pxdireccion;
	}

	public String getRazondespublicacion() {
		return this.razondespublicacion;
	}

	public void setRazondespublicacion(String razondespublicacion) {
		this.razondespublicacion = razondespublicacion;
	}

	public String getRestriccioneslote() {
		return this.restriccioneslote;
	}

	public void setRestriccioneslote(String restriccioneslote) {
		this.restriccioneslote = restriccioneslote;
	}

	public String getSearrienda() {
		return this.searrienda;
	}

	public void setSearrienda(String searrienda) {
		this.searrienda = searrienda;
	}

	public String getSepermuta() {
		return this.sepermuta;
	}

	public void setSepermuta(String sepermuta) {
		this.sepermuta = sepermuta;
	}

	public String getSevende() {
		return this.sevende;
	}

	public void setSevende(String sevende) {
		this.sevende = sevende;
	}

	public String getSolicitudserviciofotos() {
		return this.solicitudserviciofotos;
	}

	public void setSolicitudserviciofotos(String solicitudserviciofotos) {
		this.solicitudserviciofotos = solicitudserviciofotos;
	}

	public String getSolicitudservicioplano() {
		return this.solicitudservicioplano;
	}

	public void setSolicitudservicioplano(String solicitudservicioplano) {
		this.solicitudservicioplano = solicitudservicioplano;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefonopropietario() {
		return this.telefonopropietario;
	}

	public void setTelefonopropietario(String telefonopropietario) {
		this.telefonopropietario = telefonopropietario;
	}

	public BigDecimal getThemecode() {
		return this.themecode;
	}

	public void setThemecode(BigDecimal themecode) {
		this.themecode = themecode;
	}

	public String getTiempoarriendo() {
		return this.tiempoarriendo;
	}

	public void setTiempoarriendo(String tiempoarriendo) {
		this.tiempoarriendo = tiempoarriendo;
	}

	public String getTiempoconstruido() {
		return this.tiempoconstruido;
	}

	public void setTiempoconstruido(String tiempoconstruido) {
		this.tiempoconstruido = tiempoconstruido;
	}

	public String getTipobodega() {
		return this.tipobodega;
	}

	public void setTipobodega(String tipobodega) {
		this.tipobodega = tipobodega;
	}

	public String getTipoconsultorio() {
		return this.tipoconsultorio;
	}

	public void setTipoconsultorio(String tipoconsultorio) {
		this.tipoconsultorio = tipoconsultorio;
	}

	public String getTipofinca() {
		return this.tipofinca;
	}

	public void setTipofinca(String tipofinca) {
		this.tipofinca = tipofinca;
	}

	public String getTipogaraje() {
		return this.tipogaraje;
	}

	public void setTipogaraje(String tipogaraje) {
		this.tipogaraje = tipogaraje;
	}

	public BigDecimal getTipoinmueble() {
		return this.tipoinmueble;
	}

	public void setTipoinmueble(BigDecimal tipoinmueble) {
		this.tipoinmueble = tipoinmueble;
	}

	public String getTipolocal() {
		return this.tipolocal;
	}

	public void setTipolocal(String tipolocal) {
		this.tipolocal = tipolocal;
	}

	public String getTipolote() {
		return this.tipolote;
	}

	public void setTipolote(String tipolote) {
		this.tipolote = tipolote;
	}

	public String getTipooficina() {
		return this.tipooficina;
	}

	public void setTipooficina(String tipooficina) {
		this.tipooficina = tipooficina;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTouraprobado() {
		return this.touraprobado;
	}

	public void setTouraprobado(String touraprobado) {
		this.touraprobado = touraprobado;
	}

	public String getUnidadarea() {
		return this.unidadarea;
	}

	public void setUnidadarea(String unidadarea) {
		this.unidadarea = unidadarea;
	}

	public String getUsolote() {
		return this.usolote;
	}

	public void setUsolote(String usolote) {
		this.usolote = usolote;
	}

	public double getValoradmon() {
		return this.valoradmon;
	}

	public void setValoradmon(double valoradmon) {
		this.valoradmon = valoradmon;
	}

	public double getValorarriendo() {
		return this.valorarriendo;
	}

	public void setValorarriendo(double valorarriendo) {
		this.valorarriendo = valorarriendo;
	}

	public double getValorhipoteca() {
		return this.valorhipoteca;
	}

	public void setValorhipoteca(double valorhipoteca) {
		this.valorhipoteca = valorhipoteca;
	}

	public double getValorventa() {
		return this.valorventa;
	}

	public void setValorventa(double valorventa) {
		this.valorventa = valorventa;
	}

	public BigDecimal getVecesvisto() {
		return this.vecesvisto;
	}

	public void setVecesvisto(BigDecimal vecesvisto) {
		this.vecesvisto = vecesvisto;
	}

	public String getVerificado() {
		return this.verificado;
	}

	public void setVerificado(String verificado) {
		this.verificado = verificado;
	}

	public String getVideoaprobado() {
		return this.videoaprobado;
	}

	public void setVideoaprobado(String videoaprobado) {
		this.videoaprobado = videoaprobado;
	}

	public String getVip() {
		return this.vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	public List<Agenteinmobiliario> getAgenteinmobiliarios() {
		return this.agenteinmobiliarios;
	}

	public void setAgenteinmobiliarios(List<Agenteinmobiliario> agenteinmobiliarios) {
		this.agenteinmobiliarios = agenteinmobiliarios;
	}

	public Agenteinmobiliario addAgenteinmobiliario(Agenteinmobiliario agenteinmobiliario) {
		getAgenteinmobiliarios().add(agenteinmobiliario);
		agenteinmobiliario.setInmueble(this);

		return agenteinmobiliario;
	}

	public Agenteinmobiliario removeAgenteinmobiliario(Agenteinmobiliario agenteinmobiliario) {
		getAgenteinmobiliarios().remove(agenteinmobiliario);
		agenteinmobiliario.setInmueble(null);

		return agenteinmobiliario;
	}

	public Ciudade getCiudade() {
		return this.ciudade;
	}

	public void setCiudade(Ciudade ciudade) {
		this.ciudade = ciudade;
	}

	public Visitor getVisitor() {
		return this.visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	public List<Videoinmueble> getVideoinmuebles() {
		return this.videoinmuebles;
	}

	public void setVideoinmuebles(List<Videoinmueble> videoinmuebles) {
		this.videoinmuebles = videoinmuebles;
	}

	public Videoinmueble addVideoinmueble(Videoinmueble videoinmueble) {
		getVideoinmuebles().add(videoinmueble);
		videoinmueble.setInmueble(this);

		return videoinmueble;
	}

	public Videoinmueble removeVideoinmueble(Videoinmueble videoinmueble) {
		getVideoinmuebles().remove(videoinmueble);
		videoinmueble.setInmueble(null);

		return videoinmueble;
	}

}