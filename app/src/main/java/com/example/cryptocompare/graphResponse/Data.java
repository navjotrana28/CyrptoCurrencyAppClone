package com.example.cryptocompare.graphResponse;

public class Data
{
    private String high;

    private String low;

    private String volumeto;

    private String volumefrom;

    private String time;

    private String close;

    private String open;

    public String getHigh ()
    {
        return high;
    }

    public void setHigh (String high)
    {
        this.high = high;
    }

    public String getLow ()
    {
        return low;
    }

    public void setLow (String low)
    {
        this.low = low;
    }

    public String getVolumeto ()
    {
        return volumeto;
    }

    public void setVolumeto (String volumeto)
    {
        this.volumeto = volumeto;
    }

    public String getVolumefrom ()
    {
        return volumefrom;
    }

    public void setVolumefrom (String volumefrom)
    {
        this.volumefrom = volumefrom;
    }

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getClose ()
    {
        return close;
    }

    public void setClose (String close)
    {
        this.close = close;
    }

    public String getOpen ()
    {
        return open;
    }

    public void setOpen (String open)
    {
        this.open = open;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [high = "+high+", low = "+low+", volumeto = "+volumeto+", volumefrom = "+volumefrom+", time = "+time+", close = "+close+", open = "+open+"]";
    }
}
