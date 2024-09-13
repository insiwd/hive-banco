public class Cliente {

    private String nome;
    private String conta;
    private Double saldo = 2500.0;

    public Cliente() {

    }

    public Cliente(String nome, String conta, Double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double deposito(Double deposito) {
        return saldo += deposito;
    }

    public Double transferir(Double transferir) {
        return saldo -= transferir;
    }
}
