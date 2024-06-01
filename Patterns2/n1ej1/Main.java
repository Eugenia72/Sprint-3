package Patterns2.n1ej1;

import Patterns2.n1ej1.BolsaAcciones.AgenteBolsa;

import Patterns2.n1ej1.BolsaAcciones.AgenciasBolsa;



public class Main {

    public static void main(String[] args) {


      AgenteBolsa agenteBolsa = new AgenteBolsa("NYSE");

      // Crear los observadores (AgenciasBolsa)
      AgenciasBolsa agencia1 = new AgenciasBolsa("SwissExchange");
      AgenciasBolsa agencia2 = new AgenciasBolsa("MendozaBolsa");
      AgenciasBolsa agencia3 = new AgenciasBolsa("BarcelonaInvest");

      // Registrar los observadores
      agenteBolsa.registerObserver(agencia1);
      agenteBolsa.registerObserver(agencia2);
      agenteBolsa.registerObserver(agencia3);

      // Simular cambios
      agencia1.update("AAPL");
      agencia2.update("MSFT");
      agencia3.update("GOOG");
    }
}