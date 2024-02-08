package com.example.jogos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jogos")
public class JogosController {

    @GetMapping
    public void getAll() {

    }
}
