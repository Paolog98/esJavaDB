package com.netflix.dao;

import com.netflix.model.Film;

import java.util.List;

public interface FilmDao {


    public void save(Film f);
    public List<Film> search(String regista);
}
