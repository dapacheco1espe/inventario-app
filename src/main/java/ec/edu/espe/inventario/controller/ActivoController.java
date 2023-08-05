package ec.edu.espe.inventario.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.inventario.controller.dto.ActivoRQ;
import ec.edu.espe.inventario.modelos.Activo;
import ec.edu.espe.inventario.service.ActivoService;


@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@RequestMapping("/api/v1/activos")
public class ActivoController {
    private final ActivoService activoService;

    public ActivoController(ActivoService activoService) {
        this.activoService = activoService;
    }

    @PostMapping("/custodio")
    public ResponseEntity<List<Activo>> obtenerActivoRfidByCustodio1(@RequestBody ActivoRQ activoRQ) {
        List<Activo> activoRfids = this.activoService.obtenerActivoByCustodio1(activoRQ);
        return ResponseEntity.ok(activoRfids);
    }
}
