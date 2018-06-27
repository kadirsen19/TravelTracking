package dao;

import java.util.List;

import model.Employee;
import model.Permission;
import model.Travel;

public interface EmployeeMethods {

	public void insertEmployee(String employeeName,String employeeSurname,String userNama,String userPassword,String role,String department,String boss);
	
	public List<Employee> getEmployee();
	
	public List<Employee> findEmployee(String employeeName ,String employeeSurname);
	
	public Employee getEmployeeByUserName(String name);
	
	public void deleteTravel(int idtravel);
	
	public void insertTravel(String name ,String surname,String departent, String boss, String travelstart,String travelfinish, String travelplace,String reason,String username );
	
	public List<Travel> getTravel(String name);
	
	public List<Travel> getEmployeeTravel();
	
	public void insertPermission(String name ,String surname,String department, String boss, String start,String finish,String reason,String username);
	
	public List<Permission> getEmployeePermission();
	
	public List<Permission> getPermission(String name); 
	
	public void deletePermission(int idpermission);
	
	public Travel findTravelById(int idtravel);
	
	public void updateTravel(int id,String seyeHatYeri,String reason,String gidisTarihi,String donusTarihi);
}
