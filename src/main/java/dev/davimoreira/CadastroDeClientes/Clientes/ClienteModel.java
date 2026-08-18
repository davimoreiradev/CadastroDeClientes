package dev.davimoreira.CadastroDeClientes.Clientes;

import dev.davimoreira.CadastroDeClientes.Enderecos.EnderecoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    private String idade;
    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "endereco")//Um cliente pode ter varios endereços
    private List<EnderecoModel> enderecoList;


}
