package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;


public class IceCreamSalon implements IceCreamSeller {
    private PriceList priceList;
    private static double profit1;


    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }


    public IceCreamSalon() {

        priceList = new PriceList();


    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) {


        profit1 = profit1 + priceList.getBallPrice();


        return new Cone(flavor);
    }


    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {


        profit1 = profit1 + priceList.getMagnumStandardPrice(magnumType);

        return new Magnum(magnumType);
    }


    @Override
    public IceRocket orderIceRocet() {

        profit1 = profit1 + priceList.getRocketPrice();

        return new IceRocket();
    }


    @Override
    public double getProfit() {
        System.out.println("total profit : ");

        return profit1;


    }


}








