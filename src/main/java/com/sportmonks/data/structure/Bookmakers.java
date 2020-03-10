package com.sportmonks.data.structure;

import com.fasterxml.jackson.annotation.*;
import com.sportmonks.data.entity.Bookmaker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data"})
public class Bookmakers {

    @JsonProperty("data")
    private List<Bookmaker> data = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("data")
    public List<Bookmaker> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Bookmaker> data) {
        this.data = data;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}