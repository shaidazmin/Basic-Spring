package com.spring.hibernate.SpringHibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "university")
public class University {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="u_id")
	private int id;
	
	@Column(name="u_name")
	private String name;
	
	@Column(name="u_address")
	private String address;
	
	@Column(name="u_open_or_close")
	private String isOpen;
	
	
	@Column(name="open_date")
	@Temporal(TemporalType.DATE)
	private Date currentDate;
	
	@Lob
	@Column(name  = "u_image")
	@Transient
	private String image;
	
	@Transient
	private String founder;
	
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public University(String name, String address, String isOpen, String founder, Date currentDate,
			String image) {
		super();
		this.name = name;
		this.address = address;
		this.isOpen = isOpen;
		this.founder = founder;
		this.currentDate = currentDate;
		this.image = image;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIsOpen() {
		return isOpen;
	}
	public void setIsOpen(String isOpen) {
		this.isOpen = isOpen;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public Date getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", address=" + address + ", isOpen=" + isOpen
				+ ", currentDate=" + currentDate + ", image=" + image + ", founder=" + founder + "]";
	}
	
	
	
	
	
	

}
