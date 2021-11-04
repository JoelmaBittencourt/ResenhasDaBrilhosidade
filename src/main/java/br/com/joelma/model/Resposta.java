package br.com.joelma.model;


	import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@Entity
	public class Resposta {

		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private String mensagem;

		
		private LocalDateTime dataCriacao = LocalDateTime.now();
		

		
		private Boolean solucao = false;


		@ManyToOne(fetch = FetchType.EAGER)
		@JsonIgnoreProperties("postagem")
		private Postagem postagem;
		
		@ManyToOne(fetch = FetchType.EAGER)
		@JsonIgnoreProperties("usuario")
		private Usuario usuario;
		

		
		public Resposta(Long id, String mensagem, LocalDateTime dataCriacao, Boolean solucao, Postagem postagem,
				Usuario usuario) {
			super();
			this.id = id;
			this.mensagem = mensagem;
			this.dataCriacao = dataCriacao;
			this.solucao = solucao;
			this.postagem = postagem;
			this.usuario = usuario;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getMensagem() {
			return mensagem;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}

		public Postagem getPostagem() {
			return postagem;
		}

		public void setPostagem(Postagem postagem) {
			this.postagem = postagem;
		}

		public LocalDateTime getDataCriacao() {
			return dataCriacao;
		}

		public void setDataCriacao(LocalDateTime dataCriacao) {
			this.dataCriacao = dataCriacao;
		}

		public Boolean getSolucao() {
			return solucao;
		}

		public void setSolucao(Boolean solucao) {
			this.solucao = solucao;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
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
			Resposta other = (Resposta) obj;
			return Objects.equals(id, other.id);
		}
		
}