package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;
//import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CIUDADES database table.
 * 
 */
//@Entity
//@Table(name="CIUDADES")
//@NamedQuery(name="Ciudade.findAll", query="SELECT c FROM Ciudade c")
public class Ciudade implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private long idciudad;

	private String codigo;

	private String codigoswf;

	private String color;

	private String escapital;

	private String esenlasafueras;

	private String esgeorrferenciada;

	private String estaactiva;

	private String htmlmapa;

	private BigDecimal idpais;

	private String nombre;

	private BigDecimal totalarriendo;

	private BigDecimal totalinmuebles;

	private BigDecimal totalnuevos;

	private BigDecimal totalventa;

	//bi-directional many-to-one association to Regione
//	@ManyToOne
//	@JoinColumn(name="IDREGION")
	private Regione regione;

	//bi-directional many-to-one association to Inmueble
//	@OneToMany(mappedBy="ciudade")
	private List<Inmueble> inmuebles;

	//bi-directional many-to-one association to Loginmueblesw
//	@OneToMany(mappedBy="ciudade")
	private List<Loginmueblesw> loginmueblesws;

	public Ciudade() {
	}

	public long getIdciudad() {
		return this.idciudad;
	}

	public void setIdciudad(long idciudad) {
		this.idciudad = idciudad;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoswf() {
		return this.codigoswf;
	}

	public void setCodigoswf(String codigoswf) {
		this.codigoswf = codigoswf;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEscapital() {
		return this.escapital;
	}

	public void setEscapital(String escapital) {
		this.escapital = escapital;
	}

	public String getEsenlasafueras() {
		return this.esenlasafueras;
	}

	public void setEsenlasafueras(String esenlasafueras) {
		this.esenlasafueras = esenlasafueras;
	}

	public String getEsgeorrferenciada() {
		return this.esgeorrferenciada;
	}

	public void setEsgeorrferenciada(String esgeorrferenciada) {
		this.esgeorrferenciada = esgeorrferenciada;
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

	public Regione getRegione() {
		return this.regione;
	}

	public void setRegione(Regione regione) {
		this.regione = regione;
	}

	public List<Inmueble> getInmuebles() {
		return this.inmuebles;
	}

	public void setInmuebles(List<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}

	public Inmueble addInmueble(Inmueble inmueble) {
		getInmuebles().add(inmueble);
		inmueble.setCiudade(this);

		return inmueble;
	}

	public Inmueble removeInmueble(Inmueble inmueble) {
		getInmuebles().remove(inmueble);
		inmueble.setCiudade(null);

		return inmueble;
	}

	public List<Loginmueblesw> getLoginmueblesws() {
		return this.loginmueblesws;
	}

	public void setLoginmueblesws(List<Loginmueblesw> loginmueblesws) {
		this.loginmueblesws = loginmueblesws;
	}

	public Loginmueblesw addLoginmueblesw(Loginmueblesw loginmueblesw) {
		getLoginmueblesws().add(loginmueblesw);
		loginmueblesw.setCiudade(this);

		return loginmueblesw;
	}

	public Loginmueblesw removeLoginmueblesw(Loginmueblesw loginmueblesw) {
		getLoginmueblesws().remove(loginmueblesw);
		loginmueblesw.setCiudade(null);

		return loginmueblesw;
	}

}