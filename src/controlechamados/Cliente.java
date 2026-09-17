/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlechamados;

public class Cliente extends Usuario {

    private String cpfCnpj;
    private String endereco;

    public Cliente(String nome, String email, String telefone,
                   String cpfCnpj, String endereco) {
        super(nome, email, telefone);
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public String getEndereco() {
        return endereco;
    }
}