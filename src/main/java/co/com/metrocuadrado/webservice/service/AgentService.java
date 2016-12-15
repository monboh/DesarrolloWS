package co.com.metrocuadrado.webservice.service;

public interface AgentService {

	public void asociateAgentProperty(String idProperty, String name, Long phone);
	
	public boolean propertyHasAgent(String idProperty);
	
	public void updateAgentProperty(String idProperty, String name, Long phone);
}
