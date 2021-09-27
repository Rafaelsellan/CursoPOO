import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TesteCurso {
    private static List<Curso> arrayCursos; 
   public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String ID, nome, hora;
        String op = "0";

        arrayCursos = new ArrayList<Curso>();

        //Forma escrever direto ou seja, sem Scanner
        arrayCursos.add(new Curso("01", "Computação", "1500"));
        arrayCursos.add(new Curso("02", "Moda Ouro", "1000"));
        arrayCursos.add(new Curso("03", "Cozinheiro", "1700"));
        arrayCursos.add(new Curso("04", "Administração", "755"));

        do {
            //Digitando com Scanner
            System.out.println("Digite o Código do Curso");
            ID = ler.nextLine();
            System.out.println("Agora digite o Nome do Curso");
            nome = ler.nextLine();
            System.out.println("Por fim, a Carga Horaria");
            hora = ler.nextLine();
            arrayCursos.add(new Curso(ID, nome, hora));
            System.out.println("Digite 0 para sair ou qualquer outra tecla para continuar...");
            op = ler.nextLine();
        } while (!op.equals("0"));

        //Basicamente ele vai ler todos o itens da ArrayList
        for (Curso curso: arrayCursos) {
            System.out.println(curso);
        }

        ler.close();
    }
}

