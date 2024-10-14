package com.mycompany.sistemabonus;

public class SistemaBonus {
    public static void main(String[] args) {
        // Corrigido o tamanho do array de departamentos para 3
        Departamento[] departamentos = new Departamento[3];
        departamentos[0] = new Departamento(1, "Vendas", 50000);
        departamentos[1] = new Departamento(2, "Marketing", 30000);
        departamentos[2] = new Departamento(3, "Gerente", 60000);
        
        // Corrigido o tamanho do array de funcionários para 4
        Funcionario[] funcionarios = new Funcionario[4];
        funcionarios[0] = new Funcionario(1, "Alice", 20000, "Analista", departamentos[0]);
        funcionarios[1] = new Funcionario(2, "Bob", 160000, "Gerente", departamentos[1]);
        funcionarios[2] = new Funcionario(3, "Charlie", 50000, "Analista", departamentos[0]);
        funcionarios[3] = new Funcionario(4, "Ronaldo", 60000, "Gerente", departamentos[1]);

        // Aplicação do bônus
        AnaliseBonus analiseBonus = new AnaliseBonus();
        int resultado = analiseBonus.aplicarBonus(funcionarios, departamentos);
        
        System.out.println("Resultado da aplicação do bônus: " + resultado);

        // Exibe o novo salário de cada funcionário
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + " - Novo Salário: " + funcionario.getSalario());
        }
    }
}

