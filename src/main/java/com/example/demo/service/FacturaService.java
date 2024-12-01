package com.example.demo.service;

import com.example.demo.dto.FacturaDTO;
import com.example.demo.mappers.FacturacionMapper;
import com.example.demo.models.FacturaModel;
import com.example.demo.repository.facturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor

public class FacturaService {

    private final facturaRepository facturaRepository;
    @Autowired
    private final FacturacionMapper facturacionMapper;

    public FacturaService(com.example.demo.repository.facturaRepository facturaRepository, FacturacionMapper facturacionMapper) {
        this.facturaRepository = facturaRepository;
        this.facturacionMapper = facturacionMapper;
    }

    public void saveNewFactura(FacturaModel FacturaModel) {

        //--->  En caso de falla debo informar via kafka    <---

        facturaRepository.save(FacturaModel);

    }
    public void saveNewFactura(FacturaDTO factura) {

        //--->  En caso de falla debo informar via kafka    <---

        facturaRepository.save(facturacionMapper.FacturaDTOToFacturaModel(factura));

    }

    public FacturaDTO getFacturaById(Long id) {


        return facturacionMapper.FacturaModelToFacturaDTO(facturaRepository.findById(id).orElse(new FacturaModel()));
//       return FacturaDTO.builder().build();
//        return facturacionMapper.FacturaModelToFacturaDTO(facturaRepository.findById(id).orElse(new FacturaModel()));
//        return facturaRepository.getReferenceById(id);


    }
    public List<FacturaModel> getAllFacturas() {
        return facturaRepository.findAll();

    }

}
