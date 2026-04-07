package com.neha.spring.annotation.bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CakeBaker {
//    private final Frosting frosting;
//    private final Syrup syrup;

//    @Autowired
//    public CakeBaker(Frosting frosting, Syrup syrup) {
//        this.frosting = frosting;
//        this.syrup = syrup;
//    }

    @Autowired
    Map<String, Frosting> frostingMap = new HashMap<>();
    @Autowired
    Map<String, Syrup> syrupMap = new HashMap<>();


    public void bakeCake() {
//        frosting.getFrostingType();
//        syrup.getSyrupType();

        for(var frosting: frostingMap.entrySet()){
            frosting.getValue().getFrostingType();
        }

        for(var syrup: syrupMap.entrySet()){
            syrup.getValue().getSyrupType();
        }
    }
}
