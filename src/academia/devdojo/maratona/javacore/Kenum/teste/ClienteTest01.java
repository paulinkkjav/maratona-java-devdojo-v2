package academia.devdojo.maratona.javacore.Kenum.teste;

import academia.devdojo.maratona.javacore.Kenum.dominio.Cliente;
import academia.devdojo.maratona.javacore.Kenum.dominio.TipoCliente;
import academia.devdojo.maratona.javacore.Kenum.dominio.TipoPagamento;




public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Goku", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Naruto", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calculalDesconto(100.0));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}