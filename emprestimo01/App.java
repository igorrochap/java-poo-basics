package emprestimo01;

public class App {
    public static void main(String[] args) {
        int max = 5;
        Emprestimo emp = new Emprestimo(100, 5, 7);
        Emprestimo emp2 = new Emprestimo(750, 10, 4);
        Emprestimo emp3 = new Emprestimo(280, 3, 6);
        Emprestimo emp4 = new Emprestimo(1500, 7, 2);
        Emprestimo emp5 = new Emprestimo(2000, 15, 8);
        ConjuntoEmprestimos cj = new ConjuntoEmprestimos(max);

        cj.addEmprestimo(emp);
        cj.addEmprestimo(emp2);
        cj.addEmprestimo(emp3);
        cj.addEmprestimo(emp4);
        cj.addEmprestimo(emp5);
        
        cj.proximasParcelas();
    }
}
