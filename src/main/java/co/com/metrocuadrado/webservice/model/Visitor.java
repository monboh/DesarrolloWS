package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;
//import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the VISITOR database table.
 * 
 */
//@Entity
//@NamedQuery(name="Visitor.findAll", query="SELECT v FROM Visitor v")
public class Visitor implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
	private long visitorid;

	private String address1;

	private String address2;

	private String afiliadolibertador;

	private String aprobado;

	private String cedula;

	private String cell;

	private String cell2;

	private String city;

	private String company;

//	@Column(name="COMPANY_NAME")
	private String companyName;

	private String concorreogratis;

	private String country;

	//    @Temporal(TemporalType.DATE)
	private Date created;

	private Timestamp creation;

	//    @Temporal(TemporalType.DATE)
	private Date dateofbirth;

	private String direccionvisible;

	private String email;

	private String escomercial;

	private String esinmobiliaria;

	private String extension1;

	private String extension2;

	private String fax;

//	@Column(name="FIRST_NAME")
	private String firstName;

	private String homephone;

	private String id;

	private String idlocation;

	private java.math.BigDecimal idniveleducativo;

	private String idtype;

	private String indicativocity;

//	@Column(name="LAST_NAME")
	private String lastName;

	private Timestamp lastlogin;

	private String loginid;

	//    @Temporal(TemporalType.DATE)
	private Date modified;

//	@Lob
	private byte[] objectdata;

	private String password;

	private java.math.BigDecimal profesionid;

	//    @Temporal(TemporalType.DATE)
	private Date pwdexpiration;

	private String pwdreminderanswer;

	private String pwdreminderquestion;

	private String sex;

	private String status;

	private String tipousuario;

