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

  public void atenderPaciente() {
    if (estado) {
      System.out.println(nome + " " + sobrenome + " esta atendendo um paciente.");
    } else {
      System.out.println(nome + " " + sobrenome + " não esta ativo para atender pacientes.");
    }
  }

  public void marcarConsulta() {
    if (estado) {
    }
  }
}
