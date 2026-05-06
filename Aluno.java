public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double notaTrabalho;

    public Aluno(String nome, String matricula, double nota1, double nota2, double notaTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + notaTrabalho) / 3;
    }

    public void verificarSituacao() {
        double media = calcularMedia();
        System.out.println("Aluno: " + nome + " | Média: " + media);

        if (media >= 7.0) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        System.out.println("-------------------");
    }
}