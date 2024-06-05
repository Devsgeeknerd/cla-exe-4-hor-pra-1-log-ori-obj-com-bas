package br.com.devsgeeknerd.consultorio;

public class Dentista {
  private String nome;
  private String sobrenome;
  private String especialidade;
  private String inscricaoCRO;
  private boolean estado;

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
      System.out.println("Consulta marcada com " + nome + " " + sobrenome + ".");
    } else {
      System.out.println(nome + " " + sobrenome + " não esta ativo para marcar consultas.");
    }
  }

  public void remarcarConsulta() {
    if (estado) {
      System.out.println("Consulta remarcada com " + nome + " " + sobrenome + ".");
    } else {
      System.out.println(nome + " " + sobrenome + " não esta ativo para remarcar consultas.");
    }
  }

  public void cancelarConsulta() {
    if (estado) {
      System.out.println("Consulta cancelada com " + nome + " " + sobrenome + ".");
    } else {
      System.out.println(nome + " " + sobrenome + " não esta ativo para cancelar consultas.");
    }
  }

  public void viajarCongresso() {
    estado = false;
    System.out.println(nome + " " + sobrenome + " esta indisponível por estar em um congresso.");
  }
}
