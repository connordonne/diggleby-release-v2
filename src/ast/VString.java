package ast;

public class VString extends Value {

    private String value;
    public VString(String value) {
        this.value = value;
    }
    public String getValue() { return value; }

    public String toString() {
        return String.format("\"%s\"", value);
    }

    public String toStringNoQuotes() {
        return String.format("%s", value);
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
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
        VString other = (VString) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    
}
