package com.sms.security.controller;

import com.sms.security.model.IpAll;
import com.sms.security.repository.IpAllRepository;
import com.sms.security.service.IpAllService;
import org.mapstruct.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/test")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TestController {

    @Autowired
    private IpAllService ipAllService;

    @GetMapping("/all")
    public String allAccess(@Context HttpServletRequest request) {

        String ip = request.getRemoteAddr();
        String restAdress = "/api/test/all";
        IpAll ipAll = new IpAll(restAdress,ip);
        ipAllService.save(ipAll);

        return "Страница доступна всем!\nIp adress и ссылка успешно сохранены!";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String userAccess() {
        return "user API";
    }

    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
    public String moderatorAccess() {
        return "moderator API";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "admin API";
    }
}
