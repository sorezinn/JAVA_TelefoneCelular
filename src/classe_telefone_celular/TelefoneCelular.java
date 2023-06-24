package classe_telefone_celular;

public class TelefoneCelular {

	public static void main(String[] args) {
		AtributosTelefoneCelular celular1 = new AtributosTelefoneCelular("Apple", "Iphone 14 PRO MAX", "Amarelo", 128, true);
		celular1.status();
		System.out.println("");
		AtributosTelefoneCelular celular2 = new AtributosTelefoneCelular("Motorola", "Moto G2 ", "Preto", 2, false);
		celular2.status();

	}

}
