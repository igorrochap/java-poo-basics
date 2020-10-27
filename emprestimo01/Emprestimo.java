package emprestimo01;

public class Emprestimo {
    float s, j, p;         // s = valor da primeira parcela
    int n, corrente;       // n = numero de parcelas
                           // p = ṕarcela
                           // j = percentual de juros mensal 

    Emprestimo(float s, int n, float j){
        this.s = s;
        this.n = n;
        this.j = j;
        corrente = 1;
        this.p = s;
    }

    float proximaParcela(){
        float ret = p;
        corrente++;
        if(corrente <= n)
            p = p + (p * j/100);
        else
            p = 0;
        return ret;
    }
}
