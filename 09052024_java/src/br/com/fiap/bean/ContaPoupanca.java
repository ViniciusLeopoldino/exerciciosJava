package br.com.fiap.bean;
/**
 * Classe para objetos do tipo ContaPoupanca
 * @author Vinicius Leopoldino
 * @version 1.0
 */
public class ContaPoupanca implements ContaBancaria {

	//atributos
	private int numConta;
	private float saldo;
	
	//construtor vazio
	public ContaPoupanca() {}

	//getters e setters
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
	
	//Metodos da classe
	/**
	 * Metodo que permite sacar o valor informado
	 * Valor a ser sacado não pode ser superior ao valor do saldo
	 * @author Vinicius Leopoldino
	 * @param float valor = valor indicado a ser sacado
	 * @return float = valor do saldo (atualizado)
	 */
	public float sacar(float valor) {
		try {
			if (valor <= saldo) {
				saldo -= valor;
			} else {
				throw new Exception("Saldo Insuficiente");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return saldo;
	}
	/**
	 * Metodo que permite depositar o valor informado
	 * @author Vinicius Leopoldino
	 * @param floar valor = valor indicado para ser depositado
	 * @return float = valor do saldo (atualizado)
	 */
	public float depositar(float valor) {
		saldo += valor;
		return saldo;
	}
}

	
	