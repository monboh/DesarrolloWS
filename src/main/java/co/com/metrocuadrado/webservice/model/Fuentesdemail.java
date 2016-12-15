package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;
//import javax.persistence.*;


/**
 * The persistent class for the FUENTESDEMAIL database table.
 * 
 */
//@Entity
//@NamedQuery(name="Fuentesdemail.findAll", query="SELECT f FROM Fuentesdemail f")
public class Fuentesdemail implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private long idfuente;

	private String descripcion;

	public Fuentesdemail() {
	}

	public long getIdfuente() {
		return this.idfuente;
	}

	public void setIdfuente(long idfuente) {
		this.idfuente = idfuente;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}