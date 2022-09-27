package belaviagem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import belaviagem.model.CadastroViagem;

/**
 * Servlet implementation class cadastrarViagemController
 */
@WebServlet("/cadastrarViagemController")
public class cadastrarViagemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cadastrarViagemController() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		CadastroViagem cadastro = new CadastroViagem();
		
		
		
		
		String mensagem;
		String nome = request.getParameter("nome");
		if (nome != null && !nome.isEmpty()) {
			System.out.println("[BELAVIAGEM_NOMECLIENTE]: " + nome);
			
		}
		String sobrenome = request.getParameter("sobrenome");
		if (sobrenome != null && !sobrenome.isEmpty()) {
			System.out.println("[BELAVIAGEM_SOBRENOMECLIENTE]: " + sobrenome);
			
		}
		String email = request.getParameter("email");
		if (email != null && !email.isEmpty()) {
			System.out.println("[BELAVIAGEM_EMAILCLIENTE]: " + email);
			
		}
		String tel = request.getParameter("tel");
		if (tel != null && !tel.isEmpty()) {
			System.out.println("[BELAVIAGEM_TELEFONECLIENTE]: " + tel);
			
		}
		String qtdAdultos = request.getParameter("qtdAdultos");
		if (qtdAdultos != null && !qtdAdultos.isEmpty()) {
			System.out.println("[BELAVIAGEM_ADULTOCQTDLIENTE]: " + qtdAdultos);
			
		}
		String qtdCriancas = request.getParameter("qtdCriancas");
		if (qtdCriancas != null && !qtdCriancas.isEmpty()) {
			System.out.println("[BELAVIAGEM_CRIANCAQTDCLIENTE]: " + qtdCriancas);
			
		}
		
		
			
			
			mensagem = "Viagem Confirmada!!";
			request.setAttribute("mensagem", mensagem);
			RequestDispatcher dispatcher = request.getRequestDispatcher("viagem.jsp");
			dispatcher.forward(request, response);
		
		String diaPartida = request.getParameter("diaPartida");
		String diaVolta =  request.getParameter("diaVolta");
		System.out.println("[BELAVIAGEM_DIASAIDACLIENTE]: " + diaPartida);
		System.out.println("[BELAVIAGEM_DIAVOLTACLIENTE]: " + diaVolta);

		 String destinoSaida = request.getParameter("destinoSaida");
		 String destinoChegar = request.getParameter("destinoChegar");
		System.out.println("[BELAVIAGEM_LOCALCLIENTE]: " + destinoSaida);
		System.out.println("[BELAVIAGEM_DESTINOCLIENTE]: " + destinoChegar);
		
		cadastro.setNome(nome);
		cadastro.setSobrenome(sobrenome);
		cadastro.setTel(tel);
		cadastro.setEmail(email);
		cadastro.setDiaVolta(diaVolta);
		cadastro.setDestinoChegar(destinoChegar);
		cadastro.setDestinoSaida(destinoSaida);
		cadastro.setDiaVolta(diaVolta);
		cadastro.setDiaPartida(diaPartida);
		cadastro.setQtdCriancas(qtdCriancas);
		cadastro.setQtdAdultos(qtdAdultos);
		cadastro.salvar();
	
	}

}
