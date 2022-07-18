import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição de mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Deveoper");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMidori = new Dev();
        devMidori.setNome("Midori");
        devMidori.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Midori: " + devMidori.getConteudosInscritos());
        devMidori.progredir();
        System.out.println("Conteúdos inscritos de Midori: " + devMidori.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Midori: " + devMidori.getConteudosConcluidos());
        System.out.println("XP: " + devMidori.calcularTotalXP());

        Dev devSeiti = new Dev();
        devSeiti.setNome("Seiti");
        devSeiti.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Seiti : " + devSeiti.getConteudosInscritos());
        devSeiti.progredir();
        devSeiti.progredir();
        System.out.println("Conteúdos inscritos de Seiti : " + devSeiti.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Seiti: " + devMidori.getConteudosConcluidos());
        System.out.println("XP: " + devSeiti.calcularTotalXP());

    }
}
