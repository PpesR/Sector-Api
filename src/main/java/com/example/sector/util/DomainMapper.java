package com.example.sector.util;

import com.example.sector.domain.SectorUser;
import com.example.sector.request.in.SectorUserSaveRequest;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class DomainMapper extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(SectorUser.class, SectorUserSaveRequest.class)
                .byDefault()
                .register();
    }
}
