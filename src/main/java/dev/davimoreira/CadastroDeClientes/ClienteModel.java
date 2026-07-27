package dev.davimoreira.CadastroDeClientes;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class ClienteModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    private String idade;
    private String email;


}
