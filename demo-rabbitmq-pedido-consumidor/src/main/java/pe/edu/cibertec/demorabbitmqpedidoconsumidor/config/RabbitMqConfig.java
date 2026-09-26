package pe.edu.cibertec.demorabbitmqpedidoconsumidor.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {
    public static final String EXCHANGE = "cibertec.pedidos.exchange";
    public static final String QUEUE = "cibertec.pedidos.queuenoche";
    public static final String ROUTING_KEY = "cibertec.pedidos.routingkey";

    @Bean
    public DirectExchange pedidosExchange() {
        return new DirectExchange(EXCHANGE);
    }
    @Bean
    public Queue pedidosQueue() {
        return new Queue(QUEUE,  true);
    }

    @Bean
    public Binding pedidosBinding() {
        return BindingBuilder.bind(pedidosQueue())
                .to(pedidosExchange())
                .with(ROUTING_KEY);
    }
}
