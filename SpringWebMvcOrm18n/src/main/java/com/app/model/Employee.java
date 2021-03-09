package com.app.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee_tab")
public class Employee {
	@Id
	@Column(name = "eid")
	private Integer empId;
	@Column(name = "ename")
	private String empName;
	@Column(name = "epwd")
	private String empPwd;
	@Column(name = "egen")
	private String empGen;
	@Column(name = "addr")
	private String empAddr;
	@Column(name = "cntry")
	private String empcntry;
	@Column(name = "lang")
	@ElementCollection
	@CollectionTable(name = "emplangtab", joinColumns = @JoinColumn(name = "eid"))
	private List<String> empLang;

	public Employee() {
		super();
	}
	public Employee(int empId) {
		this.empId=empId;
	}


	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}

	public String getEmpGen() {
		return empGen;
	}

	public void setEmpGen(String empGen) {
		this.empGen = empGen;
	}

	public String getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	public String getEmpcntry() {
		return empcntry;
	}

	public void setEmpcntry(String empcntry) {
		this.empcntry = empcntry;
	}

	public List<String> getEmpLang() {
		return empLang;
	}

	public void setEmpLang(List<String> empLang) {
		this.empLang = empLang;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPwd=" + empPwd + ", empGen=" + empGen
				+ ", empAddr=" + empAddr + ", empcntry=" + empcntry + ", empLang=" + empLang + "]";
	}

}
