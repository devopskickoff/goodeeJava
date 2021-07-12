package com.goodee.dictionary;

import java.util.ArrayList;
import java.util.List;

public class EngKorDicDao {
  List<EngKorDict> list = new ArrayList<EngKorDict>();
   
   public EngKorDicDao() {
      list.add(new EngKorDict("apple", "사과"));
      list.add(new EngKorDict("book", "책"));
      list.add(new EngKorDict("survey", "조사하다"));
      list.add(new EngKorDict("yield", "제출하다"));
      list.add(new EngKorDict("umbrella", "우산"));
      list.add(new EngKorDict("star", "별"));
      list.add(new EngKorDict("moon", "달"));
   }
   
   public List<EngKorDict> getList() {
      return list;
   }
   
   public void insert(EngKorDict dto) {
	      list.add(dto);
   }
}
