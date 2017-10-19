package com.zjw.provider.entity;

import java.io.Serializable;

public class User implements Serializable {

		/**
	 * 
	 */
	private static final long serialVersionUID = -628743491877550218L;
		private  String name;
		private String sex;
		private  int age;
		
		
		public  User(){
			
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getSex() {
			return sex;
		}


		public void setSex(String sex) {
			this.sex = sex;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		
		@Override
		public String toString() {
			return "User [name=" + name + ", sex=" + sex + ", age=" + age + "]";
		}
		
		
		
		
}
