package me.helioalbano.springbootlearning.annotations;

public class Funcionario {
    protected double salario;

    @InProgress
    @TODO("O salário total é = salario + bonus")
    @groupTODO(severity = groupTODO.Severity.TRIVIAL,
                item = "O salário total é = salario + bonus",
                assignedTo = "Helio")
    public double getTotalSalario(double bonus) {
        // Implementacao em progress
        return 0;
    }

}
