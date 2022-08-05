package fiap;

/**
 * Clase para objetos do tipo conta poupanca
 *
 * @author Lucas Guerra
 * @version 1.0
 */
public class ContaPoupanca implements ContaBancaria {
    private int numConta;
    private float saldo;

    public ContaPoupanca() {
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * Método sacar que permite sacar o valor informado Valor sacado não pode ser
     * superior ao valor do saldo atual
     *
     * @author Lucas Guerra
     * @param valor - valor indicado a ser sacado
     * @return float - valor do saldo (atualizado)
     */
    public float sacar(float valor) {
        try {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                throw new Exception("Saldo insuficiente");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
    }

    /**
     * Metodo de depositar que permite o deposito de saldo do valor informado
     *
     * @author Lucas Guerra
     * @param valor - valor indicado a despositar
     * @return float - valor do saldo (atualizado)
     */
    public float depositar(float valor) {
        saldo += valor;
        return saldo;
    }

}
