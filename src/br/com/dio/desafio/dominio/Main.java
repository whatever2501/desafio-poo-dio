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
		
//		System.out.println(curso1.toString());
//		System.out.println(curso2.toString());
		
		Mentorias mentoria1 = new Mentorias();
		mentoria1.setTitulo("Mentoria java");
		mentoria1.setDescricao("Mentoria java descricao");
		mentoria1.setData(LocalDate.now());
		
//		System.out.println(mentoria1.toString());
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp javas");
		bootcamp.setDescricao("Bootcamppp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		
		Devs devCamila = new Devs();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());

		devCamila.progedir();
		System.out.println("-");
		System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
		System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("Camila exp: " +  devCamila.calcularTotalXp());
		
		System.out.println("------------");
		
		Devs devJoao = new Devs();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);	
		
		System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
	
		devJoao.progedir();
		devJoao.progedir();
		devJoao.progedir();
		System.out.println("-");
		System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
		System.out.println("Conteudos concluidos João: " + devJoao.getConteudosConcluidos());
		System.out.println("João exp: " +  devJoao.calcularTotalXp());
		
		
		

	}

}
