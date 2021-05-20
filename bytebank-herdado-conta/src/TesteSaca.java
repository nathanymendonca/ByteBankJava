
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


//Essa exceção começou no método saca() da Conta.
//Depois, passou pelo método saca() da classe filha
//ContaCorrente, que também não foi resolvido. 
//Por fim, passou pelo método main(), no qual não foi resolvido.

//Agora, nos resta fazer o tratamento usando try-catch e
//usar uma exceção do tipo checked, pois do jeito que está agora,
//o compilador não nos obriga a fazer um tratamento.