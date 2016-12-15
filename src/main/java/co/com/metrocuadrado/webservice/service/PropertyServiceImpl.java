package co.com.metrocuadrado.webservice.service;

import co.com.metrocuadrado.webservice.model.Inmueble;


public class PropertyServiceImpl implements PropertyService{

	@Override
	public Inmueble consultProperty(String idProperty) {
		// TODO Auto-generated method stub
		
		return new Inmueble();
	}

	@Override
	public Inmueble propertyBelongsUser(String idProperty, String user) {
		// TODO Auto-generated method stub AL DAO
//		select i.* , V.LOGINID
//		from inmuebles i
//		left join VISITOR v on I.VISITORID = V.VISITORID
//		where idInmueble = 'pgomez02-83' AND V.LOGINID = 'pgomez';
		return null;
	}

	@Override
	public boolean isPropertyBelongsUser(String idProperty, String user) {
		// TODO Auto-generated method stub
		return false;
	}

}
