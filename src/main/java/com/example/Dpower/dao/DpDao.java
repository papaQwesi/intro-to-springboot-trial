package com.example.Dpower.dao;

import com.example.Dpower.model.distributionPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DpDao {

    int insertDp(distributionPoint dp);
    List<distributionPoint> selectAllDp();
    Optional<distributionPoint>selectDp(UUID id);
    int updateDp(UUID dpId, distributionPoint newUpdate);
    int deleteDp(UUID dpId);
}
