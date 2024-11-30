package com.example.demo.service;

import com.example.demo.dto.FacturacionDTO;
import com.example.demo.models.factura;
import com.example.demo.repository.facturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class FacturaService {

    private final facturaRepository facturaRepository;

    public void saveNewFactura(factura factura) {

        //--->  En caso de falla debo informar via kafka    <---

        facturaRepository.save(factura);

    }
    public void saveNewFactura(FacturacionDTO factura){

        facturaRepository.save(com.example.demo.models.factura.builder()
                .facturaId(factura.getFacturaId())
                .monto(factura.getMonto())
                        .fecha(factura.getFecha())
                .build());
    }
    public factura getFacturaById(Long id) {
        return facturaRepository.getReferenceById(id);
    }
    public List<factura> getAllFacturas() {
        return facturaRepository.findAll();

    }

}
