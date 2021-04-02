package br.com.superdia.controller;

public class Constants {
	// EJB CONNECTION
	public static final String INITIAL_CONTEXT_FACTORY = "org.jboss.naming.remote.client.InitialContextFactory";
	public static final String PROVIDER_URL = "http-remoting://localhost:8080";
	public static final String SECURITY_PRINCIPAL = "admin";
	public static final String SECURITY_CREDENTIALS = "12345678";
	public static final String EJB_LOOKUP_USER = "ejb:SuperDiaEAR/SuperDia/UsuarioBean!br.com.superdia.sessionbeans.IUsuario";
	public static final String EJB_LOOKUP_PRODUCT = "ejb:SuperDiaEAR/SuperDia/ProdutoBean!br.com.superdia.sessionbeans.IProduto";
	public static final String EJB_LOOKUP_CART = "ejb:SuperDiaEAR/SuperDia/CarrinhoBean!br.com.superdia.sessionbeans.ICarrinho?stateful";
	
	// TITLE UI
	public static final String APPLICATION_NAME = "Superdia Caixa";
	public static final String LOGIN_TITLE = String.format("%s - %s", APPLICATION_NAME, "Login");
	public static final String DASHBOARD_TITLE = String.format("%s - %s", APPLICATION_NAME, "Dashboard");
	public static final String REGISTER_PURCHASE_TITLE = String.format("%s - %s", APPLICATION_NAME, "Cadastrar Compra");
	
	// IMAGE PATH
	public static final String FAVICON = "/assets/favicons/favicon-32x32.png";
	public static final String LOGO_ALT_VERTICAL = "/assets/logos/superdia_logo_alt_vert.png";
	public static final String LOGO = "/assets/logos/superdia_logo.png";
	public static final String CART_IMAGE = "/assets/icons/cart.png";
	public static final String EXIT_IMAGE = "/assets/icons/exit.png";
	
	// LOGIN
	public static final String LABEL_LOGIN = "Login";
	public static final String LABEL_PASSWORD = "Senha";
	public static final String BUTTON_SIGN_IN = "Entrar";
	
	// DASHBOARD
	public static final String[] COLUMNS_PURCHASE_TABLE = {"Nome", "Caixa", "Pre�o", "Status"};
	public static final String MENU = "Menu";
	public static final String EXIT = "Sair";
	public static final String SUPER_DIA_MENU = "Superdia";
	public static final String REGISTER_PURCHASE = "Cadastrar compra";
	
	// REGISTER PURCHASE
	public static final String[] COLUMNS_PRODUCTS_AVAILABLE_TABLE = {"ID", "Produto", "Descri��o", "Quantidade", "Quantidade em Estoque", "Pre�o"};
	public static final String[] COLUMNS_PRODUCTS_PURCHASE_TABLE = {"Produto", "Descri��o", "Quantidade", "Valor", "Valor Total"};
	public static final String AMOUNT = "Quantidade";
	public static final String AVAILABLE_PRODUCTS = "Produtos dispon�veis";
	public static final String SAVE_PURCHASE = "Salvar";
	public static final String BACK_DASHBOARD = "Voltar";
} 
