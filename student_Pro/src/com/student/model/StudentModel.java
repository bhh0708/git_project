package com.student.model;

public class StudentModel {
	
	private int id;
		private String username;
		private int sex;
		private String love;
		private String password;
		
		public StudentModel(int id, String username, String password, int sex, String love)
		{
		super();
		this.id = id;
		this.username = username ;
		this.password=password;
		this.sex = sex;
		this.love = love;
		}

}
