package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;
//import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the AGENTEINMOBILIARIO database table.
 * 
 */
//@Entity
//@NamedQuery(name="Agenteinmobiliario.findAll", query="SELECT a FROM Agenteinmobiliario a")
public class Agenteinmobiliario implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
//	//	@Column(name="ID_AGENTE")
	private long idAgente;

//	@Temporal(TemporalType.DATE)
//	//	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;

//	@Column(name="NOMBRE_AGENTE")
	private String nombreAgente;

//	@Column(name="TELEFONO_AGENTE")
	private BigDecimal telefonoAgente;

	//bi-directional many-to-one association to Inmueble
//	@ManyToOne
//	@JoinColumn(name="ID_INMUEBLE")
	private Inmueble inmueble;

	public Agenteinmobiliario() {
	}

	public long getIdAgente() {
		return this.idAgente;
	}

	public void setIdAgente(long idAgente) {
		this.idAgente = idAgente;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getNombreAgente() {
		return this.nombreAgente;
	}

	public void setNombreAgente(String nombreAgente) {
		this.nombreAgente = nombreAgente;
	}

	public BigDecimal getTelefonoAgente() {
		return this.telefonoAgente;
	}

	public void setTelefonoAgente(BigDecimal telefonoAgente) {
		this.telefonoAgente = telefonoAgente;
	}

	public Inmueble getInmueble() {
		return this.inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

}