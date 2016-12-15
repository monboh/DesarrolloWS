package co.com.metrocuadrado.webservice.collections;

import java.util.HashSet;

import co.com.metrocuadrado.webservice.model.Photo;



/**
 *
 * @author Jaime Alfredo Bonilla Perez jaimebp@gmail.com
 */
public class Photos extends HashSet<Photo>{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final String XMLHEADER = "<Registros xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
    static final String XMLFOOTER = "</Registros>";
	
    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append(XMLHEADER);

        for (Photo item : this) {
            sb.append(item.toXML() + "\n");
        }
        sb.append(XMLFOOTER);
        return sb.toString();
    }
	
}
