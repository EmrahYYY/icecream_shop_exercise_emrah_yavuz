package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;


public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
    private Stock stock;
    private static double profit2;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) throws NoMoreIceCreamException {

        if (stock.getBalls() > 0 && stock.getCones()>0) {

            stock.setBalls(stock.getBalls()-1);
            stock.setCones(stock.getCones()- 1);

            return prepareCone(flavor);
        } else {
            throw new NoMoreIceCreamException(" ");
        }


    }

    private Cone prepareCone(Cone.Flavor[] flavor) {

        profit2 = profit2 + priceList.getBallPrice();



        return new Cone(flavor);
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamException {

        if (stock.getMagni() > 0) {

            stock.setMagni(stock.getMagni() - 1);
        } else {
            throw new NoMoreIceCreamException(" ");
        }


        return prepareMagnum(magnumType);
    }


    private Magnum prepareMagnum(Magnum.MagnumType magnumType) {


        profit2 = profit2 + priceList.getMagnumStandardPrice(magnumType);


        return new Magnum(magnumType);
    }

    @Override
    public IceRocket orderIceRocet() throws NoMoreIceCreamException {

        if (stock.getIceRockets() > 0) {

            stock.setIceRockets(stock.getIceRockets() - 1);
        } else {
            throw new NoMoreIceCreamException(" ");
        }


        return prepareIceRocet();
    }

    private IceRocket prepareIceRocet() {
        profit2 = profit2 + priceList.getRocketPrice();


        return new IceRocket();
    }




    @Override
    public double getProfit() {
        return profit2;
    }
}
