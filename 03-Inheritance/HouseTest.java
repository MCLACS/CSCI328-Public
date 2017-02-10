
public class HouseTest
{
    public static void main(String[] args)
    {
        House house1 = new House(4791);
        System.out.println(house1.toString());
        if (house1.estimate() != 464727)
            throw new Error("House test failed!");
    
        SolidConstructionHouse house2 = new SolidConstructionHouse(4791);
        System.out.println(house2.toString());        
        if (house2.estimate() != 580908.75)
            throw new Error("SolidConstructionHouse test failed!");
    }
}
