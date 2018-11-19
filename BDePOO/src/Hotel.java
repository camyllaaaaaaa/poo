import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Hotel {
	@Id
	private int id;
	private Boolean wifi;
	private Boolean temAcademia;
	private Boolean localização;
	private Boolean nome;
	private Boolean temPiscina;
	private Boolean temEstacionamento;
	
	@ManyToOne
	@JoinColumn(name = "id_quarto")
	private Set<Quarto> quartos;
			
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Boolean getWifi() {
		return wifi;
	}
	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}
	public Boolean getTemAcademia() {
		return temAcademia;
	}
	public void setTemAcademia(Boolean temAcademia) {
		this.temAcademia = temAcademia;
	}
	public Boolean getLocalização() {
		return localização;
	}
	public void setLocalização(Boolean localização) {
		this.localização = localização;
	}
	public Boolean getNome() {
		return nome;
	}
	public void setNome(Boolean nome) {
		this.nome = nome;
	}
	public Boolean getTemPiscina() {
		return temPiscina;
	}
	public void setTemPiscina(Boolean temPiscina) {
		this.temPiscina = temPiscina;
	}
	public Boolean getTemEstacionamento() {
		return temEstacionamento;
	}
	public void setTemEstacionamento(Boolean temEstacionamento) {
		this.temEstacionamento = temEstacionamento;
	}

}

 