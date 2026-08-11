package dev.davimoreira.CadastroDeClientes.Enderecos;

import dev.davimoreira.CadastroDeClientes.Clientes.ClienteModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_endereco")
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

@ManyToOne
@JoinColumn(name = "cliente_id")
    private ClienteModel clienteModel;

}