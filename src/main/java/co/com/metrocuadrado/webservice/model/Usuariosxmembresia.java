package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;
//import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the USUARIOSXMEMBRESIA database table.
 * 
 */
//@Entity
//@NamedQuery(name="Usuariosxmembresia.findAll", query="SELECT u FROM Usuariosxmembresia u")
public class Usuariosxmembresia implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private long visitorid;

	private java.math.BigDecimal idmembresia;

	//    @Temporal(TemporalType.DATE)
	private Date vigentedesde;

	//    @Temporal(TemporalType.DATE)
	private Date vigentehasta;

	//bi-directional many-to-one association to Visitor
//	@ManyToOne
//	@JoinColumn(name="EJECUTIVO")
	private Visitor visitor1;

	//bi-directional one-to-one association to Visitor
//	@OneToOne
//	@JoinColumn(name="VISITORID")
	private Visitor visitor2;

	public Usuariosxmembresia() {
	}

	public long getVisitorid() {
		return this.visitorid;
	}

	public void setVisitorid(long visitorid) {
		this.visitorid = visitorid;
	}

	public java.math.BigDecimal getIdmembresia() {
		return this.idmembresia;
	}

	public void setIdmembresia(java.math.BigDecimal idmembresia) {
		this.idmembresia = idmembresia;
	}

	public Date getVigentedesde() {
		return this.vigentedesde;
	}

	public void setVigentedesde(Date vigentedesde) {
		this.vigentedesde = vigentedesde;
	}

	public Date getVigentehasta() {
		return this.vigentehasta;
	}

	public void setVigentehasta(Date vigentehasta) {
		this.vigentehasta = vigentehasta;
	}

	public Visitor getVisitor1() {
		return this.visitor1;
	}

	public void setVisitor1(Visitor visitor1) {
		this.visitor1 = visitor1;
	}

	public Visitor getVisitor2() {
		return this.visitor2;
	}

	public void setVisitor2(Visitor visitor2) {
		this.visitor2 = visitor2;
	}

}