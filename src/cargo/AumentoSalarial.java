package cargo;

import modelo.Funcionario;

public class AumentoSalarial {

    private Funcionario func;

    public AumentoSalarial(Funcionario func) {
        this.func = func;
    }
    
    public String getCargo(){
        
        int codCargo =this.func.getCodCargo();
        String descricao ="";
        if (codCargo == 101) {
           descricao ="Gerente" ;
        } else if (codCargo == 102) {
          descricao ="Engenheiro" ;
        } else if (codCargo == 103) {
            descricao ="Tecnico" ;
        } else {
            descricao ="não cadastrado" ;
        }
        
        return descricao;
        
    }

    public double calcularAumento() {
        
        double novoSalario = 0;
        int codCargo = this.func.getCodCargo();
        
        if (codCargo == 101) {
            novoSalario = this.calcGerente();
        } else if (codCargo == 102) {
            novoSalario = this.calcEngenheiro();
        } else if (codCargo == 103) {
            novoSalario = this.calcTecnico();
        } else {
            novoSalario = this.calcGeral();
        }
        
        return novoSalario;
    }

    private double calcGerente() {

        int tempo = this.func.getTempServico();
        double percentual = 0;

        if (tempo >= 1 & tempo < 2) {
            percentual = 10;
        } else if (tempo <= 3) {
            percentual = 20;
        } else {
            percentual = 25;
        }

        double salario = this.func.getSalario();

        double novoSalario = (salario * percentual) / 100;
        novoSalario = salario + novoSalario;

        return novoSalario;
    }

    private double calcEngenheiro() {

        int tempo = this.func.getTempServico();
        double percentual = 0;

        if (tempo >= 1 & tempo < 2) {
            percentual = 15;
        } else if (tempo <= 3) {
            percentual = 30;
        } else {
            percentual = 35;
        }

        double salario = this.func.getSalario();

        double novoSalario = (salario * percentual) / 100;
        novoSalario = salario + novoSalario;

        return novoSalario;

    }

    private double calcTecnico() {
        int tempo = this.func.getTempServico();
        double percentual = 0;

        if (tempo >= 1 & tempo < 2) {
            percentual = 5;
        } else if (tempo <= 3) {
            percentual = 10;
        } else {
            percentual = 15;
        }

        double salario = this.func.getSalario();

        double novoSalario = (salario * percentual) / 100;
        novoSalario = salario + novoSalario;

        return novoSalario;
    }

    private double calcGeral() {

        int tempo = this.func.getTempServico();
        double percentual = 0;

        if (tempo >= 3) {
            percentual = 35;
        }

        double salario = this.func.getSalario();

        double novoSalario = (salario * percentual) / 100;
        novoSalario = salario + novoSalario;

        return novoSalario;
    }

}