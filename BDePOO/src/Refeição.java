import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Refeição {
	public Refeição(int id, String meiaPensão, String semRefeição, String pensãoCompleta, String caféDaManhã) {
		super();
		this.id = id;
		this.meiaPensão = meiaPensão;
		this.semRefeição = semRefeição;
		this.pensãoCompleta = pensãoCompleta;
		this.caféDaManhã = caféDaManhã;
	}
	@Id
	private int id;
	private String meiaPensão;
	private String semRefeição;
	private String pensãoCompleta;
	private String caféDaManhã;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMeiaPensão() {
		return meiaPensão;
	}
	public void setMeiaPensão(String meiaPensão) {
		this.meiaPensão = meiaPensão;
	}
	public String getSemRefeição() {
		return semRefeição;
	}
	public void setSemRefeição(String semRefeição) {
		this.semRefeição = semRefeição;
	}
	public String getPensãoCompleta() {
		return pensãoCompleta;
	}
	public void setPensãoCompleta(String pensãoCompleta) {
		this.pensãoCompleta = pensãoCompleta;
	}
	public String getCaféDaManhã() {
		return caféDaManhã;
	}
	public void setCaféDaManhã(String caféDaManhã) {
		this.caféDaManhã = caféDaManhã;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caféDaManhã == null) ? 0 : caféDaManhã.hashCode());
		result = prime * result + id;
		result = prime * result + ((meiaPensão == null) ? 0 : meiaPensão.hashCode());
		result = prime * result + ((pensãoCompleta == null) ? 0 : pensãoCompleta.hashCode());
		result = prime * result + ((semRefeição == null) ? 0 : semRefeição.hashCode());
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
		Refeição other = (Refeição) obj;
		if (caféDaManhã == null) {
			if (other.caféDaManhã != null)
				return false;
		} else if (!caféDaManhã.equals(other.caféDaManhã))
			return false;
		if (id != other.id)
			return false;
		if (meiaPensão == null) {
			if (other.meiaPensão != null)
				return false;
		} else if (!meiaPensão.equals(other.meiaPensão))
			return false;
		if (pensãoCompleta == null) {
			if (other.pensãoCompleta != null)
				return false;
		} else if (!pensãoCompleta.equals(other.pensãoCompleta))
			return false;
		if (semRefeição == null) {
			if (other.semRefeição != null)
				return false;
		} else if (!semRefeição.equals(other.semRefeição))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Refeição [id=" + id + ", meiaPensão=" + meiaPensão + ", semRefeição=" + semRefeição
				+ ", pensãoCompleta=" + pensãoCompleta + ", caféDaManhã=" + caféDaManhã + "]";
	}

}
