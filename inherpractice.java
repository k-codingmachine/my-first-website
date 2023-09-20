package ex09_inher03;

class Car{ //기본 연료 자동차
   int gasolineGauge;
   Car(int gasolineGauge){
	   this.gasolineGauge = gasolineGauge;
   }
 
}

class HybridCar extends Car{ //하이브리드 자동차
   int electroicGauge;
 public HybridCar(int gasolineGauge, int electroicGauge) {
	 super(gasolineGauge);
	 this.electroicGauge = electroicGauge;
 }
   
   
}

class HybridWaterCar extends HybridCar { //하이브리드 워터카
   int waterGauge;

public HybridWaterCar(int gasolineGauge, int electroicGauge, int waterGauge) {
	super(gasolineGauge,electroicGauge);
	this.waterGauge = waterGauge;
}
}

   public void showCurrentGague() {
      System.out.println("잔여 가솔린: " + gasolineGauge );
      System.out.println("잔여 전기량: " + electroicGauge);
      System.out.println("잔여 워터량: " + waterGauge);
   }
}


class ConstructorAndSuper {
   public static void main(String[] args) {
      HybridWaterCar hwCar1 = new HybridWaterCar(4, 2, 3);
      hwCar1.showCurrentGague();
      
      HybridWaterCar hwCar2= new HybridWaterCar(9, 5, 7);
      hwCar2.showCurrentGague();
   }
}
