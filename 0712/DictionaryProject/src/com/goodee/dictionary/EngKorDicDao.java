package com.goodee.dictionary;

import java.util.ArrayList;
import java.util.List;

public class EngKorDicDao {
  List<EngKorDict> list = new ArrayList<EngKorDict>();
   
   public EngKorDicDao() {
      list.add(new EngKorDict("apple", "���"));
      list.add(new EngKorDict("book", "å"));
      list.add(new EngKorDict("survey", "�����ϴ�"));
      list.add(new EngKorDict("yield", "�����ϴ�"));
      list.add(new EngKorDict("umbrella", "���"));
      list.add(new EngKorDict("star", "��"));
      list.add(new EngKorDict("moon", "��"));
   }
   
   public List<EngKorDict> getList() {
      return list;
   }
   
   public void insert(EngKorDict dto) {
	      list.add(dto);
   }
}
