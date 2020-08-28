package vangencloud.vangenservice.impl;

import org.springframework.stereotype.Service;
import vangencloud.vangenservice.service.ItestService;

@Service("testService")
public class testServiceImpl implements ItestService {
    @Override
    public void test() {
        System.out.println("66666666666666666666666666666666666666666666");
    }
}
