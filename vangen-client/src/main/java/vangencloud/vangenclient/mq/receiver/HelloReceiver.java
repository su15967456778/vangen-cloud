package vangencloud.vangenclient.mq.receiver;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }


}
