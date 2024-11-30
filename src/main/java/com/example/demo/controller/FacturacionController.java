package com.example.demo.controller;

import com.example.demo.dto.FacturacionDTO;
import com.example.demo.models.factura;
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
    public FacturacionDTO getFacturacion(@PathVariable String userId) {

        return FacturacionDTO.builder()
                .monto(500L)
                .fecha(new Date(System.currentTimeMillis()))
                .facturaId(50L)
                .build();
    }
    @GetMapping("/")
    public List<factura> getAllFacturas(){
        return facturaService.getAllFacturas();
    }
    @PostMapping("/{userId}")
    public void createFacturacion(@PathVariable String userId, @RequestBody FacturacionDTO facturacionDTO) {

        facturaService.saveNewFactura(factura.builder().facturaId(2l).monto(10l).build());
        return;
    }
}
