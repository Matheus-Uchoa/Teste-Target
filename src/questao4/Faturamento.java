package questao4;

public class Faturamento {
	public static void main(String[] args) {
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;

		double total = sp + rj + mg + es + outros;
		System.out.println(total);

		double perc_sp = (sp / total) * 100;
		double perc_rj = (rj / total) * 100;
		double perc_mg = (mg / total) * 100;
		double perc_es = (es / total) * 100;
		double perc_outros = (outros / total) * 100;

		System.out.println("Percentual de representação de cada estado:");
		System.out.println("SP: " + perc_sp + "%");
		System.out.println("RJ: " + perc_rj + "%");
		System.out.println("MG: " + perc_mg + "%");
		System.out.println("ES: " + perc_es + "%");
		System.out.println("Outros: " + perc_outros + "%");

	}
}
