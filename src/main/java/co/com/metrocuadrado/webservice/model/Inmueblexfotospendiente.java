package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;
//import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the INMUEBLEXFOTOSPENDIENTE database table.
 * 
 */
//@Entity
//@NamedQuery(name="Inmueblexfotospendiente.findAll", query="SELECT i FROM Inmueblexfotospendiente i")
public class Inmueblexfotospendiente implements Serializable {
	private static final long serialVersionUID = 1L;

	private String comentario;

	//    @Temporal(TemporalType.DATE)
	//    @Column(name="FECHA_PUBLICACION")
	private Date fechaPublicacion;

	//    @Temporal(TemporalType.DATE)
	//    @Column(name="FECHA_REGISTRO")
	private Date fechaRegistro;

	//    @Temporal(TemporalType.DATE)
	//    @Column(name="FECHA_TRAER_M2")
	private Date fechaTraerM2;

	//    @Column(name="ID_ESTADO_FOTO")
	private BigDecimal idEstadoFoto;

	private BigDecimal idfoto;

	private String idinmueble;

	//    @Column(name="NRO_FOTO")
	private BigDecimal nroFoto;

	//    @Column(name="URL_FOTO")
	private String urlFoto;

	public Inmueblexfotospendiente() {
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getFechaPublicacion() {
		return this.fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaTraerM2() {
		return this.fechaTraerM2;
	}

	public void setFechaTraerM2(Date fechaTraerM2) {
		this.fechaTraerM2 = fechaTraerM2;
	}

	public BigDecimal getIdEstadoFoto() {
		return this.idEstadoFoto;
	}

	public void setIdEstadoFoto(BigDecimal idEstadoFoto) {
		this.idEstadoFoto = idEstadoFoto;
	}

	public BigDecimal getIdfoto() {
		return this.idfoto;
	}

	public void setIdfoto(BigDecimal idfoto) {
		this.idfoto = idfoto;
	}

	public String getIdinmueble() {
		return this.idinmueble;
	}

	public void setIdinmueble(String idinmueble) {
		this.idinmueble = idinmueble;
	}

	public BigDecimal getNroFoto() {
		return this.nroFoto;
	}

	public void setNroFoto(BigDecimal nroFoto) {
		this.nroFoto = nroFoto;
	}

	public String getUrlFoto() {
		return this.urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

}