package co.com.metrocuadrado.webservice.model;

import java.io.Serializable;

/**
 * Foto Value Object.
 * This class is value object representing database table Foto
 * This class is intented to be used together with associated Dao object.
 */

/**
 * 
 * @author Jaime Alfredo Bonilla Perez jaimebp@gmail.com
 */

public class Photo implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static private final String XMLHEADER = "<Registro>";
	static private final String XMLFOOTER = "</Registro>";
	static private final String BASEURL = "http://metrocuadrado.blob.core.windows.net/inmueblespru";
	/**
	 * Persistent Instance variables. This data is directly mapped to the
	 * columns of database table.
	 */
	private String idProperty;
	private String urlPhoto;
	private String nroPhoto;

	/**
	 * Constructors. .
	 */

	public Photo() {
		super();
	}

	public Photo(String idInmuebleIn) {
		super();
		setIdProperty(idInmuebleIn);

	}
	
	public Photo(String idPropertyIn, String urlPhoto, String nroPhoto) {
		super();
		setIdProperty(idPropertyIn);
		setUrlFoto(urlPhoto);
		this.nroPhoto = nroPhoto;
	}

	/**
	 * Get- and Set-methods for persistent variables. The default behaviour does
	 * not make any checks against malformed data, so these might require some
	 * manual additions.
	 */

	public String getIdProperty() {
		return this.idProperty;
	}

	public void setIdProperty(String idPropertyIn) {
		if (idPropertyIn == null)
			this.idProperty = null;
		else
			this.idProperty = idPropertyIn.trim();
	}

	public String getUrlPhoto() {
		if (urlPhoto.contains("://"))
			return this.urlPhoto;
		else
			return "http://" + this.urlPhoto;
	}

	public void setUrlFoto(String urlFotoIn) {
		if (urlFotoIn == null)
			this.urlPhoto = null;
		else
			this.urlPhoto = urlFotoIn.trim();
	}

	public String getNroPhoto() {
		return this.nroPhoto;
	}

	public void setNroPhoto(String nroFotoIn) {
		this.nroPhoto = nroFotoIn;
	}



	/**
	 * hasEqualMapping-method will compare two Foto instances and return true if
	 * they contain same values in all persistent instance variables. If
	 * hasEqualMapping returns true, it does not mean the objects are the same
	 * instance. However it does mean that in that moment, they are mapped to
	 * the same row in database.
	 */
	public boolean hasEqualMapping(Photo valueObject) {

		if (this.idProperty == null) {
			if (valueObject.getIdProperty() != null)
				return (false);
		} else if (!this.idProperty.equals(valueObject.getIdProperty())) {
			return (false);
		}
		if (this.urlPhoto == null) {
			if (valueObject.getUrlPhoto() != null)
				return (false);
		} else if (!this.urlPhoto.equals(valueObject.getUrlPhoto())) {
			return (false);
		}
		if (this.nroPhoto == null) {
			if (valueObject.getNroPhoto() != null)
				return (false);
		} else if (!this.nroPhoto.equals(valueObject.getNroPhoto())) {
			return (false);
		}

		return true;
	}

	/**
	 * toString will return String object representing the state of this
	 * valueObject. This is useful during application development, and possibly
	 * when application is writing object states in textlog.
	 */
	public String toString() {
		StringBuffer out = new StringBuffer();
		out.append("class Foto:: \n");
		out.append("idInmueble = " + this.idProperty + "\n");
		out.append("urlFoto = " + this.getUrlPhoto() + "\n");
		out.append("nroFoto = " + this.nroPhoto + "\n");

		return out.toString();
	}

	/**
	 * Clone will return identical deep copy of this valueObject. Note, that
	 * this method is different than the clone() which is defined in
	 * java.lang.Object. Here, the retuned cloned object will also have all its
	 * attributes cloned.
	 */
	public Object clone() {
		Photo cloned = new Photo();

		if (this.idProperty != null)
			cloned.setIdProperty(new String(this.idProperty));
		if (this.urlPhoto != null)
			cloned.setUrlFoto(new String(this.urlPhoto));
		if (this.nroPhoto != null)
			cloned.setNroPhoto(new String(this.nroPhoto));

		return cloned;
	}

	public String toXML() {
		StringBuilder sb = new StringBuilder();
		sb.append(XMLHEADER);
		sb.append("<IdPublicacion>" + idProperty + "</IdPublicacion>");
		sb.append("<IdSecuencia>" + nroPhoto + "</IdSecuencia>");
		sb.append("<URL>" + this.getUrlPhoto() + "</URL>");
		sb.append("<Letra>" + "</Letra>");
		sb.append("<Transformar>true</Transformar>");
		sb.append(XMLFOOTER);
		return sb.toString();
	}

	public String toURL() {
		StringBuilder ret = new StringBuilder(BASEURL);
		ret.append("/" + getIdProperty());
		ret.append("/" + getIdProperty());
		ret.append("_" + getNroPhoto());
		ret.append("_l.jpg");

		// String
		// BASEURL="http://metrocuadrado.blob.core.windows.net/inmuebles/3/3_2_s.jpg";
		return ret.toString();
	}

}
