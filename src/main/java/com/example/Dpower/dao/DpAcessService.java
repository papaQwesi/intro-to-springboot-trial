package com.example.Dpower.dao;

import com.example.Dpower.model.distributionPoint;
import org.flywaydb.core.internal.jdbc.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("trydao")
public class DpAcessService implements DpDao {

    @Autowired
    private final JdbcTemplate jdbcTemplate;



    public DpAcessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertDp(distributionPoint dp) {
        return 0;
    }

    @Override
    public ArrayList<distributionPoint> selectAllDp() {
        final  String sql = "SELECT * FROM distributionPoint";

        return null;
    }

    @Override
    public Optional<distributionPoint> selectDp(UUID id) {
       /* final String sql = "";
        distributionPoint distributionPoint = jdbcTemplate.queryForObject(
                sql,
                //new Object[]{"id"}
                    (ResultSet,i) ->{
                    UUID idForDp =UUID.fromString(ResultSet.getString(""));

        });*/
        return Optional.empty();
    }



    @Override
    public int updateDp(UUID dpId, distributionPoint newUpdate) {
        return 0;
    }

    @Override
    public int deleteDp(UUID dpId) {
        return 0;
    }
}
