package ec.edu.espe.inventario.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.inventario.controller.dto.UsuarioRQ;
import ec.edu.espe.inventario.controller.dto.UsuarioRS;
import ec.edu.espe.inventario.service.UsuarioService;
@RestController
@RequestMapping("/api/v1/auth")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping("/sign-in")
    public ResponseEntity<UsuarioRS> signIn(@RequestBody UsuarioRQ usuarioRQ) {
        try{
            UsuarioRS user = this.usuarioService.signIn(usuarioRQ);

            return ResponseEntity.ok(user);
        }catch(RuntimeException e){
            return ResponseEntity.badRequest().build();
        }
    }
}
