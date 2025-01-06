package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true,1));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(isCatPlaying(true, 10));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(5.0));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        //Akşam 20 Sabah 8 arasında havlamalı 20 ve 8 olursa false olacak
        if(isBarking && clock > 20 && clock < 24) {
            return true;
        }else if(isBarking && clock > 0 && clock < 8){
            return true;
        }else{
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if(firstAge >= 13 && firstAge <= 19)
       {
           return true;
       } else if(secondAge >= 13 && secondAge <= 19)
       {
           return true;
       } else if(thirdAge >= 13 && thirdAge <= 19)
       {
           return true;
       } else {
           return false;
       }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

      if(isSummer)
      {
          if(temp >= 25 && temp <= 45)
          {
              return true;
          }else{
              return false;
          }
      }else {
          if(temp >= 25 && temp <= 35)
          {
              return true;
          }else{
              return false;
          }
      }
    }

    public static double area(double width, double height) {
       if(width < 0 || height < 0)
       {
           return -1;
       }

       return width * height;
    }

    public static double area(double radius) {
       if(radius < 0)
       {
           return -1;
       }

       return radius*radius*Math.PI;
    }
}
