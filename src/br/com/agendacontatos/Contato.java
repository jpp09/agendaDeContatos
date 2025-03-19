package br.com.agendacontatos;

public class Contato{
    private String nome;
    private int numero;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getInfo(){
        return String.format("Nome: %s\nTelefone: %d",this.nome,this.numero);
    }
}