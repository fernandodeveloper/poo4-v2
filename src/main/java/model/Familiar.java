package model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Familiar {
	@NotNull(message="Obrigatorio")
	@NotBlank(message="Obrigatorio")
	private String nome;
	
	@NotNull(message="Obrigatorio")
	@NotBlank(message="Obrigatorio")
	private String genero;
	
	@Min(value=-1, message="Idade inválida!")
	@Max(value=130, message="Idade inválida!")
	@NotNull(message="Obrigatorio")
	private Integer idade;
	
	@NotNull(message="Obrigatorio")
	private String[] servicos;
	
	private String[] opcoesServicos = Constantes.listaServicos;
	
	private String[] opcoesGenero = Constantes.listaGeneros;
	
	
	public String[] getopcoesGenero() {
		return this.opcoesGenero;
	}
	
	public void setopcoesGenero(String[] array) {
		this.opcoesGenero = array;
	}
	
	
	public String[] getOpcoesServicos() {
		return this.opcoesServicos;
	}
	
	public void setOpcoesServicos(String[] array) {
		this.opcoesServicos = array;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public Integer getIdade() {
		return this.idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade=idade;
	}
	
	public String[] getServicos() {
		return this.servicos;
	}
	
	public void setServicos(String[] servicos) {
		this.servicos = servicos;
	}
	
	

}
