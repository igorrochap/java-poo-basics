package emprestimo01;

public class ConjuntoEmprestimos {
    int max; //numero maximo de emprestimos
    Emprestimo emprestimos[];

    ConjuntoEmprestimos(int max){
        this.max = max;
        emprestimos = new Emprestimo[max];
    }

    void addEmprestimo(Emprestimo emprestimo){
        int slot = 0;
        boolean full = false;
        for(int i = 0; i < max; i++){
            if(emprestimos[i] == null){
                slot = i;
                break;
            }

            if(i == (max-1)){
                full = true;
            }
        }
        if(full)
            System.out.println("Limite do array excedido, só os " + max + " primeiros foram inseridos");
        else
            emprestimos[slot] = emprestimo;
    }

    void proximasParcelas(){
        boolean exists = true;
        int i = 1;
        while(exists){
            exists = false;
            for(int j = 0; j < max; j++){
                float parcela = emprestimos[j].proximaParcela();
                if(parcela > 0){
                    exists = true;
                    System.out.println("A parcela " + i + " do emprestimo " + (j+1) + " é de " + parcela);
                }
            }

            i++;
        }
    }
}
