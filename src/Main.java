import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Mentorias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cursos cursos1 = new Cursos();
        cursos1.setTitulo("curso Java");
        cursos1.setDescricao("descrição curso java");
        cursos1.setCargaHoraria(8);



        Cursos cursos2 = new Cursos();
        cursos2.setTitulo("curso Javascript");
        cursos2.setDescricao("descrição curso js");
        cursos2.setCargaHoraria(4);

        Mentorias mentorias = new Mentorias();
        mentorias.setTitulo("mentoria de java");
        mentorias.setDescricao("descrição mentoria java");
        mentorias.setData(LocalDate.now());

        System.out.println(cursos1);
        System.out.println(cursos2);
        System.out.println(mentorias);

    }
}