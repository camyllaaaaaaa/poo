import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Refei��o {
	public Refei��o(int id, String meiaPens�o, String semRefei��o, String pens�oCompleta, String caf�DaManh�) {
		super();
		this.id = id;
		this.meiaPens�o = meiaPens�o;
		this.semRefei��o = semRefei��o;
		this.pens�oCompleta = pens�oCompleta;
		this.caf�DaManh� = caf�DaManh�;
	}
	@Id
	private int id;
	private String meiaPens�o;
	private String semRefei��o;
	private String pens�oCompleta;
	private String caf�DaManh�;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMeiaPens�o() {
		return meiaPens�o;
	}
	public void setMeiaPens�o(String meiaPens�o) {
		this.meiaPens�o = meiaPens�o;
	}
	public String getSemRefei��o() {
		return semRefei��o;
	}
	public void setSemRefei��o(String semRefei��o) {
		this.semRefei��o = semRefei��o;
	}
	public String getPens�oCompleta() {
		return pens�oCompleta;
	}
	public void setPens�oCompleta(String pens�oCompleta) {
		this.pens�oCompleta = pens�oCompleta;
	}
	public String getCaf�DaManh�() {
		return caf�DaManh�;
	}
	public void setCaf�DaManh�(String caf�DaManh�) {
		this.caf�DaManh� = caf�DaManh�;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caf�DaManh� == null) ? 0 : caf�DaManh�.hashCode());
		result = prime * result + id;
		result = prime * result + ((meiaPens�o == null) ? 0 : meiaPens�o.hashCode());
		result = prime * result + ((pens�oCompleta == null) ? 0 : pens�oCompleta.hashCode());
		result = prime * result + ((semRefei��o == null) ? 0 : semRefei��o.hashCode());
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
		Refei��o other = (Refei��o) obj;
		if (caf�DaManh� == null) {
			if (other.caf�DaManh� != null)
				return false;
		} else if (!caf�DaManh�.equals(other.caf�DaManh�))
			return false;
		if (id != other.id)
			return false;
		if (meiaPens�o == null) {
			if (other.meiaPens�o != null)
				return false;
		} else if (!meiaPens�o.equals(other.meiaPens�o))
			return false;
		if (pens�oCompleta == null) {
			if (other.pens�oCompleta != null)
				return false;
		} else if (!pens�oCompleta.equals(other.pens�oCompleta))
			return false;
		if (semRefei��o == null) {
			if (other.semRefei��o != null)
				return false;
		} else if (!semRefei��o.equals(other.semRefei��o))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Refei��o [id=" + id + ", meiaPens�o=" + meiaPens�o + ", semRefei��o=" + semRefei��o
				+ ", pens�oCompleta=" + pens�oCompleta + ", caf�DaManh�=" + caf�DaManh� + "]";
	}

}
