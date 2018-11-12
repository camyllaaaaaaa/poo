import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passagem {
	@Id
	private int id;
	private String hora_de_chegada;
	private String valor;
	private String hora_de_sa�da;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHora_de_chegada() {
		return hora_de_chegada;
	}
	public void setHora_de_chegada(String hora_de_chegada) {
		this.hora_de_chegada = hora_de_chegada;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getHora_de_sa�da() {
		return hora_de_sa�da;
	}
	public void setHora_de_sa�da(String hora_de_sa�da) {
		this.hora_de_sa�da = hora_de_sa�da;
	}
	@Override
	public String toString() {
		return "Passagem [id=" + id + ", hora_de_chegada=" + hora_de_chegada + ", valor=" + valor + ", hora_de_sa�da="
				+ hora_de_sa�da + "]";
	}
	public Passagem(int id, String hora_de_chegada, String valor, String hora_de_sa�da) {
		super();
		this.id = id;
		this.hora_de_chegada = hora_de_chegada;
		this.valor = valor;
		this.hora_de_sa�da = hora_de_sa�da;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hora_de_chegada == null) ? 0 : hora_de_chegada.hashCode());
		result = prime * result + ((hora_de_sa�da == null) ? 0 : hora_de_sa�da.hashCode());
		result = prime * result + id;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		Passagem other = (Passagem) obj;
		if (hora_de_chegada == null) {
			if (other.hora_de_chegada != null)
				return false;
		} else if (!hora_de_chegada.equals(other.hora_de_chegada))
			return false;
		if (hora_de_sa�da == null) {
			if (other.hora_de_sa�da != null)
				return false;
		} else if (!hora_de_sa�da.equals(other.hora_de_sa�da))
			return false;
		if (id != other.id)
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
 }

