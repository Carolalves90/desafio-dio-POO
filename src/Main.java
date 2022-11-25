import br.com.dio.desafio.dominio.*;

import java.awt.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("descrição curso");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarol = new Dev();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carol: " + devCarol.getConteudosInscritos());
        devCarol.progredir();
        devCarol.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carol: " + devCarol.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Carol: " + devCarol.getConteudosConcluidos());
        System.out.println("XP: "+ devCarol.calcularTotalXp());

        System.out.println("************************");
        Dev devMarcus = new Dev();
        devMarcus.setNome("Marcus");
        devMarcus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcus: " + devMarcus.getConteudosInscritos());
        devMarcus.progredir();
        devMarcus.progredir();
        devMarcus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcus: " + devMarcus.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Marcus: " + devMarcus.getConteudosConcluidos());
        System.out.println("XP: "+ devMarcus.calcularTotalXp());
    }
}