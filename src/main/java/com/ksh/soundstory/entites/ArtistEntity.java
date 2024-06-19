package com.ksh.soundstory.entites;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = {"artistId"})
public class ArtistEntity {
    private int artistId;
    private String name;
}
