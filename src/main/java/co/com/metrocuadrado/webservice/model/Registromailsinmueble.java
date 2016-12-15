package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;
//import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the REGISTROMAILSINMUEBLES database table.
 * 
 */
//@Entity
//@Table(name="REGISTROMAILSINMUEBLES")
//@NamedQuery(name="Registromailsinmueble.findAll", query="SELECT r FROM Registromailsinmueble r")
public class Registromailsinmueble implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private long idregistro;

	private String asunto;

	private String cita;

	private String ciudad;

	private String codigoactivacion;

	private String comentario;

	private String contactadoviatelefonica;

	private String datosinvalidos;

	private String email;

	private String estadocodigoactivacion;

	private Timestamp fechaactualizacion;

	//    @Temporal(TemporalType.DATE)
	private Date fechaeliminacion;

	//    @Temporal(TemporalType.DATE)
	private Date fechallegada;

	//    @Temporal(TemporalType.DATE)
	private Date fecharegistro;

	//    @Temporal(TemporalType.DATE)
	private Date fecharespuesta;

	//    @Temporal(TemporalType.DATE)
	private Date fechasalida;

	private String fotos;

	private BigDecimal idfuente;

	private String idinmueble;

	private String informacion;

	private String leido;

	private String mailenviado;

	private String negociarpreciocontacto;

	private String nombre;

	private String notas;

//	@Column(name="PUNTO_CONTACTO_ID")
	private BigDecimal puntoContactoId;

	private String respondido;

	private String telefono;

	private BigDecimal visitorid;

	public Registromailsinmueble() {
	}

	public long getIdregistro() {
		return this.idregistro;
	}

	public void setIdregistro(long idregistro) {
		this.idregistro = idregistro;
	}

	public String getAsunto() {
		return this.asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getCita() {
		return this.cita;
	}

	public void setCita(String cita) {
		this.cita = cita;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigoactivacion() {
		return this.codigoactivacion;
	}

	public void setCodigoactivacion(String codigoactivacion) {
		this.codigoactivacion = codigoactivacion;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getContactadoviatelefonica() {
		return this.contactadoviatelefonica;
	}

	public void setContactadoviatelefonica(String contactadoviatelefonica) {
		this.contactadoviatelefonica = contactadoviatelefonica;
	}

	public String getDatosinvalidos() {
		return this.datosinvalidos;
	}

	public void setDatosinvalidos(String datosinvalidos) {
		this.datosinvalidos = datosinvalidos;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstadocodigoactivacion() {
		return this.estadocodigoactivacion;
	}

	public void setEstadocodigoactivacion(String estadocodigoactivacion) {
		this.estadocodigoactivacion = estadocodigoactivacion;
	}

	public Timestamp getFechaactualizacion() {
		return this.fechaactualizacion;
	}

	public void setFechaactualizacion(Timestamp fechaactualizacion) {
		this.fechaactualizacion = fechaactualizacion;
	}

	public Date getFechaeliminacion() {
		return this.fechaeliminacion;
	}

	public void setFechaeliminacion(Date fechaeliminacion) {
		this.fechaeliminacion = fechaeliminacion;
	}

	public Date getFechallegada() {
		return this.fechallegada;
	}

	public void setFechallegada(Date fechallegada) {
		this.fechallegada = fechallegada;
	}

	public Date getFecharegistro() {
		return this.fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public Date getFecharespuesta() {
		return this.fecharespuesta;
	}

	public void setFecharespuesta(Date fecharespuesta) {
		this.fecharespuesta = fecharespuesta;
	}

	public Date getFechasalida() {
		return this.fechasalida;
	}

	public void setFechasalida(Date fechasalida) {
		this.fechasalida = fechasalida;
	}

	public String getFotos() {
		return this.fotos;
	}

	public void setFotos(String fotos) {
		this.fotos = fotos;
	}

	public BigDecimal getIdfuente() {
		return this.idfuente;
	}

	public void setIdfuente(BigDecimal idfuente) {
		this.idfuente = idfuente;
	}

	public String getIdinmueble() {
		return this.idinmueble;
	}

	public void setIdinmueble(String idinmueble) {
		this.idinmueble = idinmueble;
	}

	public String getInformacion() {
		return this.informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	public String getLeido() {
		return this.leido;
	}

	public void setLeido(String leido) {
		this.leido = leido;
	}

	public String getMailenviado() {
		return this.mailenviado;
	}

	public void setMailenviado(String mailenviado) {
		this.mailenviado = mailenviado;
	}

	public String getNegociarpreciocontacto() {
		return this.negociarpreciocontacto;
	}

	public void setNegociarpreciocontacto(String negociarpreciocontacto) {
		this.negociarpreciocontacto = negociarpreciocontacto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNotas() {
		return this.notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public BigDecimal getPuntoContactoId() {
		return this.puntoContactoId;
	}

	public void setPuntoContactoId(BigDecimal puntoContactoId) {
		this.puntoContactoId = puntoContactoId;
	}

	public String getRespondido() {
		return this.respondido;
	}

	public void setRespondido(String respondido) {
		this.respondido = respondido;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public BigDecimal getVisitorid() {
		return this.visitorid;
	}

	public void setVisitorid(BigDecimal visitorid) {
		this.visitorid = visitorid;
	}

}