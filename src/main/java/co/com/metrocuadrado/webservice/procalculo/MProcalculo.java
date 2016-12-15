package co.com.metrocuadrado.webservice.procalculo;

import java.io.FileOutputStream;
import java.sql.Connection;
import co.com.pragma.m2.MDBBase;

public class MProcalculo extends MDBBase
{
 
  
  public MProcalculo(Connection connection) {
		super(connection);
	}



public InmuebleUbicadoDTO geocodificarDireccionSinGuardarBD2(String idInmueble, String direccion, int idCiudad)
		    throws Exception
		  {
		    MetrocuadradoGeoServiceProxy m2 = new MetrocuadradoGeoServiceProxy();
		    InmuebleUbicadoDTO iuDTO = new InmuebleUbicadoDTO();
		    try
		    {
		      System.out.println("m2:ruta: " + m2.getEndpoint());
		      iuDTO = m2.ubicarInmuebleSinGuardarEnBd(idInmueble, direccion, Integer.valueOf(idCiudad));
		      System.out.println(iuDTO.getBarrio());
		      System.out.println(iuDTO.getTipoDeUbicacion());
		      System.out.println(iuDTO.getDireccionEstandar());
		      System.out.println(iuDTO.getMunicipio());
		      System.out.println(iuDTO.getSector());
		      System.out.println(iuDTO.getZona());
		      System.out.println(iuDTO.getFecha());
		      System.out.println(iuDTO.getEstrato());
		      System.out.println(iuDTO.getX());
		      System.out.println(iuDTO.getY());
		      appendLog("validarDireccionWSGERGOM", "iuDTO.getBarrio():" + iuDTO.getBarrio());
		      appendLog("validarDireccionWSGERGOM", "iuDTO.getTipoDeUbicacion():" + iuDTO.getTipoDeUbicacion());
		      appendLog("validarDireccionWSGERGOM", "iuDTO.getDireccionEstandar():" + iuDTO.getDireccionEstandar());
		      appendLog("validarDireccionWSGERGOM", "iuDTO.getMunicipio():" + iuDTO.getMunicipio());
		      appendLog("validarDireccionWSGERGOM", "iuDTO.getSector():" + iuDTO.getSector());
		      appendLog("validarDireccionWSGERGOM", "iuDTO.getZona():" + iuDTO.getZona());
		      appendLog("validarDireccionWSGERGOM", "iuDTO.getFecha():" + iuDTO.getFecha());
		      appendLog("validarDireccionWSGERGOM", "iuDTO.getEstrato():" + iuDTO.getEstrato());
		      appendLog("validarDireccionWSGERGOM", "iuDTO.getX():" + iuDTO.getX());
		      appendLog("validarDireccionWSGERGOM", "iuDTO.getY():" + iuDTO.getY());
		    }
		    catch (Exception e) {
		      appendLog("validarDireccionWSGERGOM","fallo envio ws: " + e.getMessage() + ", completo: " + e.toString());
		      appendLog("validarDireccionWSGERGOM","fallo envio ws: " + e.getMessage() + ", completo: " + e.toString());
		      return null;
		    }
		    return iuDTO;
		  }
  
  
  
  public org.w3c.dom.Document convertirDocADoc(org.jdom.Document doc) throws Exception{
	  	org.jdom.output.DOMOutputter outputter = new org.jdom.output.DOMOutputter();
		org.w3c.dom.Document document =	outputter.output(doc);
		return document;
	  
  }
  public org.jdom.Document InmuebleUbicadoDTOtoXMLError () {
	  org.jdom.Element root = new org.jdom.Element("geocode_response");
	  org.jdom.Element geocode = new org.jdom.Element("geocode"); 
	  geocode.setAttribute("id","1");
	  geocode.setAttribute("error_code","0");
	  geocode.setAttribute("error_message","success");
	  geocode.setAttribute("match_count","0");
	  
	  root.addContent(geocode);
	  org.jdom.Document doc = new org.jdom.Document(root);
	  return doc;
  }
  
