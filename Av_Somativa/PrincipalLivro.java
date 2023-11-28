package Av_Somativa;

public class PrincipalLivro {

	public static void main(String[] args) {

		Livro livro = new Livro("Memórias De Brás Cubas","Machado De Assis",220);

		System.out.println("Autor:" + livro.getAutor());
		System.out.println("Nome do Livro:" + livro.getNome());
		System.out.println("Páginas:"+ livro.getPaginas());

	}

}
