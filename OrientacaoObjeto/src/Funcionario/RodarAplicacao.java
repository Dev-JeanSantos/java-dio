package Funcionario;

public class RodarAplicacao {
    public static void main(String[] args) {
       
        //CRIAÇÃO DE OBJETOS (INSTANCIAR)
        Funcionario funcionario = new Funcionario();

        //UPCAST
        
        Funcionario gerente =  new Gerente();
        Funcionario vendedor =  new Vendedor();
        Funcionario faxineiro =  new Faxineiro();
        
        //DOWNCAST
        // Vendedor vendedor_= (Vendedor) new Funcionario();


    }
    
}
