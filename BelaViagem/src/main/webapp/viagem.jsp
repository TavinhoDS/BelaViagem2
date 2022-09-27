<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agende sua viagem|BelaViagem+</title>

<link rel="stylesheet" href="assets/style.css">
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
         integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body class="viagem-body">
<header class="menu3">
        <div class="menu3-logo">
            <img src="assets/img/logo.png" alt="">
            <h4>BelaViagem+</h4>
        </div>
            <a href="index.jsp">Home</a>
    </header>

    <main>
        
        <section class="viagem">
            <div class="viagem-text">
                <h2>Escolha o destino que deseja</h2>
                <h5>Escolha o destino e o dia da sua viagem <br>
                e clique em confirmar.</h5>
             <div>
            <%
            String mensagem = (String) request.getAttribute("mensagem");
            if(mensagem!=null)
            	out.print(mensagem);
            %>
            </div>
            </div>
            <form class="viagem-form" action="cadastrarViagem" method="post">
                <div class="infos-pessoais">
                    <div class="nome-sobre">
                        <label for="nome">Nome:</label>
                        <input type="text" name="nome" id="">
                        <label for="sobrenome">Sobrenome:</label>
                        <input type="text" name="sobrenome" id="">
                    </div>
                    <div class="email-tel">
                        <label for="email">Email:</label>
                        <input type="email" name="email" id="">
                        <label for="telefone">Celular:</label>
                        <input type="tel" name="tel" id="">
                    </div>
                </div>
                <div class="escolha-destino">
                    <h3>Escolha seu Destino</h3>
                    <label for="destinoSaida">De:</label>
                    <select class="select-destino" name="destinoSaida" id="">
                        <option value="bahia">Bahia</option>
                        <option value="ceara">Ceará</option>
                        <option value="parana">Paraná</option>
                        <option value="portoalegre">Porto Alegre</option>
                        <option value="saopaulo">São Paulo</option>
                        <option value="riodejaneiro">Rio de Janeiro</option>
                        <option value="minasgerais">Minas Gerais</option>
                        <option value="riograndedosul">Rio Grande Do Sul</option>
                        <option value="pernambuco">Pernambuco</option>
                        <option value="sergipe">Sergipe</option>
                        <option value="goias">Goiás</option>
                        <option value="piaui">Piauí</option>
                    </select>
                    <label for="destinoChegar">Para:</label>
                    <select class="select-destino" name="destinoChegar" id="">
                        <option value="alemanha">Alemanha</option>
                        <option value="holanda">Holanda</option>
                        <option value="japao">Japão</option>
                        <option value="suica">Suiça</option>
                        <option value="franca">França</option>
                        <option value="italia">Italia</option>
                        <option value="espanha">Espanha</option>
                        <option value="reinounido">Reino Unido</option>
                        <option value="egito">Egito</option>
                        <option value="estadosunidos">Estados Unidos</option>
                        <option value="irlanda">Irlanda</option>
                        <option value="grecia">Grécia</option>
                        <option value="canada">Canadá</option>
                        <option value="emiradosarabe">Emirados Àrabes Unidos</option>
                        <option value="salvador">Salvador</option>
                        <option value="fortaleza">Fortaleza</option>
                        <option value="fozdoiguacu">Foz do Iguaçu</option>
                        <option value="gramado">Gramado</option>
                        <option value="saopaulo">São Paulo</option>
                        <option value="copacabana">Copacabana</option>
                    </select>
                </div>
                <div class="data-qtd">
                    <div class="datas-form">
                        <label for="diaPartida">Partida:</label>
                        <input class="date-destino" type="date" name="diaPartida" id="">
                        <label for="diaVolta">Volta:</label>
                        <input class="date-destino" type="date" name="diaVolta" id="">
                    </div>
                    <div class="qtd-pessoas">
                        <label for="qtdAdultos">Adultos:</label>
                        <input class="pessoas-destino" type="number" name="qtdAdultos" id="">
                        <label for="qtdCriancas">Crianças:</label>
                        <input class="pessoa-destino" type="number" name="qtdCriancas" id="">
                    </div>
                </div>
               <input class="btn-form" id="cadastroButton" type="submit" name="salvar"
					value="Confirmar">
                
            </form>
            
           
        </section>
    </main>



    
    <footer class="bela-footer">
        <div class="bela-footer-logo">
            <img src="assets/img/logo.png" alt="">
            <h2>BelaViagem<span>+</span></h2>
            <p>©&nbsp; 2022 BelaViagem+|RecodePRO feito por Otávio Duarte Sá</p> 
        </div>
        <div class="bela-footer-redes">
            <a class="button-linke" target="_blank" href="https://www.linkedin.com/in/ot%C3%A1vio-duarte-s%C3%A1-8643891ab/"><img src="assets/assets/img/linkedin.png" alt=""></a>
            <a class="button-git" target="_blank" href="https://github.com/TavinhoDS"><img src="assets/img/github.png" alt=""></a>
        </div>
    </footer>
        

</body>
</html>