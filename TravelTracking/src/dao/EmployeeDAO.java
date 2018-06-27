package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import connection.MysqlConnection;
import model.Employee;
import model.Permission;
import model.Travel;

public class EmployeeDAO implements EmployeeMethods{

	
	MysqlConnection connection= new MysqlConnection();
	
	Connection baglanti=connection.DBConnection();
	
	PreparedStatement ps=null;
	
	public static final String INSERT_TRAVEL="insert into travel(name,surname,department,boss,travelstart,travelfinish,travelplace,reason,userName)"
			+ "values(?,?,?,?,?,?,?,?,?)";
	public static final String ALL_EMPLOYEE="select * from employee";
	
	public static final String INSERT_EMPLOYEE="insert into employee(employeeName,employeeSurname,userName,userPassword,userRole,department,boss)"
			+ "values(?,?,?,?,?,?,?)";
	public static final String FIND_EMPLOYEE="select * from employee where userName=?";
	
	public static final String EMPLOYEE_TRAVELS="select * from travel where userName=?";
	
	public static final String ALL_TRAVELS="select * from travel";
	
	public static final String DELETE_TRAVEL="delete from travel where idtravel=?";
	
	public static final String DELETE_PERMÝSSÝON="delete from permission where idpermission=?";
	
	public static final String INSERT_PERMÝSSÝON="insert into permission(name,surname,department,boss,permissionStart,permissionFinish,reason,userName)"
			+ "values(?,?,?,?,?,?,?,?)";
	public static final String EMPLOYEE_PERMÝSSÝONS="select * from permission where userName=?";
	
	public static final String ALL_PERMÝSSÝONS="select * from permission";
	
	public static final String FIND_TRAVEL_BY_ID="select * from travel where idtravel=?";
	
	public static final String UPDATE_TRAVEL="update travel set travelstart=?, travelfinish=?, travelplace=?, reason=? where idtravel=?";
	

	@Override
	public void insertEmployee(String employeeName, String employeeSurname, String userNama, String userPassword,
			String role, String department, String boss) {
		
		
		try {
			 ps = (PreparedStatement) baglanti.prepareStatement(INSERT_EMPLOYEE);
			
			ps.setString(1, employeeName);
			ps.setString(2, employeeSurname);
			ps.setString(3, userNama);
			ps.setString(4, userPassword);
			ps.setString(5, role);
			ps.setString(6, department);
			ps.setString(7, boss);
			
			
			ps.executeUpdate();

			baglanti.close();
			
		
		} catch (SQLException e) {
			System.out.println("Employee Veri eklenirken Hata Oluþtu !"+e);
			
		}

	}

	@Override
	public List<Employee> getEmployee() {
		List<Employee> list= new ArrayList<Employee>();
		 try {
			ps = (PreparedStatement) baglanti.prepareStatement(ALL_EMPLOYEE);
			
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				
				int id=resultSet.getInt("idemployee");
				String name=resultSet.getString("employeeName");
				String surname=resultSet.getString("employeeSurname");
				String username=resultSet.getString("userName");
				String userpassword=resultSet.getString("userPassword");
				String userrole=resultSet.getString("userRole");
				String bolum=resultSet.getString("department");
				String mudur=resultSet.getString("boss");
				
				Employee employee= new Employee(id,name, surname, username, userpassword, userrole, bolum, mudur);
				list.add(employee);
			}
			
			ps.executeUpdate();
			baglanti.close();
			
		} catch (SQLException e) {
			System.out.println("Employee Listelenirken hata oluþtu :"+e);
			
		}
		
