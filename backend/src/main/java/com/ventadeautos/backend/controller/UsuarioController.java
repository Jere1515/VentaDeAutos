package com.ventadeautos.backend.controller;

import com.ventadeautos.backend.model.Usuario;
import com.ventadeautos.backend.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*") // Permite conexión desde Angular
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // POST: Registrar nuevo usuario
    @PostMapping("/register")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.registrarUsuario(usuario);
    }

    // POST: Login usuario (validar email + password)
    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario) {
        Optional<Usuario> user = usuarioService.buscarPorEmail(usuario.getEmail());

        if (user.isPresent() && user.get().getPassword().equals(usuario.getPassword())) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.status(401).build(); // Unauthorized
        }
    }

    // GET: Listar todos los usuarios
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }
}
