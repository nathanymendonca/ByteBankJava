
//contrato Autenticavel
    //quem assinar esse contrato precisa implementar
            //metodo setSenha
            //metodo autentica


public abstract interface Autenticavel  {

     public abstract void setSenha(int senha);

     public abstract boolean autentica(int senha);
	
}

//interface, que � uma classe abstrata, com todos os 
//m�todos abstratos. Dentro de uma interface, n�o h� nada concreto.
//Tem apenas as assinaturas 
