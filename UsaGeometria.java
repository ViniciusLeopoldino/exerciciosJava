package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Geometria;

public class UsaGeometria {

	public static void main(String[] args) {
		Geometria geo1 = new Geometria();
		String aux, escolha = "sim";
		int opcao;
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Qual área deseja calcular?" + "\n(1) Quadrado \n(2) Retângulo \n(3) Círculo");
				opcao = Integer.parseInt(aux);
				switch (opcao) {
				case 1:
					aux = JOptionPane.showInputDialog("Digite o valor do lado");
					float lado1 = Float.parseFloat(aux);
					geo1.calculaArea(lado1);
					break;
				case 2:
					aux = JOptionPane.showInputDialog("Digite o valor do lado");
					float lado2 = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor da altura");
					float altura2 = Float.parseFloat(aux);
					geo1.calculaArea(lado2, altura2);
					break;
				case 3:
					aux = JOptionPane.showInputDialog("Digite o valor do raio");
					double raio3 = Double.parseDouble(aux);
					geo1.calculaArea(raio3);
					break;
				default:
					throw new Exception("Escolha incorreta!");
				}
				escolha = JOptionPane.showInputDialog("Deseja continuar? (sim ou não)");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Fim de Programa!");
	}

}
