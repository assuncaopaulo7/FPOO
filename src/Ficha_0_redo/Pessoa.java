package Ficha_0_redo;
import java.io.*;


public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    public int idade;
    public String name;
    public String profissao;

    public Pessoa (int idade, String name){
        this.name = name;
        this.idade = idade;
    }

    public Pessoa (int idade, String name, String profissao){
        this.name = name;
        this.idade = idade;
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
