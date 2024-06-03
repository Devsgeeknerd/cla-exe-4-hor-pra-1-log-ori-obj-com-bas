package br.com.devsgeeknerd.consultorio;

public class Dentista {
  private String nome;
  private String sobrenome;
  private String especialidade;
  private String inscricaoCRO;
  private boolean estado;

  public Dentista(String nome, String sobrenome, String especialidade, String inscricaoCRO, boolean estado) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.especialidade = especialidade;
    this.inscricaoCRO = inscricaoCRO;
    this.estado = estado;
  }
}
