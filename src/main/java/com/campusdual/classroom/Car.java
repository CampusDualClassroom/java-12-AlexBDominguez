package com.campusdual.classroom;

import java.util.Objects;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED= 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {

    }

    public void start(){
        if(this.tachometer == 0){
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        }else{
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop(){
        if(this.speedometer == 0){
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        }else{
            System.out.println("Non se pode apagar o vehículo, primero ten que estar detido");
        }
    }

    public void accelerate(){
        if(this.speedometer + 1000 > MAX_SPEED){
            this.speedometer = MAX_SPEED;
        }else{
            this.speedometer+=100;
        }
        System.out.println("El coche está acelerando...");
    }

    public void brake(){
        this.speedometer-=50;
        if(this.speedometer <0){
            this.speedometer=0;
        }
        System.out.println("El coche está frenando...");
    }

    public void turnAngleOfWheels(int angle){
        this.wheelsAngle+=angle;
        if(this.wheelsAngle >45){
            this.wheelsAngle=45;
        }else if(this.wheelsAngle<=-45){
            this.wheelsAngle=-45;
        }
        System.out.println("Giramos el volante...");
    }

    public String showSteeringWheelDetail(){
        return "Estamos girando el volante " + wheelsAngle + " grados.";
    }

    public boolean isReverse(){
        return Objects.equals(this.gear, "R");
    }

    public void setReverse(boolean reverse){
        if(reverse && this.speedometer==0){
            this.gear="R";
            this.reverse=true;
        }else if(!reverse){
            this.gear="N";
            this.reverse=false;
        }
    }

    public void showDetails(){}

    public static void main(String[] args){}


    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

}
