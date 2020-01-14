package br.com.gft.model;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private Double preco;

	public Veiculo() {
		this.marca = "";
		this.modelo = "";
		this.placa = "";
		this.cor = "";
		this.km = 0;
		this.isLigado = false;
		this.litrosCombustivel = 10;
		this.velocidade = 0;
		this.preco = 15000.0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean getisLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void acelerar() {
		if (this.isLigado == true) {
			this.velocidade += 20;
			this.litrosCombustivel -= 1;
			System.out.println("Você acelerou. A velocidade atual é de " + this.velocidade + " quilometros por hora");
			System.out.println("O carro tem " + this.litrosCombustivel + " litros de combustível");
		} else {
			System.out.println("Não é possivel acelerar com o carro desligado");
		}
	}

	public void abastecer(int qtdLitros) {
		if (this.litrosCombustivel >= 100) {
			this.litrosCombustivel = 100;
		} else {
			this.litrosCombustivel += qtdLitros;
			if (this.litrosCombustivel >= 100) {
				this.litrosCombustivel = 100;
			}
		}
		System.out.println("Você abasteceu. O carro agora tem " + this.litrosCombustivel + " litros de combustível");
	}

	public void frear() {
		if (this.isLigado == true) {
			if (this.velocidade > 10) {
				this.velocidade -= 10;
			} else {
				if (this.velocidade <= 10) {
					System.out.println("Carro parado");
				}
			}
		} else {
			System.out.println("Carro desligado");
		}
		System.out.println("Você freou. A velocidade atual é de " + this.velocidade + " quilometros por hora");
	}

	public void pintar(String cor) {
		System.out.println("Você pintou seu carro de " + cor);
	}

	public void ligar() {
		if (this.isLigado == true) {
			System.out.println("O carro já está ligado");
		} else {
			this.isLigado = true;
			System.out.println("Você ligou o carro.");
		}
	}

	public void desligar() {
		if (this.isLigado == false) {
			System.out.println("O carro está desligado");
		} else {
			this.isLigado = false;
			System.out.println("Você desligou o carro");
		}
	}
}