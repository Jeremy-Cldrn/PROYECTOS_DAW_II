package pe.edu.cibertec.demorabbitmqpedidoproductor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.demorabbitmqpedidoproductor.dto.CrearPedidoRequest;
import pe.edu.cibertec.demorabbitmqpedidoproductor.dto.PedidoCreadoEvent;
import pe.edu.cibertec.demorabbitmqpedidoproductor.service.PedidoService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    private final PedidoService pedidoService;

    @PostMapping
    public PedidoCreadoEvent finalizarPedido(
            @RequestBody CrearPedidoRequest request){
        return pedidoService.finalizarPedidoEnviarCorreo(
                request);
    }
}
