package com.example.Dpower.service;

import com.example.Dpower.dao.DpDao;
import com.example.Dpower.model.distributionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DpService {


    private final DpDao dpDao;
    @Autowired
    public DpService(@Qualifier("trydao") DpDao dpDao) {
        this.dpDao = dpDao;
    }

    public List<distributionPoint>getAllDp(){
        return dpDao.selectAllDp();
    }

    public int deleteDpById(UUID id){
        return dpDao.deleteDp(id);
    }

    public int updateDpById(UUID id,distributionPoint newUpdate){
        return dpDao.updateDp(id,newUpdate);
    }

    public Optional<distributionPoint>selectDpById(UUID id){
        return dpDao.selectDp(id);
    }

}
