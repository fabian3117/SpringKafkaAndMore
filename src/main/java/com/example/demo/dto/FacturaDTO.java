package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Builder

@Data

public class FacturaDTO {

    private Date fecha;

    private Long facturaId;

    private Long monto;


}
