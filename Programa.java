package br.com.devsgeeknerd.programa;

import br.com.devsgeeknerd.Dentista;
import br.com.devsgeeknerd.Paciente;

public class Programa {
    public static void main(String[] args) {
        Dentista dentista = new Dentista("Paulo", "Vanderley", "Cirurgião Dentista", "BR-CD-45", true);

        dentista.atenderPaciente();
        dentista.marcarConsulta();
        dentista.remarcarConsulta();
        dentista.cancelarConsulta();
        dentista.viajarCongresso();

        Paciente paciente = new Paciente(
                1,
                "Jackie",
                "SpaceX",
                19,
                "Feminino",
                "55-98765-0123",
                "Avenida Moreno Branco, s/n - Belapraia - JP");

        paciente.marcarConsulta();
        paciente.remarcarConsulta();
        paciente.consultadoConsulta();
        paciente.cancelarConsulta();
    }

}
