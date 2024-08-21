import java.util.ArrayList;

public class Banco {

    private String nome;

    //private ArrayList<ClientePF> clientesPF;
    //private ArrayList<ClientePJ> clientesPJ;

    private ArrayList<Cliente> clientes;

    //construtor
    public Banco(String nome){

        this.nome = nome;

        //instanciando a lista 
     //this.clientesPF = new ArrayList<>();
     //this.clientesPJ = new ArrayList<>();

       this.clientes = new ArrayList<>();
    }

      //get e set da lista de fisicos
    //public ArrayList<ClientePF> getClientesPF(){
    //    return this.clientesPF;
    //}

    //public void setClientePF (ClientePF clientePF){
    //   clientesPF.add(clientePF);
    //}


       //get e set da lista de juridicos
    //public ArrayList<ClientePJ> getClientesPJ(){
    //    return this.clientesPJ;
    //}

    //public void setClientePJ(ClientePJ clientePJ) {
    //   clientesPJ.add(clientePJ);
    //}
    
    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }

    public void adicionaClientes(Cliente cliente){
        this.clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientesPJ(){

        //inicializei nova lista vazia
        ArrayList<Cliente> listaPJ = new ArrayList<>();

        for(int i = 0; i < this.clientes.size(); i++ ){

            Cliente item = this.clientes.get(i);

            if(item instanceof ClientePJ) {
                listaPJ.add(item); 
            }
        }
        return listaPJ;
      }  

    }
