package vangencloud.vangenservice.controrller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vangencloud.vangenservice.service.ItestService;

@RestController
public class TestController {

    @Autowired
    private ItestService testService;

    @GetMapping(value = "/test")
    public String Test() {
        testService.test();
        return "666";
    }
}
