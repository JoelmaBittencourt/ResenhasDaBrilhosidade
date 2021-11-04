package br.com.joelma.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;






	@Entity
	@Table(name = "usuario")
	public class Usuario {


		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		public Long cpf;

		@NotBlank
		@Size(min = 3, max = 30)
		private String nome;

		@NotBlank
		@Size(min = 3, max = 100)
		private String email;

		@NotBlank
		@Size(min = 3, max = 50)
		private String logincpf;

		@NotBlank
		private String senha;

		@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
		@JsonIgnoreProperties("usuario")
		private List<Postagem> postagem;
		
		
		public Usuario(Long id, Long cpf, @NotBlank @Size(min = 3, max = 30) String nome,
				@NotBlank @Size(min = 3, max = 100) String email, @NotBlank @Size(min = 3, max = 50) String logincpf,
				@NotBlank String senha, List<Postagem> postagem) {
			super();
			this.id = id;
			this.cpf = cpf;
			this.nome = nome;
			this.email = email;
			this.logincpf = logincpf;
			this.senha = senha;
			this.postagem = postagem;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public Long getCpf() {
			return cpf;
		}


		public void setCpf(Long cpf) {
			this.cpf = cpf;
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


		public String getLogincpf() {
			return logincpf;
		}


		public void setLogincpf(String logincpf) {
			this.logincpf = logincpf;
		}


		public String getSenha() {
			return senha;
		}


		public void setSenha(String senha) {
			this.senha = senha;
		}


		public List<Postagem> getPostagem() {
			return postagem;
		}


		public void setPostagem(List<Postagem> postagem) {
			this.postagem = postagem;
		}


		@Override
		public int hashCode() {
			return Objects.hash(id);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Usuario other = (Usuario) obj;
			return Objects.equals(id, other.id);
		}

	}