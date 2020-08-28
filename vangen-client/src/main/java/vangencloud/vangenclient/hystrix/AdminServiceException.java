package vangencloud.vangenclient.hystrix;

import org.springframework.stereotype.Component;
import vangencloud.vangenclient.service.AdminService;

@Component
public class AdminServiceException implements AdminService  {

    public String sayHi() {
        return "报错！";
    }
}
