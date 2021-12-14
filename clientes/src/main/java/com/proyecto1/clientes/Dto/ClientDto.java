package com.proyecto1.clientes.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
    private String id;
    private String nroDoc;
    private String tipoDoc;
    private String nombres;
    private String apellidos;
    private Integer celular;
    private String razonSocial;
}
