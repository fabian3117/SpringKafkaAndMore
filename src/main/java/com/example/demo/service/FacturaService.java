package com.example.demo.service;

import com.example.demo.dto.FacturaDTO;
import com.example.demo.models.FacturaModel;
import com.example.demo.repository.facturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class FacturaService {

    private final facturaRepository facturaRepository;
    private final FacturacionMapper facturacionMapper;

    public void saveNewFactura(FacturaModel FacturaModel) {

        //--->  En caso de falla debo informar via kafka    <---

        facturaRepository.save(FacturaModel);

    }
    public void saveNewFactura(FacturaDTO factura){

        facturaRepository.save(FacturaModel.builder()
                .facturaId(factura.getFacturaId())
                .monto(factura.getMonto())
                        .fecha(factura.getFecha())
                .build());
    }
    public FacturaModel getFacturaById(Long id) {

        facturacionMapper.
        return facturaRepository.getReferenceById(id);


    }
    public List<FacturaModel> getAllFacturas() {
        return facturaRepository.findAll();

    }

}
