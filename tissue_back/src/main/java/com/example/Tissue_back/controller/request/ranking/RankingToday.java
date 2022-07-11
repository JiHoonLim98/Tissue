package com.example.Tissue_back.controller.request.ranking;

import lombok.*;
import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RankingToday {
    private Long ranking;

    private Long performNo;
    private Long COUNT;

    private String performName;
    private LocalDate performStart;
    private LocalDate performEnd;
    private String performThumbnail;

    private String hallName;


    public RankingToday (BigInteger ranking, BigInteger performNo, BigInteger COUNT, String performName, Date performStart, Date performEnd,
                         String performThumbnail, String hallName) {

        this.ranking = ranking.longValue();

        this.performNo = performNo.longValue();
        this.COUNT = COUNT.longValue();

        this.performName = performName;
        this.performStart = performStart.toLocalDate();
        this.performEnd = performEnd.toLocalDate();
        this.performThumbnail = performThumbnail;

        this.hallName = hallName;
    }
}
