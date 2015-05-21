import java.io.*;
import java.util.StringTokenizer; 

public class Arquivo {
	
	private static File file;
	
	private static BufferedReader in;
	
	private static final String ARQUIVO_JA_EXISTENTE = "Arquivo jah existente";
	
	public Arquivo(File file) {
		this.file = file;
	}
	
	public static Arquivo abrirEscrita(String arquivo, String operacao) {
		
		if (operacao.equals("new")) {
			file = criar(arquivo, false);
		} else if (operacao.equals("truncate")) {
			file = truncate(criar(arquivo, true));
		} else if (operacao.equals("append")) {
			file = criar(arquivo, true);
		}

		return new Arquivo(file);
	}
	
	public static Arquivo abrirLeitura(String arquivo) {
		return new Arquivo(criar(arquivo, true));
	}
	
	private static File truncate(File path) {

		try {
			RandomAccessFile random = new RandomAccessFile(path, "rw");
			random.setLength(0);
			random.close();
			return path;
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return null;

	}
	
	private static File criar(String path, boolean sobrescreve) {

		File arquivo = null;

		try {

			arquivo = new File(path);
			boolean ehNovo = arquivo.createNewFile();

			if (!ehNovo && !sobrescreve) {
				throw new Exception("error.system");
			}
			
			System.out.println("log - " + arquivo + " >> Arquivo aberto para escrita");

		} catch (Exception e) {
			System.out.println(ARQUIVO_JA_EXISTENTE + ", " + e.toString());
		} 

		return arquivo;
	}
	
	public static void fechar(Arquivo arquivo) {
		System.out.println("log - " + arquivo.file.toString() + " >> Fechando arquivo");
	}
	
	/**
	 * Exclui um arquivo denotado pelo path informado. Se o o path indicar um
	 * diretório, este precisa estar vazio para ser excluido.
	 * 
	 * @param pathName
	 *            o path do arquivo/diretório a ser exclúido
	 * @return <code>true</code> Se o arquivo ou diretório foi excluido com
	 *         sucesso; <code>false</code> caso contrário.
	 * @throws Exception
	 *             Se ocorrer algum erro de permissão para exclusão do arquivo
	 */
	public static boolean excluir(String pathName) {
		
		File arquivo = new File(pathName);
		return excluir(arquivo);
	}

	public static boolean excluir(File arquivo) {

		boolean apagado = false;

		try {
			apagado = arquivo.delete();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return apagado;
	}
	
	public static void escrever(Arquivo arquivo, String conteudo) {
		try {
			FileWriter fw = new FileWriter(arquivo.file.toString(), true);
			conteudo += "\r\n";
			fw.write(conteudo);
			fw.close();
			System.out.println("log - " + arquivo.file.toString() + " >> Texto escrito no arquivo:" + conteudo);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}	
	
	public static String lerLinha(Arquivo arquivo) {
		try {
			if (in == null) {
				in = new BufferedReader(new FileReader(arquivo.file)); 
			} 
			
			String linha = in.readLine();
			System.out.println("log - >> " + linha);
			return linha;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return null;
			
	}
	
	public static String[] separaTokens(String linha, String caracter) {
	
		StringTokenizer token = new StringTokenizer(linha, caracter);  
		String[] valores = new String[2];
		valores[0] = token.nextToken();
		valores[1] = token.nextToken();
		
		return valores;
	}
	
}