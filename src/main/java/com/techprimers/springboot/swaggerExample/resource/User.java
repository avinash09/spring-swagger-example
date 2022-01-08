package com.techprimers.springboot.swaggerExample.resource;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Model use to process User Records")
public class User {

	@ApiModelProperty(value = "Name of the User")
	private String userName;

	@ApiModelProperty(value = "Salary of the User")
	private Long salary;

	public User(String userName, Long salary) {
		this.userName = userName;
		this.salary = salary;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

}
