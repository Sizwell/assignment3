package za.ac.cput.assignment3;

import java.util.Objects;

public class TimeOut {

    private String timer;

    public TimeOut()
    {

    }

    public String getTimer()
    {
        return timer;
    }

    public static class Builder
    {
        private String timer;

        public Builder timer(String time)
        {
            this.timer = time;
            return this;
        }

        public TimeOut build()
        {
            return new TimeOut(this);
        }

    }
    //Constructor
    public TimeOut (Builder builder)
    {
        this.timer = builder.timer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeOut timeOut = (TimeOut) o;
        return Objects.equals(timer, timeOut.timer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timer);
    }
}
