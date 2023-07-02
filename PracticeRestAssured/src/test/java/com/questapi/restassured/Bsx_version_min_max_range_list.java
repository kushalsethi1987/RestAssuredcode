package com.questapi.restassured;

public class Bsx_version_min_max_range_list
{
    private String min_version;

    private String max_version;

    public String getMin_version ()
    {
        return min_version;
    }

    public void setMin_version (String min_version)
    {
        this.min_version = min_version;
    }

    public String getMax_version ()
    {
        return max_version;
    }

    public void setMax_version (String max_version)
    {
        this.max_version = max_version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [min_version = "+min_version+", max_version = "+max_version+"]";
    }
}
			
		