		return list;
	}

	@Override
	public void deletePermission(int idpermission) {
		
		try {
			ps= (PreparedStatement) baglanti.prepareStatement(DELETE_PERMÝSSÝON);
			
			ps.setInt(1, idpermission);
			ps.executeUpdate();
			baglanti.close();
		} catch (SQLException e) {
			System.out.println("Permission  silerken hata oluþtu"+e);
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Employee> findEmployee(String employeeName, String employeeSurname) {
		
		return null;
	}

	@Override
	public Employee getEmployeeByUserName(String uname) {
		
		Employee employee =null;
		 try {
			ps = (PreparedStatement) baglanti.prepareStatement(FIND_EMPLOYEE);
			ps.setString(1,uname);
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				
				int id =resultSet.getInt("idemployee");
				String name=resultSet.getString("employeeName");
				String surname=resultSet.getString("employeeSurname");
				String username=resultSet.getString("userName");
				String userpassword=resultSet.getString("userPassword");
				String userrole=resultSet.getString("userRole");
				String bolum=resultSet.getString("department");
				String mudur=resultSet.getString("boss");
				
				 employee= new Employee(id,name, surname, username, userpassword, userrole, bolum, mudur);
				 
				
			}
			
		} catch (SQLException e) {
			System.out.println("Employee Listelenirken hata oluþtu :"+e);
			
		}
		
		 return employee;
	}

	@Override
	public void insertTravel(String name, String surname, String departent, String boss, String travelstart,
			String travelfinish, String travelplace, String reason,String username) {
		
		try {
			ps=(PreparedStatement) baglanti.prepareStatement(INSERT_TRAVEL);
			
			ps.setString(1, name);
			ps.setString(2, surname);
			ps.setString(3, departent);
			ps.setString(4, boss);
			ps.setString(5, travelstart);
			ps.setString(6, travelfinish);
			ps.setString(7, travelplace);
			ps.setString(8, reason);
			ps.setString(9, username);
			ps.executeUpdate();
			
			baglanti.close();
			
		} catch (Exception e) {
			System.out.println("Seyehat oluþturulurken hata Oluþtu"+e);
		}
		
		
	}

	@Override
	public List<Travel> getTravel(String name) {
		
		List<Travel> list = new ArrayList<Travel>();
		try {
			ps=(PreparedStatement) baglanti.prepareStatement(EMPLOYEE_TRAVELS);
			ps.setString(1, name);
			ResultSet resultSet=ps.executeQuery();
			while (resultSet.next()) {
				
				int id =resultSet.getInt("idtravel");
				String tname =resultSet.getString("name");
				String surname= resultSet.getString("surname");
				String department=resultSet.getString("department");
				String boss= resultSet.getString("boss");
				String start= resultSet.getString("travelstart");
				String finish= resultSet.getString("travelfinish");
				String place = resultSet.getString("travelplace");
				String reason = resultSet.getString("reason");
				String username= resultSet.getString("userName");
				
				Travel travel = new Travel(id, tname, surname, department, boss, start, finish, place, reason, username);
				list.add(travel);
			}
			
			
		} catch (Exception e) {
			System.out.println("Personel Travel listelenirken hata oluþtu :"+e);
		}
		
		return list;
	}

	@Override
	public List<Travel> getEmployeeTravel() {
		
		List<Travel> alllist= new ArrayList<Travel>();
		try {
			ps= (PreparedStatement) baglanti.prepareStatement(ALL_TRAVELS);
			
			ResultSet resultSet=ps.executeQuery();
			while (resultSet.next()) {
				
				int id =resultSet.getInt("idtravel");
				String tname =resultSet.getString("name");
				String surname= resultSet.getString("surname");
				String department=resultSet.getString("department");
				String boss= resultSet.getString("boss");
				String start= resultSet.getString("travelstart");
				String finish= resultSet.getString("travelfinish");
				String place = resultSet.getString("travelplace");
				String reason = resultSet.getString("reason");
				String username= resultSet.getString("userName");
				
				Travel travel = new Travel(id, tname, surname, department, boss, start, finish, place, reason, username);
				alllist.add(travel);
				
			}
		} catch (Exception e) {
			System.out.println("Tüm seyehatler listelenirken hata oluþtu"+e);
		}
		
		
		return alllist;
	}
	
	@Override
	public void insertPermission(String name, String surname, String department, String boss, String start,
			String finish, String reason, String username) {
		
		try {
			ps= (PreparedStatement) baglanti.prepareStatement(INSERT_PERMÝSSÝON);
			ps.setString(1, name);
			ps.setString(2, surname);
			ps.setString(3,department);
			ps.setString(4, boss);
			ps.setString(5, start);
			ps.setString(6,finish);
			ps.setString(7, reason);
			ps.setString(8,username);
			ps.executeUpdate();
			baglanti.close();
			
		} catch (Exception e) {
			System.out.println("Ýzin eklenirken hata oluþtu"+e);
			
		}
		
	}

	@Override
	public List<Permission> getEmployeePermission() {
		//tüm izinler
		
		List<Permission> list= new ArrayList<>();
		Permission permission=null;
		
		try {
			ps= (PreparedStatement) baglanti.prepareStatement(ALL_PERMÝSSÝONS);
			ResultSet resultSet =ps.executeQuery();
			while (resultSet.next()) {
				
				int id =resultSet.getInt("idpermission");
				String pname =resultSet.getString("name");
				String surname= resultSet.getString("surname");
				String department=resultSet.getString("department");
				String boss= resultSet.getString("boss");
				String start= resultSet.getString("permissionStart");
				String finish= resultSet.getString("permissionFinish");
				String reason = resultSet.getString("reason");
				String username = resultSet.getString("userName");
				
				permission= new Permission(id, pname, surname, department, boss, start, finish, reason, username);
				list.add(permission);
				
			}
		} catch (Exception e) {
			System.out.println("Permission listenelirken hata oluþtu"+e);
		}
		
		return list;
	}

	@Override
	public List<Permission> getPermission(String name) {
		//kiþi ismine göre izin
		List<Permission> permissionListByName= new ArrayList<>();
		Permission permission=null;
		
		try {
			ps= (PreparedStatement)baglanti.prepareStatement(EMPLOYEE_PERMÝSSÝONS);
			ps.setString(1, name);
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				
				int id =resultSet.getInt("idpermission");
				String pname =resultSet.getString("name");
				String surname= resultSet.getString("surname");
				String department=resultSet.getString("department");
				String boss= resultSet.getString("boss");
				String start= resultSet.getString("permissionStart");
				String finish= resultSet.getString("permissionFinish");
				String reason = resultSet.getString("reason");
				String username = resultSet.getString("userName");
				
				permission= new Permission(id, pname, surname, department, boss, start, finish, reason, username);
				permissionListByName.add(permission);
				
			}
		} catch (Exception e) {
			System.out.println("Kiþi izinleri alýrken hata oluþtu"+e);
		}
		return permissionListByName;
	}

	@Override
	public void deleteTravel(int idtravel) {

		try {
			ps=(PreparedStatement) baglanti.prepareStatement(DELETE_TRAVEL);
			ps.setInt(1, idtravel);
			ps.executeUpdate();
			//ps.close();
			//baglanti.close();
		} catch (Exception e) {
			System.out.println("Travel silinirken hata oluþtu"+e);
		}
		
	}

	@Override
	public Travel findTravelById(int idtravel) {
		
		Travel travelEdit=null;
		
		try {
			ps=(PreparedStatement) baglanti.prepareStatement(FIND_TRAVEL_BY_ID);
			ps.setInt(1, idtravel);
			ResultSet resultSet= ps.executeQuery();
			while (resultSet.next()) {
				
				int id =resultSet.getInt("idtravel");
				String tname =resultSet.getString("name");
				String surname= resultSet.getString("surname");
				String department=resultSet.getString("department");
				String boss= resultSet.getString("boss");
				String start= resultSet.getString("travelstart");
				String finish= resultSet.getString("travelfinish");
				String place = resultSet.getString("travelplace");
				String reason = resultSet.getString("reason");
				String username= resultSet.getString("userName");
				
				 travelEdit = new Travel(id, tname, surname, department, boss, start, finish, place, reason, username);
				
				
			}
		} catch (Exception e) {
			
			System.out.println("Seyehat bulunurken hata oluþtu"+e);
		}
		return travelEdit;
	}

	@Override
	public void updateTravel(int id, String seyeHatYeri, String reason, String gidisTarihi, String donusTarihi) {
		
		try {
			ps = (PreparedStatement) baglanti.prepareStatement(UPDATE_TRAVEL);
			ps.setString(1, gidisTarihi);
			ps.setString(2, donusTarihi);
			ps.setString(3, seyeHatYeri);
			ps.setString(4, reason);
			ps.setInt(5, id);
			ps.executeUpdate();
			//ps.close();
			//baglanti.close();
			
		} catch (Exception e) {
			System.out.println("Seyahat güncellerken hata oluþtu");
		}
		
	}



	

}
