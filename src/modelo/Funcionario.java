package modelo;

public class Funcionario {
 
    private String nome;
    private String sobreNome;
    private double salario;
    private int codCargo;
    private int tempServico;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return this.sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodCargo() {
        return this.codCargo;
    }

    public void setCodCargo(int codCargo) {
        String aux ="";
        
        switch (this.codCargo){
            case 101:
                aux ="Gerente";
                break;
            case 102:
                aux ="Engenheiro";
                break;
            case 103:
            aux ="Techenico";
                
        }
            
        
        this.codCargo = codCargo;
    }

    public int getTempServico() {
        return this. tempServico;
    }

    public void setTempServico(int tempServico) {
        this.tempServico = tempServico;
    }
    
   
    
}