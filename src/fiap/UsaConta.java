package fiap;

import javax.swing.JOptionPane;

public class UsaConta {

    public static void main(String[] args) {
        String aux, escolha = "sim";
        int numConta, opcao;
        float saldo, valor;

        while (escolha.equalsIgnoreCase("sim")) {
            try {
                aux = JOptionPane.showInputDialog("Digite o numero da conta");
                numConta = Integer.parseInt(aux);
                aux = JOptionPane.showInputDialog("Digite o saldo da conta");
                saldo = Float.parseFloat(aux);
                ContaPoupanca cp = new ContaPoupanca();
                cp.setNumConta(numConta);
                cp.setSaldo(saldo);
                aux = JOptionPane.showInputDialog("Escolha uma operação \n(1)-Saque \n(2)-Deposito");
                opcao = Integer.parseInt(aux);
                switch (opcao) {
                    case 1:
                        aux = JOptionPane.showInputDialog("Digite o valor a ser sacado");
                        valor = Float.parseFloat(aux);
                        JOptionPane.showMessageDialog(null,
                                "Dados da conta: \nNumero da conta: " + cp.getNumConta() + "\nSaldo atual: " + cp.sacar(valor));
                        break;
                    case 2:
                        aux = JOptionPane.showInputDialog("Digite o valor a ser depositado");
                        valor = Float.parseFloat(aux);
                        JOptionPane.showMessageDialog(null,
                                "Dados da conta: \nNumero da conta: " + cp.getNumConta() + "\nSaldo atual: " + cp.depositar(valor));
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcao invalida");
                }

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            escolha = JOptionPane.showInputDialog("Deseja continuar?");
        }
        JOptionPane.showMessageDialog(null, "Fim de programa");
    }

}
