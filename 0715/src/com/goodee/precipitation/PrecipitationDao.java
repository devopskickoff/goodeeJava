package com.goodee.precipitation;

import java.util.ArrayList;
import java.util.List;

public class PrecipitationDao {
	List<PrecipitationData> list = new ArrayList<PrecipitationData>();
	
	public PrecipitationDao()
	{
//		PrecipitationData data = new PrecipitationData();
//		data.setCityName("서울시");
//		int month[] = new int[] {10, 14, 20, 12, 21, 12, 17, 18, 30, 20, 30, 12};
//		data.setMonth(month);
//		
//		data.setMonth(new int[] {10, 14, 20, 12, 21, 12, 17, 18, 30, 20, 30, 12});

		list.add(new PrecipitationData("서울", new int[] 
				{10, 14, 20, 12, 21, 12, 17, 18, 35, 20, 30, 12}));
		list.add(new PrecipitationData("부산", new int[] 
				{10, 20, 20, 12, 21, 12, 17, 18, 30, 20, 30, 12}));
		list.add(new PrecipitationData("울산", new int[] 
				{10, 14, 20, 32, 21, 12, 19, 18, 30, 20, 30, 12}));
		list.add(new PrecipitationData("대구", new int[] 
				{10, 14, 20, 22, 21, 12, 17, 20, 30, 20, 30, 12}));
		list.add(new PrecipitationData("광주", new int[] 
				{10, 19, 20, 12, 21, 12, 17, 18, 30, 20, 30, 12}));
		list.add(new PrecipitationData("인천", new int[] 
				{10, 14, 20, 12, 21, 12, 18, 18, 30, 20, 30, 12}));
		list.add(new PrecipitationData("세종", new int[]
				{10, 14, 20, 15, 21, 15, 17, 18, 30, 20, 30, 12}));
		list.add(new PrecipitationData("대전", new int[]
				{10, 10, 20, 12, 21, 15, 17, 20, 30, 20, 30, 12}));
	}
	int getMaxPos()
	{
		float max = list.get(0).getAvg();
		int pos = 0;
		
		for(int i = 1; i < list.size(); i++)
		{
			PrecipitationData data = list.get(i);
			if(max < data.getAvg())
			{
				max = data.getAvg();
				pos = i;
			}
		}
		return pos;
	}
	
	public void output()
	{
		for(PrecipitationData data : list)
		{
			data.display();
		}
		PrecipitationData data1 = list.get(getMaxPos()); //최대강수
		data1.display();
		
		PrecipitationData data2 = list.get(getMaxPos()); //최소강수
		data2.display();
	}

}
