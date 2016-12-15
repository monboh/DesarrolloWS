package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;
//import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VIDEOINMUEBLE database table.
 * 
 */
//@Entity
//@NamedQuery(name="Videoinmueble.findAll", query="SELECT v FROM Videoinmueble v")
public class Videoinmueble implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private long idvideo;

	private String comentario;

	private BigDecimal orden;

	private String tipo;

	private String url;

	//bi-directional many-to-one association to Inmueble
//	@ManyToOne
//	@JoinColumn(name="IDINMUEBLE")
	private Inmueble inmueble;

	public Videoinmueble() {
	}

	public long getIdvideo() {
		return this.idvideo;
	}

	public void setIdvideo(long idvideo) {
		this.idvideo = idvideo;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public BigDecimal getOrden() {
		return this.orden;
	}

	public void setOrden(BigDecimal orden) {
		this.orden = orden;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Inmueble getInmueble() {
		return this.inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

}