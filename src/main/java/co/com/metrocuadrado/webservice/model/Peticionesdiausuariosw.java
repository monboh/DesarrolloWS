package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;
//import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PETICIONESDIAUSUARIOSWS database table.
 * 
 */
//@Entity
//@Table(name="PETICIONESDIAUSUARIOSWS")
//@NamedQuery(name="Peticionesdiausuariosw.findAll", query="SELECT p FROM Peticionesdiausuariosw p")
public class Peticionesdiausuariosw implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private long visitorid;

	//    @Temporal(TemporalType.DATE)
	private Date fecha;

	private BigDecimal nropeticiones;

	//bi-directional one-to-one association to Visitor
//	@OneToOne
//	@JoinColumn(name="VISITORID")
	private Visitor visitor;

	public Peticionesdiausuariosw() {
	}

	public long getVisitorid() {
		return this.visitorid;
	}

	public void setVisitorid(long visitorid) {
		this.visitorid = visitorid;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getNropeticiones() {
		return this.nropeticiones;
	}

	public void setNropeticiones(BigDecimal nropeticiones) {
		this.nropeticiones = nropeticiones;
	}

	public Visitor getVisitor() {
		return this.visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

}