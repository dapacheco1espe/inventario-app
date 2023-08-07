package ec.edu.espe.inventario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.inventario.controller.dto.FuncionarioRQ;
import ec.edu.espe.inventario.modelos.Funcionario;
import ec.edu.espe.inventario.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> getFuncionariosContainsName(FuncionarioRQ funcionarioRQ){
        Funcionario funcionario = this.transformRQFuncionario(funcionarioRQ);
        return this.funcionarioRepository.findByNombreContainingIgnoreCase(funcionario.getNombre());
    }

    private Funcionario transformRQFuncionario(FuncionarioRQ funcionarioRQ){
        Funcionario funcionario = new Funcionario();
        funcionario.setCodigo(funcionarioRQ.getCodigo());
        funcionario.setCodigoEmpresa(funcionarioRQ.getCodigoEmpresa());
        funcionario.setIdentificacion(funcionarioRQ.getIdentificacion());
        funcionario.setLocalidad(funcionarioRQ.getLocalidad());
        funcionario.setNombre(funcionarioRQ.getNombre());
        return funcionario;
    }

}
