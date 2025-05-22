package main;

public class OAuthLogin implements ILogin {
	private String token;
	
	public OAuthLogin(String token) {
		this.setToken(token);
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public boolean authenticate(String username, String password) {
		if(this.token.equals(password))return true;
		return false;
	}

}
