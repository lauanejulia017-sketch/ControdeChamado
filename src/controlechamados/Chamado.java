/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlechamados;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Chamado {

    private Long id;
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private StatusChamado status;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataEncerramento;
    private Tecnico tecnico;
    
    private List<Atendimento> historico = new ArrayList<>();

    public void atribuirTecnico(Tecnico t) {
        tecnico = t;
    }

    public void alterarStatus(StatusChamado s) {
        status = s;
    }

    public boolean estaAberto() {
        return status == StatusChamado.ABERTO;
    }

    public void encerrar() {
        status = StatusChamado.ENCERRADO;
        dataEncerramento = LocalDateTime.now();
    }
}