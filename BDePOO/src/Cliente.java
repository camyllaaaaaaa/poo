import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
	public Cliente(int id, String data_de_nascimento, String nacionalidade, String nome) {
		super();
		this.id = id;
		this.data_de_nascimento = data_de_nascimento;
		this.nacionalidade = nacionalidade;
		this.nome = nome;
	}
	  @Id
	  private int id;
      private String data_de_nascimento;
      private String nacionalidade;
      private String nome;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_de_nascimento == null) ? 0 : data_de_nascimento.hashCode());
		result = prime * result + id;
		result = prime * result + ((nacionalidade == null) ? 0 : nacionalidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (data_de_nascimento == null) {
			if (other.data_de_nascimento != null)
				return false;
		} else if (!data_de_nascimento.equals(other.data_de_nascimento))
			return false;
		if (id != other.id)
			return false;
		if (nacionalidade == null) {
			if (other.nacionalidade != null)
				return false;
		} else if (!nacionalidade.equals(other.nacionalidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData_de_nascimento() {
		return data_de_nascimento;
	}
	public void setData_de_nascimento(String data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", data_de_nascimento=" + data_de_nascimento + ", nacionalidade=" + nacionalidade
				+ ", nome=" + nome + "]";
	}
      
}
