package com.example.jmeter_test.service;

import com.example.jmeter_test.dao.TagsInfo;
import org.springframework.stereotype.Service;

@Service
public class TagService {

  public TagsInfo findTagsInfo(Integer tag) {
    System.out.println("tag : " + tag);
    TagsInfo tagsInfo = new TagsInfo();
    tagsInfo.setTagName(tag + "name1");
    tagsInfo.setTagInfo(tag + "info1");

    return tagsInfo;
  }
}
