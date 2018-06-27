package model;

public class Travel {

	private int idtavel;
	private String name;
	private String surname;
	private String department;
	private String boss;
	private String travelstart;
	private String travelfinish;
	private String travelplace;
	private String reason;
	private String username;
	
	
	public Travel(int idtavel, String name, String surname, String department, String boss, String travelstart,
			String travelfinish, String travelplace, String reason, String username) {
		
		this.idtavel = idtavel;
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.boss = boss;
		this.travelstart = travelstart;
		this.travelfinish = travelfinish;
		this.travelplace = travelplace;
		this.reason = reason;
		this.username = username;
	}
	public int getIdtavel() {
		return idtavel;
	}
	public void setIdtavel(int idtavel) {
		this.idtavel = idtavel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getBoss() {
		return boss;
	}
	public void setBoss(String boss) {
		this.boss = boss;
	}
	public String getTravelstart() {
		return travelstart;
	}
	public void setTravelstart(String travelstart) {
		this.travelstart = travelstart;
	}
	public String getTravelfinish() {
		return travelfinish;
	}
	public void setTravelfinish(String travelfinish) {
		this.travelfinish = travelfinish;
	}
	public String getTravelplace() {
		return travelplace;
	}
	public void setTravelplace(String travelplace) {
		this.travelplace = travelplace;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
