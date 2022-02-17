package exercicio2;

import java.time.LocalDate;
import java.util.Scanner;

public class Premiacao {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe A Meta de Faturamento da Empresa no Ano Anterior :");
		Double metaDeFaturamento = sc.nextDouble();
		
		System.out.println("Qual Foi o Faturamento Obtido Pela Empresa No Ano Anterior?");
		Double faturamentoObtido = sc.nextDouble();
		
		System.out.println("Informe a Média Salarial Do Funcionario no Ano Anterior:");
		Double mediaSalarialDoFuncionario = sc.nextDouble();
		
		Boolean faturamentoRealMaiorOuIgualAMetaDeFaturamento = faturamentoObtido >= metaDeFaturamento;
		Boolean faturamentoMaiorOuIgualAOitentaPorcentoDaMetaDeFaturamento = faturamentoObtido >= metaDeFaturamento * 0.8;
		
		Double bonusSalarial = mediaSalarialDoFuncionario;
		Double salarioDeFuncionarioComBonus = 0.0;
		
		if(faturamentoRealMaiorOuIgualAMetaDeFaturamento) {
			salarioDeFuncionarioComBonus = mediaSalarialDoFuncionario + bonusSalarial;
			System.out.println("Salario de Funcionario Com o Bonus de 100% de Sua Média Salarial: " + salarioDeFuncionarioComBonus);
			
		}else if (faturamentoMaiorOuIgualAOitentaPorcentoDaMetaDeFaturamento) {
			salarioDeFuncionarioComBonus = mediaSalarialDoFuncionario + bonusSalarial * 0.8;
			System.out.println("Salario de Funcionario Com o Bonus de 80% de Sua Media Salarial: " + salarioDeFuncionarioComBonus);
		}else {
			System.out.println("Funcionario Não Recebeu Bônus");
		}
		
	}

}
