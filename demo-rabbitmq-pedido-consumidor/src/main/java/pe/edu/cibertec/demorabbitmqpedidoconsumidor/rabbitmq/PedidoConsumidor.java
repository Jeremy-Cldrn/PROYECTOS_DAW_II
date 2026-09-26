package pe.edu.cibertec.demorabbitmqpedidoconsumidor.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.demorabbitmqpedidoconsumidor.config.RabbitMqConfig;
import pe.edu.cibertec.demorabbitmqpedidoconsumidor.dto.PedidoCreadoEvent;

import java.time.LocalDateTime;

@Slf4j
@Component
public class PedidoConsumidor {

    @RabbitListener(queues = RabbitMqConfig.QUEUE)
    public void generarBoletaPedidoEnviarEmail(
            PedidoCreadoEvent event)
      throws InterruptedException
    {
      log.info("Generando Boleta del Pedido...");
      log.info("Boleta generada, configuración de envio por Email");
      log.info("Pedido ID: {}", event.pedidoId());
      log.info("Fecha del Pedido: {}", event.fechaCreacion());
      Thread.sleep(10000);
      log.info("Boleta enviada, fecha y hora {}", LocalDateTime.now());
      log.info("-----------------------------------------");
    }
}
