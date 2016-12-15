package co.com.metrocuadrado.webservice.service;

public interface VideoService {
	
	
	public boolean deleteVideoPproperty(String idProperty);
	
	public void approveVideo(String s1, String s2, String idProperty);
	
	public void updateVideoProperty(String idProperty, String urlVideo);
	
	public boolean insertVideoProperty(String idProperty, String urlVideo);

	public boolean existVideo(String idInmueble);
}
