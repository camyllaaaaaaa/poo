import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ag�ncia {
		public Ag�ncia(int id, String nome, String viagem, String endere�o) {
		super();
		this.id = id;
		this.nome = nome;
		this.viagem = viagem;
		this.endere�o = endere�o;
	}
		@Id
		private int id; 
		private String nome;
		private String viagem;
		private String endere�o;
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
		public String getEndere�o() {
			return endere�o;
		}
		public void setEndere�o(String endere�o) {
			this.endere�o = endere�o;
		}
		@Override
		public String toString() {
			return "Ag�ncia [id=" + id + ", nome=" + nome + ", viagem=" + viagem + ", endere�o=" + endere�o + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((endere�o == null) ? 0 : endere�o.hashCode());
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
			Ag�ncia other = (Ag�ncia) obj;
			if (endere�o == null) {
				if (other.endere�o != null)
					return false;
			} else if (!endere�o.equals(other.endere�o))
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
}