package com.ksh.soundstory.mappers;

import com.ksh.soundstory.dtos.SearchDto;
import com.ksh.soundstory.entites.ArtistEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SearchMapper {
    ArtistEntity[] selectArtistBySearch(SearchDto searchDto);
}
