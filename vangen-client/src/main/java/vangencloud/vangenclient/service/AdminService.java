package vangencloud.vangenclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import vangencloud.vangenclient.hystrix.AdminServiceException;

@FeignClient(value="vangen-service",fallback = AdminServiceException.class)
public interface AdminService {

    @GetMapping("test")
    public String sayHi();

}
