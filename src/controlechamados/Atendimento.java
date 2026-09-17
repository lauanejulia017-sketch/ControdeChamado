/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlechamados;

import java.time.LocalDateTime;

public class Atendimento {

    private Long id;
    private LocalDateTime dataHora;
    private String descricao;
    private Tecnico realizadoPor;

    public Atendimento(String descricao, Tecnico realizadoPor) {
        this.descricao = descricao;
        this.realizadoPor = realizadoPor;
    }

    public void registrar() {
        this.dataHora = LocalDateTime.now();
    }
}