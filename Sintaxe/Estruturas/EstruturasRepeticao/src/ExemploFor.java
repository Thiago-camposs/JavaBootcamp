public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        //length conta o tamanho do array
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);//índice
        }
    }
}
