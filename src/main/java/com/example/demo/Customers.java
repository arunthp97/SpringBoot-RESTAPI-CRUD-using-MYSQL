package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Customers {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "custid",length = 12)
	private int custid;
	private String custname;
	private String custemail;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustemail() {
		return custemail;
	}
	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}
	@Override
	public String toString() {
		return "Customers [custid=" + custid + ", custname=" + custname + ", custemail=" + custemail + "]";
	}
}
