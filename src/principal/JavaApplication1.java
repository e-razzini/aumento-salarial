package principal;

import cargo.AumentoSalarial;
import modelo.Funcionario;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        
        f.setNome("Wagner");
        
        System.out.println(f.getNome());
        
        
        AumentoSalarial s = new AumentoSalarial(f);
        
    }
    
}