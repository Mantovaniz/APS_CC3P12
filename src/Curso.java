
package entidade;

public class Curso{
	
	private String nivel;
	private String nome;
    private Integer ano;
	
	public Curso (String nivel,Integer ano, String nome) {
		this.nivel = nivel;
		this.nome = nome;
        this.ano= ano;
	}
	
	public String getNivel() {
		return nivel;
	}

    public String getNome() {
		return nome;

    }


    public String getAno() {
		return ano;

    }


	public void setNivel(String nivel) {
		this.nivel = nivel;

    }    
	
	public void setNome(String nome) {
		this.nome = nome;
	}

    public void setAno(Integer ano) {
		this.ano = ano;
	}
