import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Agência {
		@Id
		private int id; 
		private String nome;
		private String viagem;
		private String endereço;
		
		@ManyToOne
	    @JoinColumn(name="id_viagem")
	    private Viagem viagem1;
	    
	    @ManyToMany
	    @JoinTable(
	  		  name = "agência_cliente",
	  		  joinColumns = @JoinColumn(name = "agência_id"),
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
		public String getViagem() {
			return viagem;
		}
		public void setViagem(String viagem) {
			this.viagem = viagem;
		}
		public String getEndereço() {
			return endereço;
		}
		public void setEndereço(String endereço) {
			this.endereço = endereço;
		}
		
		public Agência(int id, String nome, String viagem, String endereço) {
			super();
			this.id = id;
			this.nome = nome;
			this.viagem = viagem;
			this.endereço = endereço;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
			result = prime * result + id;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + ((viagem == null) ? 0 : viagem.hashCode());
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
			Agência other = (Agência) obj;
			if (endereço == null) {
				if (other.endereço != null)
					return false;
			} else if (!endereço.equals(other.endereço))
				return false;
			if (id != other.id)
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (viagem == null) {
				if (other.viagem != null)
					return false;
			} else if (!viagem.equals(other.viagem))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Agência [id=" + id + ", nome=" + nome + ", viagem=" + viagem + ", endereço=" + endereço + "]";
		}
}