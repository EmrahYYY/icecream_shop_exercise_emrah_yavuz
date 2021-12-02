package be.intecbrussel.application;


import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) throws NoMoreIceCreamException {
        PriceList priceList = new PriceList(5, 3, 4);

        IceCreamSeller mysalon = new IceCreamSalon(priceList);
        Eatable[] eatables = new Eatable[5];

        eatables[0] = mysalon.orderMagnum(Magnum.MagnumType.APINENUTS);
        eatables[0].eat();
        eatables[1] = mysalon.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        eatables[1].eat();
        System.out.println(mysalon.getProfit());


        System.out.println("----------------------------------------------------");

        Cone.Flavor[] flavor = {Cone.Flavor.BANANA};
        eatables[2] = mysalon.orderCone(flavor);
        eatables[2].eat();
        Cone.Flavor[] flavor2 = {Cone.Flavor.STRACIATELLA};
        eatables[3] = mysalon.orderCone(flavor2);
        eatables[3].eat();
        System.out.println(mysalon.getProfit());


        System.out.println("----------------------------------------------------");
        eatables[4] = mysalon.orderIceRocet();
        eatables[4].eat();


        System.out.println(mysalon.getProfit());


    }


}
