
public class Emp {

	private int roleno;
	private String ishwar;
	
	public Emp(int roleno, String ishwar) {
		super();
		this.roleno = roleno;
		this.ishwar = ishwar;
	}
	public int getRoleno() {
		return roleno;
	}
	public void setRoleno(int roleno) {
		this.roleno = roleno;
	}
	public String getIshwar() {
		return ishwar;
	}
	public void setIshwar(String ishwar) {
		this.ishwar = ishwar;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ishwar == null) ? 0 : ishwar.hashCode());
		result = prime * result + roleno;
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
		Emp other = (Emp) obj;
		if (ishwar == null) {
			if (other.ishwar != null)
				return false;
		} else if (!ishwar.equals(other.ishwar))
			return false;
		if (roleno != other.roleno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Emp [roleno=" + roleno + ", ishwar=" + ishwar + "]";
	}
	
	
}
