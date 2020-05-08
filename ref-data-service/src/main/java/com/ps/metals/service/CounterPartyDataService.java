package com.ps.metals.service;

import com.google.common.collect.Lists;
import com.ps.metals.dao.CounterPartyRepository;
import com.ps.metals.dao.LocationRepository;
import com.ps.metals.model.CounterParty;
import com.ps.metals.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("counterPartyDataService")
public class CounterPartyDataService implements RefDataService<CounterParty> {

    private final CounterPartyRepository repository;

    @Autowired
    public CounterPartyDataService(CounterPartyRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CounterParty> getRefData() {
        return Lists.newArrayList(repository.findAll());
    }

    @Override
    public Optional<CounterParty> getByCode(String code) {
        CounterParty counterParty = repository.findByCode(code);
        return Optional.ofNullable(counterParty);
    }
}
