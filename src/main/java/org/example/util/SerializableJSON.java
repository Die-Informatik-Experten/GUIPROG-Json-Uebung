package org.example.util;


import com.google.gson.Gson;

public interface SerializableJSON
{
    default String toJSON()
    {
        return new Gson().toJson(this);
    }
}
