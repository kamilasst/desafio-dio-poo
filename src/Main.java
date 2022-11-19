import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = createCurso("Curso java", "Descrição curso java", 8);
        Curso curso2 = createCurso("Curso js", "Descrição curso js", 4);
        Mentoria mentoria = createMentoria("Mentoria de java", "Descrição mentoria java", LocalDate.now());

        Bootcamp bootcamp = createBootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = createDev("Kamila");
        inscreverBootcamp(dev1, bootcamp);
        imprimirMensagem("Conteúdos Inscritos " + dev1.getNome() + " : " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        imprimirMensagem("-");
        imprimirMensagem("Conteúdos Inscritos " + dev1.getNome() + " : " + dev1.getConteudosInscritos());
        imprimirMensagem("Conteúdos Concluídos " + dev1.getNome() + " : " + dev1.getConteudosConcluidos());
        imprimirMensagem("XP:" + dev1.calcularTotalXp());

        imprimirMensagem("-------");

        Dev dev2 = createDev("Joao");
        inscreverBootcamp(dev2, bootcamp);
        imprimirMensagem("Conteúdos Inscritos " + dev2.getNome() + " : " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        imprimirMensagem("-");
        imprimirMensagem("Conteúdos Inscritos " + dev2.getNome() + " : " + dev2.getConteudosInscritos());
        imprimirMensagem("Conteúdos Concluidos " + dev2.getNome() + " : " + dev2.getConteudosConcluidos());
        imprimirMensagem("XP:" + dev2.calcularTotalXp());

    }

    private static Curso createCurso(String titulo, String descricao, int cargaHoraria) {
        Curso curso = new Curso();
        curso.setTitulo(titulo);
        curso.setDescricao(descricao);
        curso.setCargaHoraria(cargaHoraria);
        return curso;
    }

    private static Mentoria createMentoria(String titulo, String descricao, LocalDate data) {
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(titulo);
        mentoria.setDescricao(descricao);
        mentoria.setData(data);
        return mentoria;
    }

    private static Bootcamp createBootcamp(String nome, String descricao) {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(nome);
        bootcamp.setDescricao(descricao);
        return bootcamp;
    }

    private static Dev createDev(String nome) {
        Dev nomeDev = new Dev();
        nomeDev.setNome(nome);
        return nomeDev;
    }

    private static void inscreverBootcamp(Dev dev1, Bootcamp bootcamp) {
        dev1.inscreverBootcamp(bootcamp);
    }

    private static void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
