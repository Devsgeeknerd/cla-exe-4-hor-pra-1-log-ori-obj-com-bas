package br.com.devsgeeknerd.consultorio;

public class Paciente {
  private int codigo;
  private String nome;
  private String sobrenome;
  private int idade;
  private String sexo;
  private String telefone;
  private String endereco;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String enderenco) {
    this.endereco = enderenco;
  }

  public Paciente(int codigo, String nome, String sobrenome, int idade, String sexo, String telefone,
      String enderenco) {
    this.codigo = codigo;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.idade = idade;
  }
}
