package ec.edu.espe.inventario.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.inventario.controller.dto.FuncionarioRQ;
import ec.edu.espe.inventario.modelos.Funcionario;
import ec.edu.espe.inventario.service.FuncionarioService;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@RequestMapping("/api/v1/funcionarios")
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService){
        this.funcionarioService = funcionarioService;
    }
@PostMapping("/all")
    public ResponseEntity<List<Funcionario>> obtenerFuncionarioLikeName(@RequestBody FuncionarioRQ funcionarioRQ) {
        List<Funcionario> funcionarios = this.funcionarioService.getFuncionariosContainsName(funcionarioRQ);
        return ResponseEntity.ok(funcionarios);
    }

}
