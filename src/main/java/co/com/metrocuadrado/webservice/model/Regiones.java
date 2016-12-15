package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;
//import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the REGIONES database table.
 * 
 */
//@Entity
//@Table(name="REGIONES")
//@NamedQuery(name="Regione.findAll", query="SELECT r FROM Regione r")
public class Regiones implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private long idregion;

	private String codigo;

	private String color;

	private String estaactiva;

	private String htmlmapa;

	private BigDecimal idpais;

	private String nombre;

	private BigDecimal totalarriendo;

	private BigDecimal totalinmuebles;

	private BigDecimal totalnuevos;

	private BigDecimal totalventa;

	//bi-directional many-to-one association to Ciudade
//	@OneToMany(mappedBy="regione")
	private List<Ciudade> ciudades;

	public Regione() {
	}

	public long getIdregion() {
		return this.idregion;
	}

	public void setIdregion(long idregion) {
		this.idregion = idregion;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEstaactiva() {
		return this.estaactiva;
	}

	public void setEstaactiva(String estaactiva) {
		this.estaactiva = estaactiva;
	}

	public String getHtmlmapa() {
		return this.htmlmapa;
	}

	public void setHtmlmapa(String htmlmapa) {
		this.htmlmapa = htmlmapa;
	}

	public BigDecimal getIdpais() {
		return this.idpais;
	}

	public void setIdpais(BigDecimal idpais) {
		this.idpais = idpais;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getTotalarriendo() {
		return this.totalarriendo;
	}

	public void setTotalarriendo(BigDecimal totalarriendo) {
		this.totalarriendo = totalarriendo;
	}

	public BigDecimal getTotalinmuebles() {
		return this.totalinmuebles;
	}

	public void setTotalinmuebles(BigDecimal totalinmuebles) {
		this.totalinmuebles = totalinmuebles;
	}

	public BigDecimal getTotalnuevos() {
		return this.totalnuevos;
	}

	public void setTotalnuevos(BigDecimal totalnuevos) {
		this.totalnuevos = totalnuevos;
	}

	public BigDecimal getTotalventa() {
		return this.totalventa;
	}

	public void setTotalventa(BigDecimal totalventa) {
		this.totalventa = totalventa;
	}

	public List<Ciudade> getCiudades() {
		return this.ciudades;
	}

	public void setCiudades(List<Ciudade> ciudades) {
		this.ciudades = ciudades;
	}

	public Ciudade addCiudade(Ciudade ciudade) {
		getCiudades().add(ciudade);
		ciudade.setRegione(this);

		return ciudade;
	}

	public Ciudade removeCiudade(Ciudade ciudade) {
		getCiudades().remove(ciudade);
		ciudade.setRegione(null);

		return ciudade;
	}

}