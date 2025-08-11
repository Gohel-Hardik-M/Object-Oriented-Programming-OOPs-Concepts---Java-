class car{

  String make;
  String model;
  int year;
  void startEngine(){
    System.out.println(make + " " + model + "Engine started......");
  }
}

class Main{
  public static void main(String[] args){
    car  car1 = new car();
    car1.make = "TOYOTA";
    car1.model = "SUV";
    car1.year = "1990";

    car1.startEngine();
  }
}
