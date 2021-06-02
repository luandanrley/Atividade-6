import java.sql.SQLOutput;

public class Main {

	public static void main(String[] args) {

			Veiculo veiculo = new Veiculo("Gol",4);
		
			System.out.println(veiculo.getTipoGol());
			System.out.println("Modelo: " + veiculo.getModeloCarro());
			veiculo.abastecer();
			System.out.println(veiculo.toString());
			System.out.println(veiculo.getModeloMotor());
			System.out.println("Potencia do motor: " + veiculo.getPotencia());

		
	}

}
