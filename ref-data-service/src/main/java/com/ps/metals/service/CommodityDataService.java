package com.ps.metals.service;

import com.google.common.collect.Lists;
import com.ps.metals.dao.CommodityRepository;
import com.ps.metals.dao.LocationRepository;
import com.ps.metals.model.Commodity;
import com.ps.metals.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("commodityDataService")
public class CommodityDataService implements RefDataService<Commodity> {

    private final CommodityRepository repository;

    @Autowired
    public CommodityDataService(CommodityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Commodity> getRefData() {
        return Lists.newArrayList(repository.findAll());
    }

    @Override
    public Optional<Commodity> getByCode(String code) {
        Commodity commodity = repository.findByCode(code);
        return Optional.ofNullable(commodity);
    }
}
