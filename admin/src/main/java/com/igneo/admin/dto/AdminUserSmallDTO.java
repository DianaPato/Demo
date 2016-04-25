/**
 * 
 */
package com.igneo.admin.dto;

/**
 * @author diana
 *
 */
public class AdminUserSmallDTO {
	
	private  String name;
	private  String lastName;
	private  String password;
	
	public AdminUserSmallDTO(String name, String lastName, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	}
	
}
