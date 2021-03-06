import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Aeroporto {
	
	@Id
	private int id;
	private String nome; 
	private String localização;
	
	@ManyToOne
    @JoinColumn(name="id_passagem")
    private Passagem passagem;
    
    @ManyToMany
    @JoinTable(
  		  name = "aeroporto_cliente",
  		  joinColumns = @JoinColumn(name = "aeroporto_id"),
  		  inverseJoinColumns = @JoinColumn(name = "cliente_id"))
    private Set<Cliente> cliente;
    
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
	public String getLocalização() {
		return localização;
	}
	public void setLocalização(String localização) {
		this.localização = localização;
	}
	public Aeroporto(int id, String nome, String localização) {
		super();
		this.id = id;
		this.nome = nome;
		this.localização = localização;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((localização == null) ? 0 : localização.hashCode());
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
		if (localização == null) {
			if (other.localização != null)
				return false;
		} else if (!localização.equals(other.localização))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Aeroporto [id=" + id + ", nome=" + nome + ", localização=" + localização + "]";
	}
	
	
 }
