package heranca.pessoa;

public class Projeto {
    public static void main(String[] args) {
        System.out.println("Exemplos");

        Pessoa A = new Pessoa();
        A.DefinirNome("roberto");
        A.DefinirIdade(31);

        Professor B = new Professor();
        B.DefinirFormacao("locutor");
        B.DefinirIdade(71);
        B.DefinirNome("Galvão");

        Aluno C = new Aluno();
        C.DefinirCurso("bcc");
        C.DefinirNome("matheus");
        C.DefinirIdade(20);

    }
}
