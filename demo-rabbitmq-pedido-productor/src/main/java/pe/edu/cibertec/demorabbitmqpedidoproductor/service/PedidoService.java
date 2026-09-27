package pe.edu.cibertec.demorabbitmqpedidoproductor.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.demorabbitmqpedidoproductor.dto.CrearPedidoRequest;
import pe.edu.cibertec.demorabbitmqpedidoproductor.dto.PedidoCreadoEvent;
import pe.edu.cibertec.demorabbitmqpedidoproductor.rabbitmq.PedidoProductor;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@RequiredArgsConstructor
@Service
public class PedidoService {
    private final PedidoProductor productor;
    private final AtomicLong id = new AtomicLong(0);
    public PedidoCreadoEvent finalizarPedidoEnviarCorreo(
            CrearPedidoRequest request){
        PedidoCreadoEvent event = new PedidoCreadoEvent(
                id.getAndIncrement(),
                request.cliente(),
                request.total(),
                LocalDateTime.now());
        productor.enviarPedidoARabbitMQ(event);
        return event;
    }
}
