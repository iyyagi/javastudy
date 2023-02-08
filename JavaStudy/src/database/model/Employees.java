package database.model;

public class Employees {

	private Integer employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private String hire_date;
	private String job_id;
	private double salary;
	private double commission_pct;
	private Integer manager_id;
	private Integer department_id;
	
	public Employees() {
		
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


	public double getSalary() {
		return salary;
	}


	public double getCommission_pct() {
		return commission_pct;
	}


	public Integer getManager_id() {
		return manager_id;
	}

}
