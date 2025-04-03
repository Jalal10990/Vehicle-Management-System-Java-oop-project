class Vehicle {
    String brand;
    int speed;

Vehicle(String brand, int speed){
    this.brand = brand;
    this.speed = speed;

}

void displayInfo(){
    System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    
}

}
