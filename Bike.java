class Bike extends Vehicle {
    boolean hasGear;

    Bike(String brand, int speed, boolean hasGear){
super(brand, speed);
this.hasGear = hasGear;

    }
    //method overriding (polymorphisim)
    @Override

    void displayInfo(){
        System.out.println("Bike Brand: " + brand + ", Speed: " + speed + " km/h, Has Gear: " + hasGear);
    }
}
