package com.jtk.ps.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FormSubmitTimeResponse {
    private Integer id;

    private String name;
    
    @JsonProperty("prodi_id")
    private Integer prodiId;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("id_timeline")
    private Integer idTimeline;

    @JsonProperty("day_before")
    private Integer dayBefore;

}
