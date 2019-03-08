package za.ac.cput.assignment3;

import java.util.Objects;

public class ObjectIdentity {

    private String name;

    public ObjectIdentity()
    {

    }

    public String getName()
    {
        return name;
    }

    public static class Builder
    {
        private String name;


        public Builder studName(String nm)
        {
            this.name = nm;
            return this;
        }

        public ObjectIdentity build()
        {
            return new ObjectIdentity(this);
        }

    }



    public ObjectIdentity (Builder builder)
    {
        this.name = builder.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectIdentity that = (ObjectIdentity) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
