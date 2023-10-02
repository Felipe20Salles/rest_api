package domain;

public class Usuario {
    private String nome;
    private Long id;
    private String login;
    private String senha;

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

    public String getLogin() {return login;}
    public void setLogin(String login) {this.nome = login;}

    public Long getSenha() {return senha;}
    public void setSenha(Long senha) {this.senha = senha;}

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + "]";
    }
}
