package questao3;

public class Distribuidora {

	public static void main(String[] args) {
		double[] faturamentoDiario = { 1000, 2000, 500, 1500, 3000, 0, 0, 2500, 1200, 1800, 900, 600, 800, 1000, 2000,
				2500, 1500, 3500, 2000, 3000, 0, 1000, 500, 2500, 2000, 1500, 1200, 1800, 2200, 900 };

		double somaFaturamento = 0;
		int qtdDias = 0;
		double menorFaturamento = Double.MAX_VALUE;
		double maiorFaturamento = Double.MIN_VALUE;

		for (int i = 0; i < faturamentoDiario.length; i++) {
			if (faturamentoDiario[i] > 0) { // considera apenas dias com faturamento
				somaFaturamento += faturamentoDiario[i];
				qtdDias++;

				if (faturamentoDiario[i] < menorFaturamento) {
					menorFaturamento = faturamentoDiario[i];
				}

				if (faturamentoDiario[i] > maiorFaturamento) {
					maiorFaturamento = faturamentoDiario[i];
				}
			}
		}

		double mediaMensal = somaFaturamento / qtdDias;
		int qtdDiasAcimaMedia = 0;

		for (int i = 0; i < faturamentoDiario.length; i++) {
			if (faturamentoDiario[i] > mediaMensal) {
				qtdDiasAcimaMedia++;
			}
		}

		System.out.println("Menor faturamento diário: R$" + menorFaturamento);
		System.out.println("Maior faturamento diário: R$" + maiorFaturamento);
		System.out.println("Número de dias com faturamento acima da média mensal: " + qtdDiasAcimaMedia);
	}
}