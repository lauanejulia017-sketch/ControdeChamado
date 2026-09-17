/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlechamados;

import java.time.LocalDate;

public class Tecnico extends Usuario {

    private String especialidade;
    private LocalDate dataCadastro;

    public Tecnico(String nome, String email, String telefone, String especialidade) {
        super(nome, email, telefone);
        this.especialidade = especialidade;
        this.dataCadastro = LocalDate.now();
    }

    public String getEspecialidade() {
        return especialidade;
    }
}