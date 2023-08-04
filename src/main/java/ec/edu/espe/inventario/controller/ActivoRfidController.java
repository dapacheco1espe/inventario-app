package ec.edu.espe.inventario.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.inventario.controller.dto.ActivoRfidRQ;
import ec.edu.espe.inventario.modelos.ActivoRfid;
import ec.edu.espe.inventario.service.ActivoRfidService;

@CrossOrigin(origins = "http://localhost:8100",maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/v1/activosRfid")
public class ActivoRfidController {

    private final ActivoRfidService activoRfidService;

    public ActivoRfidController(ActivoRfidService activoRfidService) {
        this.activoRfidService = activoRfidService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ActivoRfid>> listarActivosRfid() {
        List<ActivoRfid> activoRfids = this.activoRfidService.listarActivosRfid();
        return ResponseEntity.ok(activoRfids);
    }

    @PostMapping("/custodio")
    public ResponseEntity<List<ActivoRfid>> obtenerActivoRfidByCustodio1(@RequestBody ActivoRfidRQ activoRQ) {
        List<ActivoRfid> activoRfids = this.activoRfidService.obtenerActivoRfidByCustodio1(activoRQ);
        return ResponseEntity.ok(activoRfids);
    }

    @PostMapping("/usuario")
    public ResponseEntity<List<ActivoRfid>> obtenerActivoRfidByUsuario(@RequestBody ActivoRfidRQ activoRQ) {
        List<ActivoRfid> activoRfids = this.activoRfidService.obtenerActivoRfidByUsuario(activoRQ);
        return ResponseEntity.ok(activoRfids);
    }

    @PostMapping("/codigo")
    public ResponseEntity<ActivoRfid> obtenerActivoRfid(@RequestBody ActivoRfidRQ activoRQ) {
        ActivoRfid activoRfids = this.activoRfidService.obtenerActivoRfid(activoRQ);
        return ResponseEntity.ok(activoRfids);
    }

    @PostMapping("/rfid")
    public ResponseEntity<ActivoRfid> obtenerActivoRfidByCodigoR(@RequestBody ActivoRfidRQ activoRQ) {
        ActivoRfid activoRfids = this.activoRfidService.obtenerActivoRfidByCodigoR(activoRQ);
        return ResponseEntity.ok(activoRfids);
    }

    @PostMapping("/agregar")
    public ResponseEntity<ActivoRfid> agregarActivoRfid(@RequestBody ActivoRfidRQ activoRQ) {
        ActivoRfid activoRfids = this.activoRfidService.agregarActivoRfid(activoRQ);
        return ResponseEntity.ok(activoRfids);
    }

    @PutMapping("/editar")
    public ResponseEntity<ActivoRfid> editarActivoRfid(@RequestBody ActivoRfidRQ activoRQ) {
        ActivoRfid activoRfids = this.activoRfidService.editarActivoRfid(activoRQ);
        return ResponseEntity.ok(activoRfids);
    }
}
