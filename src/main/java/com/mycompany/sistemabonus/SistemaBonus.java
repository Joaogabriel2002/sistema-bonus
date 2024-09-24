
package com.mycompany.sistemabonus;

/**
 *
 * @author joaox
 */
public class SistemaBonus {
    public static void main(String[] args) {
        Departamento[] departamentos = new Departamento[2];
        departamentos[0] = new Departamento(1, "Vendas", 50000);
        departamentos[1] = new Departamento(2, "Marketing", 30000);
        departamentos[3] = new Departamento(3, "Gerente", 60000);
        
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Funcionario(1, "Alice", 20000, "Analista", departamentos[0]);
        funcionarios[1] = new Funcionario(2, "Bob", 160000, "Gerente", departamentos[1]);
        funcionarios[2] = new Funcionario(3, "Charlie", 50000, "Analista", departamentos[0]);
        funcionarios[3] = new Funcionario(4, "Ronaldo", 60000, "Gerente", departamentos[1]);

   
        AnaliseBonus AnaliseBonus = new AnaliseBonus();
        int resultado = AnaliseBonus.aplicarBonus(funcionarios, departamentos);
        
        
        System.out.println("Resultado da aplicação do bônus: " + resultado);

      
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + " - Novo Salário: " + funcionario.getSalario());
        }
    }
}

