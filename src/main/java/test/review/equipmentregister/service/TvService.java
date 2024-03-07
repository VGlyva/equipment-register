package test.review.equipmentregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.review.equipmentregister.model.TV;
import test.review.equipmentregister.repositories.TvRepository;

@Service
public class TvService {
    @Autowired
    private final TvRepository tvRepository;

    public TvService(TvRepository tvRepository) {
        this.tvRepository = tvRepository;
    }
    public TV createTv(TV tv) {
        return tvRepository.save(tv);
    }
}
