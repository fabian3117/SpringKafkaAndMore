package com.example.demo.controller;

import com.example.demo.dto.FacturaDTO;
import com.example.demo.models.FacturaModel;
import com.example.demo.service.FacturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/facturacion")
@RequiredArgsConstructor
public class FacturacionController {
    private final FacturaService facturaService;

    @GetMapping("/{userId}")
    public FacturaDTO getFacturacion(@PathVariable Long userId) {

        return facturaService.getFacturaById(userId);

    }
    @GetMapping("/")
    public List<FacturaModel> getAllFacturas(){
        return facturaService.getAllFacturas();
    }
    @PostMapping("/{userId}")
    public void createFacturacion(@PathVariable String userId, @RequestBody FacturaDTO facturaDTO) {

        facturaService.saveNewFactura(FacturaModel.builder().facturaId(2l).monto(10l).build());
        return;
    }
}