//	@Column(name="VISITOR_TYPE")
	private String visitorType;

	private String workphone;

	//bi-directional many-to-one association to Inmueble
	//    @OneToMany(mappedBy="visitor")
	private List<Inmueble> inmuebles;

	//bi-directional one-to-one association to Peticionesdiausuariosw
	//    @OneToOne(mappedBy="visitor")
	private Peticionesdiausuariosw peticionesdiausuariosw;

	//bi-directional many-to-one association to Usuariosxmembresia
	//    @OneToMany(mappedBy="visitor1")
	private List<Usuariosxmembresia> usuariosxmembresias;

	//bi-directional one-to-one association to Usuariosxmembresia
	//    @OneToOne(mappedBy="visitor2")
	private Usuariosxmembresia usuariosxmembresia;

	public Visitor() {
	}

	public long getVisitorid() {
		return this.visitorid;
	}

	public void setVisitorid(long visitorid) {
		this.visitorid = visitorid;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAfiliadolibertador() {
		return this.afiliadolibertador;
	}

	public void setAfiliadolibertador(String afiliadolibertador) {
		this.afiliadolibertador = afiliadolibertador;
	}

	public String getAprobado() {
		return this.aprobado;
	}

	public void setAprobado(String aprobado) {
		this.aprobado = aprobado;
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCell() {
		return this.cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getCell2() {
		return this.cell2;
	}

	public void setCell2(String cell2) {
		this.cell2 = cell2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getConcorreogratis() {
		return this.concorreogratis;
	}

	public void setConcorreogratis(String concorreogratis) {
		this.concorreogratis = concorreogratis;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Timestamp getCreation() {
		return this.creation;
	}

	public void setCreation(Timestamp creation) {
		this.creation = creation;
	}

	public Date getDateofbirth() {
		return this.dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getDireccionvisible() {
		return this.direccionvisible;
	}

	public void setDireccionvisible(String direccionvisible) {
		this.direccionvisible = direccionvisible;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEscomercial() {
		return this.escomercial;
	}

	public void setEscomercial(String escomercial) {
		this.escomercial = escomercial;
	}

	public String getEsinmobiliaria() {
		return this.esinmobiliaria;
	}

	public void setEsinmobiliaria(String esinmobiliaria) {
		this.esinmobiliaria = esinmobiliaria;
	}

	public String getExtension1() {
		return this.extension1;
	}

	public void setExtension1(String extension1) {
		this.extension1 = extension1;
	}

	public String getExtension2() {
		return this.extension2;
	}

	public void setExtension2(String extension2) {
		this.extension2 = extension2;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getHomephone() {
		return this.homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdlocation() {
		return this.idlocation;
	}

	public void setIdlocation(String idlocation) {
		this.idlocation = idlocation;
	}

	public java.math.BigDecimal getIdniveleducativo() {
		return this.idniveleducativo;
	}

	public void setIdniveleducativo(java.math.BigDecimal idniveleducativo) {
		this.idniveleducativo = idniveleducativo;
	}

	public String getIdtype() {
		return this.idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}

	public String getIndicativocity() {
		return this.indicativocity;
	}

	public void setIndicativocity(String indicativocity) {
		this.indicativocity = indicativocity;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Timestamp getLastlogin() {
		return this.lastlogin;
	}

	public void setLastlogin(Timestamp lastlogin) {
		this.lastlogin = lastlogin;
	}

	public String getLoginid() {
		return this.loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public byte[] getObjectdata() {
		return this.objectdata;
	}

	public void setObjectdata(byte[] objectdata) {
		this.objectdata = objectdata;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public java.math.BigDecimal getProfesionid() {
		return this.profesionid;
	}

	public void setProfesionid(java.math.BigDecimal profesionid) {
		this.profesionid = profesionid;
	}

	public Date getPwdexpiration() {
		return this.pwdexpiration;
	}

	public void setPwdexpiration(Date pwdexpiration) {
		this.pwdexpiration = pwdexpiration;
	}

	public String getPwdreminderanswer() {
		return this.pwdreminderanswer;
	}

	public void setPwdreminderanswer(String pwdreminderanswer) {
		this.pwdreminderanswer = pwdreminderanswer;
	}

	public String getPwdreminderquestion() {
		return this.pwdreminderquestion;
	}

	public void setPwdreminderquestion(String pwdreminderquestion) {
		this.pwdreminderquestion = pwdreminderquestion;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTipousuario() {
		return this.tipousuario;
	}

	public void setTipousuario(String tipousuario) {
		this.tipousuario = tipousuario;
	}

	public String getVisitorType() {
		return this.visitorType;
	}

	public void setVisitorType(String visitorType) {
		this.visitorType = visitorType;
	}

	public String getWorkphone() {
		return this.workphone;
	}

	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}

	public List<Inmueble> getInmuebles() {
		return this.inmuebles;
	}

	public void setInmuebles(List<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}

	public Inmueble addInmueble(Inmueble inmueble) {
		getInmuebles().add(inmueble);
		inmueble.setVisitor(this);

		return inmueble;
	}

	public Inmueble removeInmueble(Inmueble inmueble) {
		getInmuebles().remove(inmueble);
		inmueble.setVisitor(null);

		return inmueble;
	}

	public Peticionesdiausuariosw getPeticionesdiausuariosw() {
		return this.peticionesdiausuariosw;
	}

	public void setPeticionesdiausuariosw(Peticionesdiausuariosw peticionesdiausuariosw) {
		this.peticionesdiausuariosw = peticionesdiausuariosw;
	}

	public List<Usuariosxmembresia> getUsuariosxmembresias() {
		return this.usuariosxmembresias;
	}

	public void setUsuariosxmembresias(List<Usuariosxmembresia> usuariosxmembresias) {
		this.usuariosxmembresias = usuariosxmembresias;
	}

	public Usuariosxmembresia addUsuariosxmembresia(Usuariosxmembresia usuariosxmembresia) {
		getUsuariosxmembresias().add(usuariosxmembresia);
		usuariosxmembresia.setVisitor1(this);

		return usuariosxmembresia;
	}

	public Usuariosxmembresia removeUsuariosxmembresia(Usuariosxmembresia usuariosxmembresia) {
		getUsuariosxmembresias().remove(usuariosxmembresia);
		usuariosxmembresia.setVisitor1(null);

		return usuariosxmembresia;
	}

	public Usuariosxmembresia getUsuariosxmembresia() {
		return this.usuariosxmembresia;
	}

	public void setUsuariosxmembresia(Usuariosxmembresia usuariosxmembresia) {
		this.usuariosxmembresia = usuariosxmembresia;
	}

}