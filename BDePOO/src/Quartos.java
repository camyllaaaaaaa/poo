import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
    public class Quartos {
	@Id
	private int id;
	private String standard;
	private String suite_exclusiva;
	private String suite_master;
	private String suite_confort;
	private String superior_com_hidro;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getSuite_exclusiva() {
		return suite_exclusiva;
	}
	public void setSuite_exclusiva(String suite_exclusiva) {
		this.suite_exclusiva = suite_exclusiva;
	}
	public String getSuite_master() {
		return suite_master;
	}
	public void setSuite_master(String suite_master) {
		this.suite_master = suite_master;
	}
	public String getSuite_confort() {
		return suite_confort;
	}
	public void setSuite_confort(String suite_confort) {
		this.suite_confort = suite_confort;
	}
	public String getSuperior_com_hidro() {
		return superior_com_hidro;
	}
	public void setSuperior_com_hidro(String superior_com_hidro) {
		this.superior_com_hidro = superior_com_hidro;
	}
	@Override
	public String toString() {
		return "Quartos [id=" + id + ", standard=" + standard + ", suite_exclusiva=" + suite_exclusiva
				+ ", suite_master=" + suite_master + ", suite_confort=" + suite_confort + ", superior_com_hidro="
				+ superior_com_hidro + "]";
	}
	public Quartos(int id, String standard, String suite_exclusiva, String suite_master, String suite_confort,
			String superior_com_hidro) {
		super();
		this.id = id;
		this.standard = standard;
		this.suite_exclusiva = suite_exclusiva;
		this.suite_master = suite_master;
		this.suite_confort = suite_confort;
		this.superior_com_hidro = superior_com_hidro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((standard == null) ? 0 : standard.hashCode());
		result = prime * result + ((suite_confort == null) ? 0 : suite_confort.hashCode());
		result = prime * result + ((suite_exclusiva == null) ? 0 : suite_exclusiva.hashCode());
		result = prime * result + ((suite_master == null) ? 0 : suite_master.hashCode());
		result = prime * result + ((superior_com_hidro == null) ? 0 : superior_com_hidro.hashCode());
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
		Quartos other = (Quartos) obj;
		if (id != other.id)
			return false;
		if (standard == null) {
			if (other.standard != null)
				return false;
		} else if (!standard.equals(other.standard))
			return false;
		if (suite_confort == null) {
			if (other.suite_confort != null)
				return false;
		} else if (!suite_confort.equals(other.suite_confort))
			return false;
		if (suite_exclusiva == null) {
			if (other.suite_exclusiva != null)
				return false;
		} else if (!suite_exclusiva.equals(other.suite_exclusiva))
			return false;
		if (suite_master == null) {
			if (other.suite_master != null)
				return false;
		} else if (!suite_master.equals(other.suite_master))
			return false;
		if (superior_com_hidro == null) {
			if (other.superior_com_hidro != null)
				return false;
		} else if (!superior_com_hidro.equals(other.superior_com_hidro))
			return false;
		return true;
	}
	
 }
 
