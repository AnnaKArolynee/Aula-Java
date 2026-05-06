

public class Main{
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", "2023001", 8.0, 7.5, 9.0);
        Aluno aluno2 = new Aluno("Maria", "2023002", 5.0, 6.0, 6.5);

        aluno1.verificarSituacao();
        aluno2.verificarSituacao();
    }
}
