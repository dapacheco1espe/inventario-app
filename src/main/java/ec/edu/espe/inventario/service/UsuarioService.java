package ec.edu.espe.inventario.service;

import org.springframework.stereotype.Service;

import ec.edu.espe.inventario.controller.dto.UsuarioRQ;
import ec.edu.espe.inventario.controller.dto.UsuarioRS;
import ec.edu.espe.inventario.modelos.Usuario;
import ec.edu.espe.inventario.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioRS signIn(UsuarioRQ usuariorq){
        Usuario tmpUser = this.transformUsuarioRQToUsuario(usuariorq);
        Usuario user = this.usuarioRepository.findByLogin(tmpUser.getLogin());
        if(user != null){
            return this.transformUsuarioToUsuarioRS(user);
        }else{
            throw new RuntimeException("Credenciales incorrectas");
        }
    }

    private Usuario transformUsuarioRQToUsuario(UsuarioRQ usuariorq){
        Usuario user = new Usuario();
        user.setLogin(usuariorq.getLogin());
        user.setPasswd(usuariorq.getPasswd());
        return user;
    }

    private UsuarioRS transformUsuarioToUsuarioRS(Usuario usuario){
        UsuarioRS user = new UsuarioRS();
        user.setLogin(usuario.getLogin());
        user.setEmail(usuario.getEmai());
        user.setIdentificacion(usuario.getIdentificacion());
        user.setNombre(usuario.getNombre());
        return user;
    }
}
