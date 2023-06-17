
package com.mycompany.supercadastro.entidades;


public class Professor {
    private String nome;
    private char sexo;
    private int idade;
    private String cpf;

    public Professor(String nome, char sexo, int idade, String cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
    }
    
    
    // Construtor vazio
    public Professor() {       
    }
    
    
    
    // Getters e setters aqui

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", cpf=" + cpf + '}';
    }
    
}