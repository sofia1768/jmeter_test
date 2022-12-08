package com.example.jmeter_test.controller;

import com.example.jmeter_test.dao.StoreInfo;
import com.example.jmeter_test.dao.TagsInfo;
import com.example.jmeter_test.service.StoreService;
import com.example.jmeter_test.service.TagService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class jmeterTestController {

  @Autowired
  private TagService tagService;

  @Autowired
  private StoreService storeService;

  @GetMapping(value = "/api/tags/{tagCode}")
  public @ResponseBody ResponseEntity<TagsInfo> findTagsInfo(
    @PathVariable("tagCode") int tagCode
  ) {
    return ResponseEntity.ok(tagService.findTagsInfo(tagCode));
  }

  @GetMapping(value = "api/tags/{strCd}")
  public @ResponseBody ResponseEntity<StoreInfo> findStoreInfo(
    @PathVariable("strCd") int strCd
  ) {
    return ResponseEntity.ok(storeService.findStoreInfo(strCd));
  }
}
