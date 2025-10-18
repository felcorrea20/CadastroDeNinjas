package spring.fiasco.CadastroDeNinjas.Ninjas.model;

import spring.fiasco.CadastroDeNinjas.Missoes.model.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@Data  // cria todos os getters e setters
@NoArgsConstructor   // cria construtor vazio
@AllArgsConstructor  // cria construtor com todos os atributos
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    @ManyToOne
    @JoinColumn(name = "missao_id")  // fk
    private MissaoModel missao;
}