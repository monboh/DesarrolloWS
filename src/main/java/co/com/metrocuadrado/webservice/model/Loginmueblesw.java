package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;
//import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the LOGINMUEBLESWS database table.
 * 
 */
//@Entity
//@Table(name="LOGINMUEBLESWS")
//@NamedQuery(name="Loginmueblesw.findAll", query="SELECT l FROM Loginmueblesw l")
public class Loginmueblesw implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private long idlog;

	private String accionpublicacion;

	private String caracteristicas;

	private String estado;

	//    @Temporal(TemporalType.DATE)
	private Date fechaactualizacion;

	private String idinmueble;

	private BigDecimal idtipoinmueble;

	private String mensaje;

	private String searrienda;

	private String sevende;

	private BigDecimal visitorid;

	//bi-directional many-to-one association to Ciudade
//	@ManyToOne
//	@JoinColumn(name="IDCIUDAD")
	private Ciudade ciudade;

	public Loginmueblesw() {
	}

	public long getIdlog() {
		return this.idlog;
	}

	public void setIdlog(long idlog) {
		this.idlog = idlog;
	}

	public String getAccionpublicacion() {
		return this.accionpublicacion;
	}

	public void setAccionpublicacion(String accionpublicacion) {
		this.accionpublicacion = accionpublicacion;
	}

	public String getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaactualizacion() {
		return this.fechaactualizacion;
	}

	public void setFechaactualizacion(Date fechaactualizacion) {
		this.fechaactualizacion = fechaactualizacion;
	}

	public String getIdinmueble() {
		return this.idinmueble;
	}

	public void setIdinmueble(String idinmueble) {
		this.idinmueble = idinmueble;
	}

	public BigDecimal getIdtipoinmueble() {
		return this.idtipoinmueble;
	}

	public void setIdtipoinmueble(BigDecimal idtipoinmueble) {
		this.idtipoinmueble = idtipoinmueble;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getSearrienda() {
		return this.searrienda;
	}

	public void setSearrienda(String searrienda) {
		this.searrienda = searrienda;
	}

	public String getSevende() {
		return this.sevende;
	}

	public void setSevende(String sevende) {
		this.sevende = sevende;
	}

	public BigDecimal getVisitorid() {
		return this.visitorid;
	}

	public void setVisitorid(BigDecimal visitorid) {
		this.visitorid = visitorid;
	}

	public Ciudade getCiudade() {
		return this.ciudade;
	}

	public void setCiudade(Ciudade ciudade) {
		this.ciudade = ciudade;
	}

}