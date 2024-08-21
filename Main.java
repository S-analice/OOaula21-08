import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.SpringLayout;

public class Main {
    
    public static void main (String[] args) {

        Banco b = new Banco("Banco da Aninha");

        //inicializando o teclado de respostas
        Scanner teclado = new Scanner(System.in); 

        //perguntando e pegando resposta
        System.out.println("Digite o nome da pessoa: ");
        String nome = teclado.nextLine();

        System.out.println("Digite o cpf da pessoa: ");
        String cpf = teclado.nextLine();

        //indicando o que o objeto vai receber
        ClientePF cF = new ClientePF(nome, cpf);

          //adicionando a pessoa fisica na lista do banco
        //b.setClientePF(cF);
          b.adicionaClientes(cF);

        
        System.out.println("Digite o nome da empresa: ");
        String empresa = teclado.nextLine();

        System.out.println("Digite o cnpj da empresa: ");
        String cnpj = teclado.nextLine();

        ClientePJ cJ = new ClientePJ(empresa, cnpj);

          //adicionando a pessoa juridica na lista do banco
        //b.setClientePJ(cJ);
         b.adicionaClientes(cJ);

         //imprimir os clientes
         ArrayList<Cliente> listaDeClientes = b.getClientes();

         System.out.println("------------------------------");
         for(int i = 0; i < listaDeClientes.size(); i++) {
            Cliente item = listaDeClientes.get(i);

            System.out.println("Nome: ");
            System.out.println(item.getNome());
            System.out.println("------------------------------");

            //se o meu item é do tipo
            if(item instanceof ClientePJ) {
                System.out.println("Cnpj da empresa: ");
            } else {
                System.out.println("Cpf da pessoa: ");
            }

            //mostrando o documento
            System.out.println(item.getDocumento());
            System.out.println("------------------------------");
         }

         ArrayList<Cliente> listaDeClientesPJ = b.getClientesPJ();

         for(int i = 0; i < listaDeClientes.size(); i++) {
            Cliente item = listaDeClientesPJ.get(i);

            System.out.println("Pessoas do juridico: ");
            System.out.println(item.getNome());
            System.out.println("------------------------------");

         }

    }
 }