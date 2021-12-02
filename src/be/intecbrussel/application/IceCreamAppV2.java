package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        Stock stock = new Stock(1, 1, 2, 1);
        PriceList priceList = new PriceList(5, 3, 4);
        Eatable[] eatables = new Eatable[6];
        IceCreamSeller mycar = new IceCreamCar(priceList, stock);


        try {
            System.out.println("remaining Magnum stock: " + stock.getMagni());
            eatables[0] = mycar.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
            eatables[0].eat();
            System.out.println(mycar.getProfit());

            System.out.println("-----------------------------------------------------");

            System.out.println("remaining Magnum stock: " + stock.getMagni());
            eatables[1] = mycar.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);
            eatables[1].eat();
            System.out.println(mycar.getProfit());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(mycar.getProfit());


        System.out.println("******************************************************************");


        try {
            System.out.println("remaining IceRockets stock: " + stock.getIceRockets());
            eatables[2] = mycar.orderIceRocet();
            eatables[2].eat();
            System.out.println(mycar.getProfit());

            System.out.println("-----------------------------------------------------");

            System.out.println("remaining IceRockets stock: " + stock.getIceRockets());
            eatables[3] = mycar.orderIceRocet();
            eatables[3].eat();
            System.out.println(mycar.getProfit());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(mycar.getProfit());

        System.out.println("******************************************************************");

        try {
            System.out.print("remaining Balls stock: " + stock.getBalls() + ", remaining Cone stock: " + stock.getCones());
            System.out.println(" (You can't buy Balls without a Cone and vice versa)");
            Cone.Flavor[] flavor = {Cone.Flavor.BANANA};
            eatables[4] = mycar.orderCone(flavor);
            eatables[4].eat();
            System.out.println(mycar.getProfit());

            System.out.println("-------------------------------------------------------");
            System.out.print("remaining Balls stock: " + stock.getBalls() + ", remaining Cone stock: " + stock.getCones());
            System.out.println(" (You can't buy Balls without a Cone and vice versa)");
            Cone.Flavor[] flavor2 = {Cone.Flavor.STRACIATELLA};
            eatables[5] = mycar.orderCone(flavor2);
            eatables[5].eat();
            System.out.println(mycar.getProfit());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(mycar.getProfit());


    }

}
