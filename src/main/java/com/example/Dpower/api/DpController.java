package com.example.Dpower.api;

import com.example.Dpower.model.distributionPoint;
import com.example.Dpower.service.DpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RequestMapping("")
@RestController
public class DpController {
    private final DpService dpservice;
@Autowired
    public DpController(DpService dpservice) {
        this.dpservice = dpservice;
    }
@GetMapping
    public List<distributionPoint>getService(){
        return dpservice.getAllDp();
    }
@GetMapping(path = "{id}")
    public distributionPoint getServiceById(@PathVariable("id") UUID id){
        return dpservice.selectDpById(id)
                .orElse(null);
    }
@DeleteMapping(path = "{id}")
    public int deleteService(@PathVariable("id") UUID id){
        return dpservice.deleteDpById(id);
    }
@PutMapping(path = "{id}")
    public  int updateService(@PathVariable("id") UUID id,@RequestBody distributionPoint update){
        return dpservice.updateDpById(id,update);
    }


}
