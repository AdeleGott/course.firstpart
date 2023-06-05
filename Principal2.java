
public class Principal2 {
	
	public static void main(String[] args) {
		
		Proprietario dono = new Proprietario();
		dono.nome = "Jeremias Adolfo";
		dono.cpf = "832.409.890-81";
		dono.idade = 45;
		dono.endereco = "Rua das Hort�ncias, 45";
		dono.cidade = "Gramado";
		
		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.modelo = "Picanto";
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Azul";
		meuCarro.fabricante = "KIA";
		meuCarro.dono = dono;
		
	}

}
