package br.com.devsgeeknerd.consultorio;

import br.com.devsgeeknerd.Dentista;
import br.com.devsgeeknerd.Paciente;

public class Programa {
  public static void programa(String[] args) {
    System.out.println("Testando a classe Dentista:");
    Dentista dentista1 = new Dentista("Paulo", "Albino", "Ortodontia", "CRO8852398", true);
  }
}
