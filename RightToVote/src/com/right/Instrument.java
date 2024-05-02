package com.right;

public class Instrument {
	private int weight;
	 private int volume;
	private int value;

	public Instrument(int weight,int volume,int value){
		this.weight=weight;
		this.volume=volume;
		this.value=value;
	}

   public int getWeight() {
       return weight;
   }

   public int getVolume() {
       return volume;
   }

   public int getValue() {
       return value;
   }

   public void setWeight(int weight) {
       this.weight = weight;
   }

   public void setVolume(int volume) {
       this.volume = volume;
   }

   public void setValue(int value) {
       this.value = value;
   }

}
