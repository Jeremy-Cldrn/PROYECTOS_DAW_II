package pe.edu.cibertec.demorabbitmqpedidoconsumidor.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PedidoCreadoEvent(Long pedidoId, String cliente,
                                BigDecimal total,
                                LocalDateTime fechaCreacion) {
}
