package com.example.demo.mappers;


import com.example.demo.dto.FacturaDTO;
import com.example.demo.models.FacturaModel;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface FacturacionMapper {

    FacturaDTO FacturaModelToFacturaDTO(FacturaModel factura);

    FacturaModel FacturaDTOToFacturaModel(FacturaDTO facturaDTO);
}
