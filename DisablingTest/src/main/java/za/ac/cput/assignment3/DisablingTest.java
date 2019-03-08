package za.ac.cput.assignment3;

import java.util.Objects;

public class DisablingTest {
    private String ignoring;
    
    public DisablingTest()
    {
        
    }

    public DisablingTest(Builder builder)
    {
        this.ignoring = builder.ingoring;
    }

    public String getIgnoring()
    {
        return ignoring;
    }
    
    public static class Builder
    {
        private String ingoring;
    
        public Builder ignoring(String ignore)
        {
            this.ingoring = ignore;
            return this;
        } 
        
        public DisablingTest build()
        {
            return new DisablingTest(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisablingTest that = (DisablingTest) o;
        return Objects.equals(ignoring, that.ignoring);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ignoring);
    }
}
