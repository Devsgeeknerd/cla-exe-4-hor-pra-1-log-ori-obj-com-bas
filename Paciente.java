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
}
