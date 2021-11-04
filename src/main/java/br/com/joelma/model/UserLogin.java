package br.com.joelma.model;

public class UserLogin {

		
		private String nome;
		
		private String email;
		
		private String loginCpf;
		
		private String senha;
		
		private String token;

		
		
		public UserLogin(String nome, String email, String loginCpf, String senha, String token) {
			super();
			this.nome = nome;
			this.email = email;
			this.loginCpf = loginCpf;
			this.senha = senha;
			this.token = token;
		}


		public String getNome() {
			return nome;
		}

		
		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getLoginCpf() {
			return loginCpf;
		}

		public void setLoginCpf(String loginCpf) {
			this.loginCpf = loginCpf;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}
		
		
}
