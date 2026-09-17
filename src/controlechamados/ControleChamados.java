/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlechamados;

public class ControleChamados {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
            "Lauane",
            "lauane@umc.br",
            "11999999999",
            "12345678900",
            "Mogi das Cruzes"
        );

        Tecnico tecnico = new Tecnico(
            "Carlos",
            "carlos@umc.br",
            "11988888888",
            "Redes"
        );

        Tecnico tecnico2 = new Tecnico(
            "Pedro",
            "pedro@umc.br",
            "11977777777",
            "Hardware"
        );

        Chamado chamado = new Chamado(
            "Sem internet",
            "Computador não acessa a rede",
            Prioridade.ALTA
        );

        System.out.println("Chamado criado com status: " + chamado.getStatus());

        chamado.atribuirTecnico(tecnico);

        System.out.println(
            "Status após atribuir técnico: " + chamado.getStatus()
        );

        System.out.println();
        System.out.println("Tentativa de outro técnico assumir o chamado...");

        chamado.atribuirTecnico(tecnico2);

        Atendimento atendimento1 = new Atendimento(
            "Realizada a troca do cabo de rede",
            tecnico
        );

        atendimento1.registrar();
        chamado.adicionarAtendimento(atendimento1);

        Atendimento atendimento2 = new Atendimento(
            "Realizado teste de conectividade",
            tecnico
        );

        atendimento2.registrar();
        chamado.adicionarAtendimento(atendimento2);

        System.out.println();
        System.out.println(
            "Quantidade de atendimentos registrados: "
            + chamado.getQuantidadeAtendimentos()
        );

        chamado.encerrar();

        System.out.println(
            "Status final do chamado: " + chamado.getStatus()
        );
    }
}