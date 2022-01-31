package dominio;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso.setTitulo("Curso C#");
        curso.setDescricao("descrição curso C#");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Aluno eder = new Aluno();
        eder.setNome("Eder");
        eder.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Eder" + eder.getConteudosInscrito());
        eder.progredir();
        System.out.println("__________");
        System.out.println("Conteúdos Inscritos Rodrigo" + eder.getConteudosInscrito());
        System.out.println("Conteúdos Concluídos Rodrigo" + eder.getConteudosConcluido());
        System.out.println("XP: " + eder.calcularTotalXp());


        Aluno bruna = new Aluno();
        bruna.setNome("Bruna");
        bruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruna" + bruna.getConteudosInscrito());
        bruna.progredir();
        bruna.progredir();
        bruna.progredir();
        System.out.println("__________");
        System.out.println("Conteúdos Inscritos Bruna" + bruna.getConteudosInscrito());
        System.out.println("Conteúdos Concluídos Bruna" + bruna.getConteudosConcluido());
        System.out.println("XP: " + bruna.calcularTotalXp());


    }
}
