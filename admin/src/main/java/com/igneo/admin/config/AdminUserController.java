package com.igneo.admin.config;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igneo.admin.dto.AdminUserDetailDTO;
import com.igneo.admin.dto.factory.AdminUserDetailFactory;
import com.igneo.domain.admin.AdminUser;

@RestController
public class AdminUserController {

    @RequestMapping("/adminusers")
    public AdminUserDetailDTO list() {
    	AdminUserDetailDTO dto = AdminUserDetailFactory.create(new AdminUser());
    	return dto;
    }

}
