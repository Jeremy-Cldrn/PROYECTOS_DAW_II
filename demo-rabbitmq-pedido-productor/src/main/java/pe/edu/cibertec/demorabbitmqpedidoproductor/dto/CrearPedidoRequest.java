package pe.edu.cibertec.demorabbitmqpedidoproductor.dto;

import java.math.BigDecimal;

public record CrearPedidoRequest(String cliente, BigDecimal total) {
}
