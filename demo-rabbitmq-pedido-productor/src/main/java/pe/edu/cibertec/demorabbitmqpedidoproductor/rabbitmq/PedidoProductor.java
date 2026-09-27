package pe.edu.cibertec.demorabbitmqpedidoproductor.rabbitmq;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.demorabbitmqpedidoproductor.config.RabbitMqConfig;
import pe.edu.cibertec.demorabbitmqpedidoproductor.dto.PedidoCreadoEvent;

@RequiredArgsConstructor
@Slf4j
@Service
public class PedidoProductor {
    private final RabbitTemplate rabbitTemplate;

    public void enviarPedidoARabbitMQ(PedidoCreadoEvent event){
        rabbitTemplate.convertAndSend(
                RabbitMqConfig.EXCHANGE,
                RabbitMqConfig.ROUTING_KEY, event);
        log.info("Enviando pedido A RabbitMQ: {}", event);
    }

}
