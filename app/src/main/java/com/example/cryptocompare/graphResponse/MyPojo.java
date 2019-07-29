package com.example.cryptocompare.graphResponse;

public class MyPojo
{
    private String Response;

    private String Type;

    private String FirstValueInArray;

    private ConversionType ConversionType;

    private String Aggregated;

    private String TimeFrom;

    private String TimeTo;

    private String HasWarning;

    private Data[] Data;

    public String getResponse ()
    {
        return Response;
    }

    public void setResponse (String Response)
    {
        this.Response = Response;
    }



    public String getType ()
    {
        return Type;
    }

    public void setType (String Type)
    {
        this.Type = Type;
    }

    public String getFirstValueInArray ()
    {
        return FirstValueInArray;
    }

    public void setFirstValueInArray (String FirstValueInArray)
    {
        this.FirstValueInArray = FirstValueInArray;
    }

    public ConversionType getConversionType ()
    {
        return ConversionType;
    }

    public void setConversionType (ConversionType ConversionType)
    {
        this.ConversionType = ConversionType;
    }

    public String getAggregated ()
    {
        return Aggregated;
    }

    public void setAggregated (String Aggregated)
    {
        this.Aggregated = Aggregated;
    }

    public String getTimeFrom ()
    {
        return TimeFrom;
    }

    public void setTimeFrom (String TimeFrom)
    {
        this.TimeFrom = TimeFrom;
    }

    public String getTimeTo ()
    {
        return TimeTo;
    }

    public void setTimeTo (String TimeTo)
    {
        this.TimeTo = TimeTo;
    }

    public String getHasWarning ()
    {
        return HasWarning;
    }

    public void setHasWarning (String HasWarning)
    {
        this.HasWarning = HasWarning;
    }

    public Data[] getData()
    {
        return Data;
    }

    public void setData(Data[] Data)
    {
        this.Data = Data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Response = "+Response+", Type = "+Type+", FirstValueInArray = "+FirstValueInArray+", ConversionType = "+ConversionType+", Aggregated = "+Aggregated+", TimeFrom = "+TimeFrom+", TimeTo = "+TimeTo+", HasWarning = "+HasWarning+", Data = "+ Data +"]";
    }
}
