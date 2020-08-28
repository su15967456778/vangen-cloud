package vangencloud.vangenclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vangencloud.vangenclient.service.AdminService;

@RestController
public class backendController {

    @Autowired
    private AdminService adminService;

    @GetMapping(value = "/test")
    public String Test() {
        return adminService.sayHi();
    }

}
