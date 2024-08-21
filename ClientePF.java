public class ClientePF extends Cliente {
    
    //atributos
    private String cpf;

    //construtor
    public ClientePF(String nome, String cpf) {

        //super se refere a outra classe
        super(nome);
        this.cpf = cpf;
    }
    
    //getters(mostra) e setters(coloca)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //anotação do codigo
    @Override
    public String getDocumento() {
        
        return this.cpf;
    }
}