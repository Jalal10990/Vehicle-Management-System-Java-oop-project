class Car extends Vehicle{

    int doors;

    Car(String brand, int speed, int doors){
        super(brand, speed);
        this.doors = doors;
    }

    //meyhod overloading (polymorphisim)
    @Override

    void displayInfo(){
        System.out.println("Car Brand: " + brand + ", Speed: " + speed  + " km/h, Doors: " + doors);
        
    }


}
    

