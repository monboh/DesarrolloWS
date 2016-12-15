package co.com.metrocuadrado.webservice.model.dto;

public class UserDTO {
	
	
	public String visitor;
	
	public String login;
	
	public String pass;
	
	public int membershiptype;
	
	public int visitorID;
	
	public String prefix;
	
	public String getVisitor() {
		return visitor;
	}

	public void setVisitor(String visitor) {
		this.visitor = visitor;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getMembershiptype() {
		return membershiptype;
	}

	public void setMembershiptype(int membershiptype) {
		this.membershiptype = membershiptype;
	}

	public int getVisitorID() {
		return visitorID;
	}

	public void setVisitorID(int visitorID) {
		this.visitorID = visitorID;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	
}
