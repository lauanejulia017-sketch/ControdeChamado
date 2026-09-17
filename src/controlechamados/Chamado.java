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

    public Chamado(String titulo, String descricao, Prioridade prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = StatusChamado.ABERTO;
        this.dataAbertura = LocalDateTime.now();
    }

    public void atribuirTecnico(Tecnico t) {

        if (status == StatusChamado.ABERTO && tecnico == null) {

            tecnico = t;
            status = StatusChamado.EM_ATENDIMENTO;

            System.out.println("Tecnico atribuido com sucesso.");

        } else {

            System.out.println("Chamado indisponivel para atribuicao.");
        }
    }

    public void alterarStatus(StatusChamado s) {
        status = s;
    }

    public boolean estaAberto() {
        return status == StatusChamado.ABERTO;
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        historico.add(atendimento);
    }

    public int getQuantidadeAtendimentos() {
        return historico.size();
    }

    public void encerrar() {

        if (status == StatusChamado.EM_ATENDIMENTO
                && tecnico != null
                && !historico.isEmpty()) {

            status = StatusChamado.ENCERRADO;
            dataEncerramento = LocalDateTime.now();

            System.out.println("Chamado encerrado com sucesso.");

        } else {

            System.out.println("Chamado nao pode ser encerrado.");
        }
    }

    public StatusChamado getStatus() {
        return status;
    }
}