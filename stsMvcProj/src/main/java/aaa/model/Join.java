package aaa.model;

import lombok.Data;

@Data
public class Join {
		
	public Join() {
	}


	String pname,gender,mail;
	String password, nickname;
	int phone;
	
	
	public Join(String pname, String gender, String mail, String password, String nickname, int phone) {
		super();
		this.pname = pname;
		this.gender = gender;
		this.mail = mail;
		this.password = password;
		this.nickname = nickname;
		this.phone = phone;
	}
	
	
	

	
	

}
