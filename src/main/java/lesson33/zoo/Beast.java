package lesson33.zoo;

public abstract class Beast {
    
    private String name;
    
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
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
	Beast other = (Beast) obj;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	return true;
    }

    public String getName() {
        return name;
    }

    public Beast() {
	this.name = "Anonimous";
    }

    public Beast(String name) {
	this.name = name;
    }
}
