package com.igneo.admin.dto.factory;

import com.igneo.admin.dto.AdminUserSmallDTO;
import com.igneo.domain.admin.AdminUser;

public class AdminUserSmallFactory {

	public static AdminUserSmallDTO create(AdminUser entity){
		AdminUserSmallDTO dto = new AdminUserSmallDTO(entity.getName(), entity.getLastName(), entity.getPassword()); 
		return dto;
	} 

}
