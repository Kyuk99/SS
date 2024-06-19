package com.ksh.soundstory.services;

import com.ksh.soundstory.dtos.SearchDto;
import com.ksh.soundstory.entites.ArtistEntity;
import com.ksh.soundstory.mappers.SearchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
    private final SearchMapper searchMapper;

    @Autowired
    public SearchService(SearchMapper searchMapper) {
        this.searchMapper = searchMapper;
    }

    public ArtistEntity[] getSearch(SearchDto searchDto) {
        return this.searchMapper.selectArtistBySearch(searchDto);
    }
}
