package com.goodee.precipitation;

import java.util.ArrayList;
import java.util.List;

public class PrecipitationDao {
	List<PrecipitationData> list = new ArrayList<PrecipitationData>();
	
	public PrecipitationDao()
	{
//		PrecipitationData data = new PrecipitationData();
//		data.setCityName("�����");
//		int month[] = new int[] {10, 14, 20, 12, 21, 12, 17, 18, 30, 20, 30, 12};
//		data.setMonth(month);
//		
//		data.setMonth(new int[] {10, 14, 20, 12, 21, 12, 17, 18, 30, 20, 30, 12});

		list.add(new PrecipitationData("����", new int[] 
				{10, 14, 20, 12, 21, 12, 17, 18, 35, 20, 30, 12}));
		list.add(new PrecipitationData("�λ�", new int[] 
				{10, 20, 20, 12, 21, 12, 17, 18, 30, 20, 30, 12}));
		list.add(new PrecipitationData("���", new int[] 
				{10, 14, 20, 32, 21, 12, 19, 18, 30, 20, 30, 12}));
		list.add(new PrecipitationData("�뱸", new int[] 
				{10, 14, 20, 22, 21, 12, 17, 20, 30, 20, 30, 12}));
		list.add(new PrecipitationData("����", new int[] 
				{10, 19, 20, 12, 21, 12, 17, 18, 30, 20, 30, 12}));
		list.add(new PrecipitationData("��õ", new int[] 
				{10, 14, 20, 12, 21, 12, 18, 18, 30, 20, 30, 12}));
		list.add(new PrecipitationData("����", new int[]
				{10, 14, 20, 15, 21, 15, 17, 18, 30, 20, 30, 12}));
		list.add(new PrecipitationData("����", new int[]
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
		PrecipitationData data1 = list.get(getMaxPos()); //�ִ밭��
		data1.display();
		
		PrecipitationData data2 = list.get(getMaxPos()); //�ּҰ���
		data2.display();
	}

}
