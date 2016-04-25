/**
 * 
 */
package com.igneo.admin.dto;

/**
 * @author diana
 *
 */
public class AdminUserDetailDTO extends AdminUserSmallDTO {
	
	private  String extra;
	
	public AdminUserDetailDTO(String name, String lastName, String password, String extra) {
		super(name, lastName, password);
		this.setExtra(extra);
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}
	
	

}
