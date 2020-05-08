package com.ps.metals.service;

import com.google.common.collect.Lists;
import com.ps.metals.dao.LocationRepository;
import com.ps.metals.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

@Service("locationDataService")
public class LocationDataService implements RefDataService<Location> {

    private final LocationRepository repository;

    @Autowired
    public LocationDataService(LocationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Location> getRefData() {
        return Lists.newArrayList(repository.findAll());
    }

    @Override
    public Optional<Location> getByCode(String code) {
        Location location = repository.findByCode(code);
        return Optional.ofNullable(location);
    }
}
