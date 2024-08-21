public abstract class Cliente {

    //atributos
    private String nome;

    //construtor
    public Cliente(String nome) {
        this.nome = nome;
    }

    //getters(mostra) e setters(coloca) 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }

    public abstract String getDocumento();
    
}