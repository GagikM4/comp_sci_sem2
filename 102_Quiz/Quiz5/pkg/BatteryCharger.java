package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger {
	private int[] rateTable;

	private int getChargingCost(int startHour, int chargeTime) {
		int i = 0;
		if(startHour <= 24 && startHour >= -1 && chargeTime >= 0){
			for(i = 0; i<chargeTime; i++){
				int rateTable[i] = rateTable[chargeTime] - rateTable[chargeTime-1];
			}
		}
		return rateTable[i];
	}
	public int getChargeStartTime(int chargeTime){
		if(chargeTime = 0){
			while(true){
				if(chargeTime >= 23){
					chargeTime = chargeTime - 24;
					if(chargeTime <= 24){
						chargeTime = 24 - chargeTime;
					}
				}
				else
				return chargeTime;
			}
		}
		return chargeTime;
	}
}

