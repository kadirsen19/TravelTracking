package model;

public class Employee {
	
	private int id;
	private String eName;
	private String eSurname;
	private String eUserNAME;
	private String eUserPassword;
	private String eRole;
	private String eDepartment;
	private String eBoss;
	
	public Employee(int id, String eName, String eSurname, String eUserNAME, String eUserPassword, String eRole,
			String eDepartment, String eBoss) {
		this.id = id;
		this.eName = eName;
		this.eSurname = eSurname;
		this.eUserNAME = eUserNAME;
		this.eUserPassword = eUserPassword;
		this.eRole = eRole;
		this.eDepartment = eDepartment;
		this.eBoss = eBoss;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteSurname() {
		return eSurname;
	}
	public void seteSurname(String eSurname) {
		this.eSurname = eSurname;
	}
	public String geteUserNAME() {
		return eUserNAME;
	}
	public void seteUserNAME(String eUserNAME) {
		this.eUserNAME = eUserNAME;
	}
	public String geteUserPassword() {
		return eUserPassword;
	}
	public void seteUserPassword(String eUserPassword) {
		this.eUserPassword = eUserPassword;
	}
	public String geteRole() {
		return eRole;
	}
	public void seteRole(String eRole) {
		this.eRole = eRole;
	}
	public String geteDepartment() {
		return eDepartment;
	}
	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}
	public String geteBoss() {
		return eBoss;
	}
	public void seteBoss(String eBoss) {
		this.eBoss = eBoss;
	}
	
	

}
