package pe.edu.cibertec.demorabbitmqpedidoproductor.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PedidoCreadoEvent(Long pedidoId, String cliente,
                                BigDecimal total,
                                LocalDateTime fechaCreacion) {
}
