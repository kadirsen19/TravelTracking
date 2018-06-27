package model;

public class Permission {
	
	private int idpermission;
	private String name;
	private String surname;
	private String department;
	private String boss;
	private String permissionStar;
	private String permissionFinish;
	private String reason;
	private String username;
	
	public Permission(int idpermission, String name, String surname, String department, String boss,
			String permissionStar, String permissionFinish, String reason, String username) {
		
		this.idpermission = idpermission;
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.boss = boss;
		this.permissionStar = permissionStar;
		this.permissionFinish = permissionFinish;
		this.reason = reason;
		this.username = username;
	}
	public int getIdpermission() {
		return idpermission;
	}
	public void setIdpermission(int idpermission) {
		this.idpermission = idpermission;
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
	public String getPermissionStar() {
		return permissionStar;
	}
	public void setPermissionStar(String permissionStar) {
		this.permissionStar = permissionStar;
	}
	public String getPermissionFinish() {
		return permissionFinish;
	}
	public void setPermissionFinish(String permissionFinish) {
		this.permissionFinish = permissionFinish;
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
