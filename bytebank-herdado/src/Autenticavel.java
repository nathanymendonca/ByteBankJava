
//contrato Autenticavel
    //quem assinar esse contrato precisa implementar
            //metodo setSenha
            //metodo autentica


public abstract interface Autenticavel  {

     public abstract void setSenha(int senha);

     public abstract boolean autentica(int senha);
	
}

//interface, que é uma classe abstrata, com todos os 
//métodos abstratos. Dentro de uma interface, não há nada concreto.
//Tem apenas as assinaturas 
