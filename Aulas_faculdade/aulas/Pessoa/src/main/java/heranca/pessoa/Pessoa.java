
package heranca.pessoa;

public class Pessoa {
    private String Nome;
    private int Idade;

    public void DefinirNome(String Nome) {
        this.Nome = Nome;
    }

    public void DefinirIdade(int Idade) {
        this.Idade = Idade;
    }

}

class Professor extends Pessoa {
    private String Formacao;

    public void DefinirFormacao(String Formacao) {
        this.Formacao = Formacao;

    }

}

class Aluno extends Pessoa {
    private String Curso;

    public void DefinirCurso(String Curso) {
        this.Curso = Curso;
    }

}
