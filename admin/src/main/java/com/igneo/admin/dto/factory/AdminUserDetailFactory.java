package com.igneo.admin.dto.factory;

import com.igneo.admin.dto.AdminUserDetailDTO;
import com.igneo.domain.admin.AdminUser;

public class AdminUserDetailFactory extends AdminUserSmallFactory {

	public static AdminUserDetailDTO create(AdminUser entity){
		AdminUserDetailDTO dto = new AdminUserDetailDTO(entity.getName(), entity.getLastName(), entity.getPassword(), "fgdfgdfgdgf"); 
		return dto;
	} 

}
