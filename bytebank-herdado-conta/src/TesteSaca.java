
public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);
        try {
        conta.saca(210.0);
        } catch(Exception ex ) {
        	System.out.println("Ex: "+ ex.getMessage());
        }
        System.out.println(conta.getSaldo());
    
    }
}


//Essa exce��o come�ou no m�todo saca() da Conta.
//Depois, passou pelo m�todo saca() da classe filha
//ContaCorrente, que tamb�m n�o foi resolvido. 
//Por fim, passou pelo m�todo main(), no qual n�o foi resolvido.

//Agora, nos resta fazer o tratamento usando try-catch e
//usar uma exce��o do tipo checked, pois do jeito que est� agora,
//o compilador n�o nos obriga a fazer um tratamento.