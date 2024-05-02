package com.right;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
	    Instrument[] arr = {
                new Instrument(3, 2, 10),
                new Instrument(4, 3, 15),
                new Instrument(2, 1, 8),
                new Instrument(5, 4, 20)
           
        };
	    List<Instrument> si=new ArrayList<>();
		List<Instrument> cs=new ArrayList<>();
		int maxw=10;
		int maxv=7;
		BackTrack(arr,maxw,maxv,0,cs,si);

       int totalWeight=si.stream().mapToInt(e->e.getWeight()).sum();
       int totalVolume=si.stream().mapToInt(e->e.getVolume()).sum();
        int totalValue=si.stream().mapToInt(e->e.getValue()).sum();
        	System.out.println("Weight: "+totalWeight);
        	System.out.println("Volume: "+totalVolume);
        	System.out.println("value: "+totalValue);
	}
	public static void BackTrack(Instrument [] inst,int maxW,int maxV,int index,List<Instrument> csel,List<Instrument> siN){
		if(index==inst.length){
			int totalWeight=csel.stream().mapToInt(e->e.getWeight()).sum();
             int totalVolume=csel.stream().mapToInt(e->e.getVolume()).sum();
             if(totalWeight<=maxW &&totalVolume<=maxV){
             	int currenValue=csel.stream().mapToInt(e->e.getValue()).sum();
             	int scientficValue=siN.stream().mapToInt(e->e.getValue()).sum();
             	if(currenValue>scientficValue){
             		siN.clear();
             		siN.addAll(csel);
             	}

             }
             return;
		}
		csel.add(inst[index]);
		BackTrack(inst,maxW,maxV,index+1,csel,siN);
		csel.remove(csel.size()-1);
		BackTrack(inst,maxW,maxV,index+1,csel,siN);

	}
	

}
