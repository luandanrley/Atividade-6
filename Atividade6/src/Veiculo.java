
public class Veiculo implements Motor, Carro, Tanque {

	private boolean abastecer;
	private int porcentagem;
	private String marca; 
	private int quantRodas;

	public Veiculo(String marca, int quantRodas) {
		this.setAbastecido(false);
		this.setMarca(marca);
		this.setQuantRodas(4);
		this.setPorcentagem(0);
	}

	@Override
	public void abastecer() {
		System.out.println("Tanque abastecido!");
		this.setAbastecido(true);
		this.setPorcentagem(100);
	}

	@Override
	public int porcentagem() {
		return this.getPorcentagem();
	}

	@Override
	public String getModeloCarro() {
		return "Sedan";
	}

	@Override
	public String getTipoGol() {
		return "Carro";
	}

	@Override
	public String getModeloMotor() {
		return "Modelo do motor: 1.6 flex";
	}

	@Override
	public String getPotencia() {
		return "101/104 cavalos e 15,4/15,6 kgfm de torque";
	}

	public boolean getAbastecido() {
		return abastecer;
	}

	public void setAbastecido(boolean abastecido) {
		this.abastecer = abastecido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuantRodas() {
		return quantRodas;
	}

	public void setQuantRodas(int quantRodas) {
		this.quantRodas = quantRodas;
	}

	public int getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}

	@Override
	public String toString() {
		return "[Tanque em = " + porcentagem + "%" + ", marca = " + marca
				+ ", quantidade de Rodas = " + quantRodas + "]";
	}
}
