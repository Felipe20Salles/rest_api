package domain;

public class Usuario {
    private String nome;
    private Long id;

    public Usuario(String nome, Long id) {
        this.nome = nome;
        this.id = id;
        this.login = login;
        this.senha = senha
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + "]";
    }
}
