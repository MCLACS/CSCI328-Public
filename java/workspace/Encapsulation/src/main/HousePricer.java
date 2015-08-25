package main;

import java.awt.Color;

import realEstate.House;

public class HousePricer 
{
    public static void main(String[] args)
    {
        House house = new House(5, 2, 2, 1200.5, Color.red);
        System.out.println(house.toString());

        house = new House(5, 3, 2, 1500.0, new Color(100, 100, 100));
        System.out.println(house.toString());

        house = new House(8, 3, 3, 3000, new Color(100, 200, 80));
        System.out.println(house.toString());

    }

}
