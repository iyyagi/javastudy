package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeesAndDepartments  {
	private Integer department_id;
	private Integer employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private String hire_date;
	private String job_id;
	private Double salary;
	private Double commission_pct;
	private Integer manager_id;
	private String department_name;
	private Departments department;
	
	public EmployeesAndDepartments() {
		
	}
	
	// ResultSet을 하면 다 꺼내주는 메서드를 만들었다.
	public EmployeesAndDepartments(ResultSet rs) throws SQLException {
		department_id 	= rs.getInt(1);
		employee_id 	= rs.getInt(2);
		first_name 		= rs.getString(3);
		last_name 		= rs.getString(4);
		email 			= rs.getString(5);
		phone_number 	= rs.getString(6);
		hire_date 		= rs.getString(7);
		job_id 			= rs.getString(8);
		salary 			= rs.getDouble(9);
		commission_pct  = rs.getDouble(10);
		manager_id 		= rs.getInt(11);
		// department 테이블에 동일한 내용이 나와서 따로 처리해준다.
		department 		= new Departments(rs);
	}
	
	@Override
	public String toString() {
		return String.format("%s/%d/%d\n", first_name, manager_id, department_id);
	}
	
	public Integer getDepartment_id() {
		return department_id;
	}
	
	public Integer getEmployee_id() {
		return employee_id;
	}
	
	
	public String getFirst_name() {
		return first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhone_number() {
		return phone_number;
	}
	
	public String getHire_date() {
		return hire_date;
	}
	
	public String getJob_id() {
		return job_id;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public Double getCommission_pct() {
		return commission_pct;
	}
	
	public Integer getManager_id() {
		return manager_id;
	}
	
	public String getDepartment_name() {
		return department_name;
	}
	
	public Departments getDepartments() {
		return department;
	}
	
	// Departments의 클래스를 활용 
	public String getDepartment() {
		return department.getDepartment_name();
	}
	
	public Integer getDepartmentManager_id() {
		return department.getManager_id();
	}
	
	public Integer getLocation_id() {
		return department.getLocation_id();
	}

	

}
