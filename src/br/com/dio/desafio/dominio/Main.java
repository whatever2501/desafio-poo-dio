package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Cursos curso1 = new Cursos();
		curso1.setTitulo("curso java");
		curso1.setCargaHoraria(8);
		curso1.setDescricao("Desicao");
		
		Cursos curso2 = new Cursos();
		curso2.setTitulo("curso javascript");
		curso2.setCargaHoraria(23);
		curso2.setDescricao("Desissscao");
		
		System.out.println(curso1.toString());
		System.out.println(curso2.toString());
		
		Mentorias mentoria1 = new Mentorias();
		mentoria1.setTitulo("Mentoria java");
		mentoria1.setDescricao("Mentoria java descricao");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(mentoria1.toString());

	}

}
