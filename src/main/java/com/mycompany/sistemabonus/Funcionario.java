
package com.mycompany.sistemabonus;

/**
 *
 * @author joaox
 */
public class Funcionario {
    
    private int idFuncionario;
    private String nome;
    private double salario;
    private String cargo;
    private Departamento departamento;
    
    
    public Funcionario(int idFuncionario, String nome, double salario, String cargo, Departamento departamento){
        
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
}
    public int getIdFuncionario(){
        return idFuncionario;
    }
    
    public void setIdFuncionario(int idFuncionario){
        this.idFuncionario = idFuncionario;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome= nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public Departamento getDepartamento(){
        return departamento;
    }
    
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
    
    public double calcularBonus(){
        if(this.salario >= 150000){
            return 1000;
        }
        if(this.cargo.equalsIgnoreCase("Gerente")){
            return 1000;
        }
        return 2000;
    }
}
