import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aeroporto {
	
	@Id
	private int id;
	private String nome; 
	private String localiza��o;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((localiza��o == null) ? 0 : localiza��o.hashCode());
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
		Aeroporto other = (Aeroporto) obj;
		if (id != other.id)
			return false;
		if (localiza��o == null) {
			if (other.localiza��o != null)
				return false;
		} else if (!localiza��o.equals(other.localiza��o))
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocaliza��o() {
		return localiza��o;
	}
	public void setLocaliza��o(String localiza��o) {
		this.localiza��o = localiza��o;
	}
	@Override
	public String toString() {
		return "aeroporto [id=" + id + ", nome=" + nome + ", localiza��o=" + localiza��o + "]";
	}
	public Aeroporto(int id, String nome, String localiza��o) {
		super();
		this.id = id;
		this.nome = nome;
		this.localiza��o = localiza��o;
	}
	

	
 }
