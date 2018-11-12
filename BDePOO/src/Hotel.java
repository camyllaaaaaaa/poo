import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Id
	private int id;
	private String wifi;
	private String com_academia;
	private String sem_academia;
	private String localização;
	private String nome;
	private String com_piscina;
	private String sem_piscina;
	private String estacionamento;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getCom_academia() {
		return com_academia;
	}
	public void setCom_academia(String com_academia) {
		this.com_academia = com_academia;
	}
	public String getSem_academia() {
		return sem_academia;
	}
	public void setSem_academia(String sem_academia) {
		this.sem_academia = sem_academia;
	}
	public String getLocalização() {
		return localização;
	}
	public void setLocalização(String localização) {
		this.localização = localização;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCom_piscina() {
		return com_piscina;
	}
	public void setCom_piscina(String com_piscina) {
		this.com_piscina = com_piscina;
	}
	public String getSem_piscina() {
		return sem_piscina;
	}
	public void setSem_piscina(String sem_piscina) {
		this.sem_piscina = sem_piscina;
	}
	public String getEstacionamento() {
		return estacionamento;
	}
	public void setEstacionamento(String estacionamento) {
		this.estacionamento = estacionamento;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", wifi=" + wifi + ", com_academia=" + com_academia + ", sem_academia="
				+ sem_academia + ", localização=" + localização + ", nome=" + nome + ", com_piscina=" + com_piscina
				+ ", sem_piscina=" + sem_piscina + ", estacionamento=" + estacionamento + "]";
	}
	public Hotel(int id, String wifi, String com_academia, String sem_academia, String localização, String nome,
			String com_piscina, String sem_piscina, String estacionamento) {
		super();
		this.id = id;
		this.wifi = wifi;
		this.com_academia = com_academia;
		this.sem_academia = sem_academia;
		this.localização = localização;
		this.nome = nome;
		this.com_piscina = com_piscina;
		this.sem_piscina = sem_piscina;
		this.estacionamento = estacionamento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((com_academia == null) ? 0 : com_academia.hashCode());
		result = prime * result + ((com_piscina == null) ? 0 : com_piscina.hashCode());
		result = prime * result + ((estacionamento == null) ? 0 : estacionamento.hashCode());
		result = prime * result + id;
		result = prime * result + ((localização == null) ? 0 : localização.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sem_academia == null) ? 0 : sem_academia.hashCode());
		result = prime * result + ((sem_piscina == null) ? 0 : sem_piscina.hashCode());
		result = prime * result + ((wifi == null) ? 0 : wifi.hashCode());
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
		Hotel other = (Hotel) obj;
		if (com_academia == null) {
			if (other.com_academia != null)
				return false;
		} else if (!com_academia.equals(other.com_academia))
			return false;
		if (com_piscina == null) {
			if (other.com_piscina != null)
				return false;
		} else if (!com_piscina.equals(other.com_piscina))
			return false;
		if (estacionamento == null) {
			if (other.estacionamento != null)
				return false;
		} else if (!estacionamento.equals(other.estacionamento))
			return false;
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
		if (sem_academia == null) {
			if (other.sem_academia != null)
				return false;
		} else if (!sem_academia.equals(other.sem_academia))
			return false;
		if (sem_piscina == null) {
			if (other.sem_piscina != null)
				return false;
		} else if (!sem_piscina.equals(other.sem_piscina))
			return false;
		if (wifi == null) {
			if (other.wifi != null)
				return false;
		} else if (!wifi.equals(other.wifi))
			return false;
		return true;
	}
 }
 