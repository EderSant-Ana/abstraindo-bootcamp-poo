package dominio;

import java.time.LocalDate;

public class Principal {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso Java");
		curso1.setCargaHoraria(10);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso C#");
		curso2.setDescricao("descrição curso C#");
		curso2.setCargaHoraria(10);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev eder = new Dev();
		eder.setNome("Eder");
		eder.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos " + eder.getNome() + " " + eder.getConteudosInscrito());
		eder.progredir();
		eder.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos " + eder.getNome() + " " + eder.getConteudosInscrito());
		System.out.println("Conteúdos Concluídos " + eder.getNome() + " " + eder.getConteudosConcluido());
		System.out.println("XP: " + eder.calcularTotalXp());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		
		Dev rosana = new Dev();
		rosana.setNome("Rosana");
		rosana.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos " + rosana.getNome() + " " + rosana.getConteudosInscrito());
		rosana.progredir();
		rosana.progredir();
		rosana.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos " + rosana.getNome() + " " + rosana.getConteudosInscrito());
		System.out.println("Conteúdos Concluídos " + rosana.getNome() + " " + rosana.getConteudosConcluido());
		System.out.println("XP: " + rosana.calcularTotalXp());
		
		
	}
}
