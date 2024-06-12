package br.com.devsgeeknerd.programa;

import br.com.devsgeeknerd.Dentista;
import br.com.devsgeeknerd.Paciente;

public class Programa {
  public static void programa(String[] args) {
    System.out.println("Testando a classe Dentista:");
    Dentista dentista1 = new Dentista("Paulo", "Albino", "Ortodontia", "CRO8852398", true);
    dentista1.atenderPaciente();
    dentista1.marcarConsulta();
    dentista1.remarcarConsulta();
    dentista1.cancelarConsulta();
    dentista1.viajarCongresso();

    Dentista dentista2 = new Dentista("Vanderley", "Paris", "Endodontia", "CRO1597563", true);
    dentista2.atenderPaciente();
    dentista2.marcarConsulta();
    dentista2.remarcarConsulta();
    dentista2.cancelarConsulta();
    dentista2.viajarCongresso();
    dentista2.atenderPaciente();

    System.out.println();

    System.out.println("Testando a classe Paciente:");
    Paciente paciente1 = new Paciente(1, "Siri", "Apple", 18, "feminino", "95123698741", "Rua Chicago Fire, B3");
    paciente1.marcarConsulta();
    paciente1.remarcarConsulta();
  }
}