  public org.jdom.Document InmuebleUbicadoDTOtoXML(InmuebleUbicadoDTO iuDTO) throws Exception{
		 
		 
	     org.jdom.Element root=new org.jdom.Element("geocode_response");
	     org.jdom.Element geocode=new org.jdom.Element("geocode"); 
		 geocode.setAttribute("id","1");
		 geocode.setAttribute("error_code","0");
		 geocode.setAttribute("error_message","success");
		 geocode.setAttribute("match_count","1");
		 
		 org.jdom.Element match=new org.jdom.Element("match").setAttribute("sequence","1");
		 
		 match.setAttribute("sequence","1");
		 match.setAttribute("score","100.0");
		 match.setAttribute("pro_id","3");
		 
		 org.jdom.Element output_address=new org.jdom.Element("output_address"); 
		 output_address.setAttribute("address",iuDTO.getDireccionOriginal());
		 
		 org.jdom.Element admin_area1=new org.jdom.Element("admin_area"); 
		 admin_area1.setAttribute("type","4");
		 admin_area1.setAttribute("id","13.0");
		 admin_area1.setAttribute("label",iuDTO.getMunicipio());
		 
		 org.jdom.Element admin_area2=new org.jdom.Element("admin_area");
		 admin_area2.setAttribute("type","101");
		 admin_area2.setAttribute("id",iuDTO.getIdZona().toString());
		 admin_area2.setAttribute("label",iuDTO.getZona());
		 
		 org.jdom.Element admin_area3=new org.jdom.Element("admin_area");
		 admin_area3.setAttribute("type","102");
		 admin_area3.setAttribute("id",iuDTO.getIdSector().toString());
		 admin_area3.setAttribute("label",iuDTO.getSector());
		 
		 org.jdom.Element admin_area4=new org.jdom.Element("admin_area");
		 admin_area4.setAttribute("type","103");
		 admin_area4.setAttribute("id","0.0");
		 admin_area4.setAttribute("label",iuDTO.getBarrio());
		 
		 
		 org.jdom.Element point=new org.jdom.Element("point"); 
		 org.jdom.Element coordinates=new org.jdom.Element("coordinates"); 
		 coordinates.setText(iuDTO.getX()+", "+iuDTO.getY());
		 
		 point.addContent(coordinates);
		 match.addContent(output_address);
		 match.addContent(admin_area1);
		 match.addContent(admin_area2);
		 match.addContent(admin_area3);
		 match.addContent(admin_area4);
		 match.addContent(point);
		 geocode.addContent(match);
		 root.addContent(geocode);
		 org.jdom.Document doc = new org.jdom.Document(root);
		 
		 
		 System.out.println("xml:::"+root.getText());
		 System.out.println("xml2:::"+doc.toString());
		 
		 
		 appendLog("validarDireccionWSGERGOM","IXM3"+root.getText());
		 
		 try{
			 org.jdom.output.XMLOutputter out=new org.jdom.output.XMLOutputter();
		      FileOutputStream file=new FileOutputStream("/tmp/wsprocalculo.xml");
		      
		      
		      out.output(doc,file); 
		      file.flush(); 
		      file.close();
		      //out.output(doc,System.out);
		      java.io.FilePermission perm = new java.io.FilePermission("/tmp/wsprocalculo.xml", "read,write,execute");
		    }catch(Exception e){e.printStackTrace();}
		 
		 ////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		 return doc;
		
	}

  public org.w3c.dom.Document validarDireccionProcalculo(String idInmueble, String direccion, int idMunicipio) throws Exception {
	  
	  	InmuebleUbicadoDTO iuDTO=new InmuebleUbicadoDTO();
	  	org.w3c.dom.Document doc;
	  	
    	boolean actualizo=false;

	  	
	  	try{
    		iuDTO=validarInmuebleDTO(idInmueble, direccion, idMunicipio);
    		actualizo=true;
    	}catch(Exception e){
    		actualizo=false;
    	}
    	
	    try{
	    	doc = convertirDocADoc(InmuebleUbicadoDTOtoXML(iuDTO));
	    }catch(Exception e){
	    	doc=convertirDocADoc(InmuebleUbicadoDTOtoXMLError());
	    }
	    return doc;
  }



  private InmuebleUbicadoDTO validarInmuebleDTO(String idInmueble, String direccion, int idCiudad)throws Exception
  {
    
      InmuebleUbicadoDTO iuDTO = new InmuebleUbicadoDTO();
      appendLog("validarDireccionWSGERGOM", "va a geocodificar idInmueble= " + idInmueble + " direccion:" + direccion + " idciudad=" + idCiudad);
      iuDTO = geocodificarDireccionSinGuardarBD2(idInmueble, direccion, idCiudad);
         
      return iuDTO;
  }
}