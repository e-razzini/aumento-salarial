package modelo;

public class Funcionario {
 
    private String nome;
    private String sobreNome;
    private String cargo;
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
        this.codCargo = codCargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    

    
    public String getCargo(){
        return this.cargo;
    }
    
    public int getTempServico() {
        return this. tempServico;
    }

    public void setTempServico(int tempServico) {
        this.tempServico = tempServico;
    }
    
   
    
}