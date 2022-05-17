public class Cliente {

    private String nome;
    private String sobrenome;
    private Integer cpf;


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }


    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
    protected void imprimeDadosCliente(){
        System.out.println(String.format("Nome: %s", this.getNome()));
        System.out.println(String.format("Sobrenome: %s", this.getSobrenome()));
        System.out.println(String.format("CPF: %s", this.getCpf()));

    }

    public Cliente(String nome, String sobrenome, Integer cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
}
