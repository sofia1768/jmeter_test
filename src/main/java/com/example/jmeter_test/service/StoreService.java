package com.example.jmeter_test.service;

import com.example.jmeter_test.dao.StoreInfo;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

  public StoreInfo findStoreInfo(Integer strCd) {
    System.out.println("strCd :" + strCd);
    StoreInfo storeInfo = new StoreInfo();
    storeInfo.setStoreName(strCd + "name1");
    storeInfo.setStoreInfo(strCd + "info1");

    return storeInfo;
  }
}
