package br.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/oi")
    public static String cumprimentar() {
	String mensagem = "Como vai você?";
	return mensagem;
    }
}
