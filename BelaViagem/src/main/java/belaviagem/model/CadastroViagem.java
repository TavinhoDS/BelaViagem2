package belaviagem.model;

public class CadastroViagem {

	private int idDestino;
	private String nome;
	private String sobrenome;
	private String email;
	private String tel;
	private String destinoSaida;
	private String destinoChegar;
	private String diaPartida;
	private String diaVolta;
	private String qtdAdultos;
	private String qtdCriancas;

	public CadastroViagem() {
		
	}
	
	
	
	public CadastroViagem(String nome, String sobrenome, String email, String tel, String destinoSaida, String destinoChegar,
			String diaPartida, String diaVolta, String qtdAdultos, String qtdCriancas) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.tel = tel;
		this.destinoSaida = destinoSaida;
		this.destinoChegar = destinoChegar;
		this.diaPartida = diaPartida;
		this.diaVolta = diaVolta;
		this.qtdAdultos = qtdAdultos;
		this.qtdCriancas = qtdCriancas;
	}



	public CadastroViagem(int idDestino, String nome, String sobrenome, String email, String tel, String destinoSaida, String destinoChegar, String diaPartida, String diaVolta, String qtdAdultos, String qtdCriancas) {
		this.idDestino = idDestino;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.tel = tel;
		this.destinoSaida = destinoSaida;
		this.destinoChegar = destinoChegar;
		this.diaPartida = diaPartida;
		this.diaVolta = diaVolta;
		this.qtdAdultos = qtdAdultos;
		this.qtdCriancas = qtdCriancas;
		
	}
	
	public int getIdDestino() {
		return this.idDestino;
	}
	
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getDestinoSaida() {
		return destinoSaida;
	}



	public void setDestinoSaida(String destinoSaida) {
		this.destinoSaida = destinoSaida;
	}



	public String getDestinoChegar() {
		return destinoChegar;
	}



	public void setDestinoChegar(String destinoChegar) {
		this.destinoChegar = destinoChegar;
	}



	public String getDiaPartida() {
		return diaPartida;
	}



	public void setDiaPartida(String diaPartida) {
		this.diaPartida = diaPartida;
	}



	public String getDiaVolta() {
		return diaVolta;
	}



	public void setDiaVolta(String diaVolta) {
		this.diaVolta = diaVolta;
	}



	public String getQtdAdultos() {
		return qtdAdultos;
	}



	public void setQtdAdultos(String qtdAdultos) {
		this.qtdAdultos = qtdAdultos;
	}



	public String getQtdCriancas() {
		return qtdCriancas;
	}



	public void setQtdCriancas(String qtdCriancas) {
		this.qtdCriancas = qtdCriancas;
	}
	
	public void salvar() {
		System.out.println("[BELAVIAGEM]: Atributos da Classe Salva!!");
	}
	
}

