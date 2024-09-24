package com.mycompany.sistemabonus;

public class AnaliseBonus {

    public int aplicarBonus(Funcionario[] funcionarios, Departamento[] departamentos) {
        
        if (funcionarios == null || funcionarios.length == 0 || 
            departamentos == null || departamentos.length == 0) {
            return 1; 
        }

        
        double maiorValorVendas = 0;
        for (Departamento departamento : departamentos) {
            if (departamento.getValorVendas() > maiorValorVendas) {
                maiorValorVendas = departamento.getValorVendas();
            }
        }

        boolean algumFuncionarioElegivel = false;
        for (Funcionario funcionario : funcionarios) {
            if (verificarElegibilidade(funcionario, departamentos, maiorValorVendas)) {
                double bonus = funcionario.calcularBonus();
                funcionario.setSalario(funcionario.getSalario() + bonus);
                algumFuncionarioElegivel = true;
            }
        }

        
        if (!algumFuncionarioElegivel) {
            return 2; 
        }

        return 0; 
    }

    public boolean verificarElegibilidade(Funcionario funcionario, Departamento[] departamentos, double maiorValorVendas) {
       
        for (Departamento departamento : departamentos) {
            if (departamento.getValorVendas() == maiorValorVendas && 
                funcionario.getDepartamento().getIdDepartamento() == departamento.getIdDepartamento()) {
                return true; 
            }
        }
        return false; 
    }
}
