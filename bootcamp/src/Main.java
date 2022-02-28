import br.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[]args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT Java");
        bootcamp.setDescricao("Bootcamp Java para vaga em estágio na GFT");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("------------"+bootcamp.getNome()+"----------------");
        System.out.println(bootcamp.getDescricao());
        System.out.println("Data de ínicio: "+bootcamp.getDataInicial());
        System.out.println("Data de termíno: "+bootcamp.getDataFinal());
        System.out.println("----------------------------------------------------");

        Dev dev = new Dev();
        dev.setNome("Guilherme");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de "+dev.getNome()+": "+dev.getConteudosInscrito());
        dev.progredir();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos de "+dev.getNome()+": "+dev.getConteudosInscrito());
        System.out.println("Conteúdos Concluidos de "+dev.getNome()+": "+dev.getConteudosConcluido());
        dev.calcularXp();
        System.out.println("XP: "+dev.calcularXp());
        dev.progredir();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos de "+dev.getNome()+": "+dev.getConteudosInscrito());
        System.out.println("Conteúdos Concluidos de "+dev.getNome()+": "+dev.getConteudosConcluido());
        dev.calcularXp();
        System.out.println("XP: "+dev.calcularXp());
        dev.progredir();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos de "+dev.getNome()+": "+dev.getConteudosInscrito());
        System.out.println("Conteúdos Concluidos de "+dev.getNome()+": "+dev.getConteudosConcluido());
        dev.calcularXp();
        System.out.println("XP: "+dev.calcularXp());

        System.out.println("--------------------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("João Ninguém");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de "+dev2.getNome()+":" +dev2.getConteudosInscrito());
        dev2.progredir();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos de "+dev2.getNome()+":" +dev2.getConteudosInscrito());
        System.out.println("Conteúdos Concluidos de "+dev2.getNome()+":" +dev2.getConteudosConcluido());
        dev2.calcularXp();
        System.out.println("XP: "+dev2.calcularXp());


        System.out.println("------------"+bootcamp.getNome()+"----------------");
        System.out.println(bootcamp.getDescricao());
        System.out.println("Devs inscritos: "+bootcamp.getDevsInscritos());
        System.out.println("Data de ínicio: "+bootcamp.getDataInicial());
        System.out.println("Data de termíno: "+bootcamp.getDataFinal());
        System.out.println("----------------------------------------------------");



    }
}
