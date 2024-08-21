public class ClientePJ extends Cliente {

    private String cnpj;

    public ClientePJ (String nome, String cnpj) {

        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getDocumento() {
        
        return this.cnpj;
    }
}