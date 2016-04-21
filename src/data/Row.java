package data;

import java.util.ArrayList;

public class Row {
	private String id;
	private String firstname;  
	private String middlename; 
	private String lastname;
	private String gender;
	private String email;
	private String extension ;
	private String hiredate;
	private String salary;
	private String commission_pct;
	private String department_id;
	private String job_id;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	
	public Row(){
		super();
	}
	public Row(String id, String firstname, String middlename, String lastname, String gender, String email,
			String extension, String hiredate, String salary, String commission_pct, String department_id,
			String job_id, String address, String city, String state, String zipcode){
	
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.gender = gender;
		this.email = email;
		this.extension = extension;
		this.hiredate = hiredate;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.department_id = department_id;
		this.job_id = job_id;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	
	public Row(ArrayList<String> row)
	{
		super();
		this.id = row.get(0);
		this.firstname = row.get(1);
		this.middlename = row.get(2);
		this.lastname = row.get(3);
		this.gender = row.get(4);
		this.email = row.get(5);
		this.extension = row.get(5);
		this.hiredate = row.get(6);
		this.salary = row.get(7);
		this.commission_pct = row.get(8);
		this.department_id = row.get(9);
		this.job_id = row.get(10);
		this.address = row.get(11);
		this.zipcode = row.get(14);
		this.city = row.get(12);
		this.state = row.get(13);
	}

	public ArrayList<String> employeeToArrayList ()
	{
		ArrayList<String> employee = new ArrayList<>();
		employee.add(id);
		employee.add(firstname);
		employee.add(middlename);
		employee.add(lastname);
		employee.add(gender);
		employee.add(email);
		employee.add(extension);
		employee.add(hiredate);
		employee.add(salary);
		employee.add(commission_pct);
		employee.add(department_id);
		employee.add(job_id);
		employee.add(address);
		employee.add(city);
		employee.add(state);
		employee.add(zipcode);
		return null;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getMiddlename() {
		return middlename;
	}


	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getExtension() {
		return extension;
	}


	public void setExtension(String extension) {
		this.extension = extension;
	}


	public String getHiredate() {
		return hiredate;
	}


	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getCommission_pct() {
		return commission_pct;
	}


	public void setCommission_pct(String commission_pct) {
		this.commission_pct = commission_pct;
	}


	public String getDepartment_id() {
		return department_id;
	}


	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}


	public String getJob_id() {
		return job_id;
	}


	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
}