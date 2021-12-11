package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newtable")
public class Model {
		@Id
		private int Id;
		private String firstname;
		private String lastname;
		private int age;
		private String address;
		
		
		public Model() {}
		
		
		public Model(int Id,String firstname, String lastname, int age, String address) {
			super();
			this.Id=Id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
			this.address = address;
		}
		
		public int getId() {
			return Id;
		}
		public void setId(int Id) {
			this.Id = Id;
		
		}
		
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
}
