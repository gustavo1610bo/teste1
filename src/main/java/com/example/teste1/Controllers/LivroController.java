package com.example.teste1.Controllers;

import com.example.teste1.Models.LivroModels;
import com.example.teste1.Services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.swing.text.Caret;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity<LivroModels> adicionar(@RequestBody LivroModels livroModels){
        LivroModels livro = livroService.adicionar(livroModels);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(livro.getId())
                .toUri();
        return ResponseEntity.created(uri).body(livro);
    }

    @GetMapping
    public ResponseEntity<List<LivroModels>> buscaTudo() {
        List<LivroModels> request = livroService.buscaTudo();
        return ResponseEntity.ok(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivroModels>buscaPorId(@PathVariable Long id){
        LivroModels livro = livroService.buscaPorId(id);
        return ResponseEntity.ok(livro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LivroModels>atualizar(@PathVariable Long id,@RequestBody LivroModels livroModels){
        LivroModels atualiza = livroService.atualizar(id, livroModels);
        return ResponseEntity.ok(atualiza);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<LivroModels>deletar(@PathVariable Long id){
        livroService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
