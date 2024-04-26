package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;

public class Gestante {
	//atributos
	private String nome;
	private LocalDate dataDaGestacao;
	//construtor vazio
	public Gestante() {
	}
	//construtor com passagem de parametro
	public Gestante(String nome, LocalDate dataDaGestacao) {
		this.nome = nome;
		this.dataDaGestacao = dataDaGestacao;
	}
	//métodos getters e setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDaGestacao() {
		return dataDaGestacao;
	}

	public void setDataDaGestacao(LocalDate dataDaGestacao) {
		this.dataDaGestacao = dataDaGestacao;
	}
	
	public int tempoDataGestacao() {
		LocalDate dataAtual = LocalDate.now();
		Period tempoDeGestacao = Period.between(dataDaGestacao, dataAtual);
		return tempoDeGestacao.getYears();
	}
	
	//falta finalizar este código e fazer a classe usagestante
	
}






