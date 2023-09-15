public class TasteTester {

    public static void main(String[] args) {
        Cake cake = new Cake("strawberry");
        cake.setPrice(50);

        BirthdayCake birthdayCake = new BirthdayCake("tres leches");
        birthdayCake.setPrice(75);

        WeddingCake weddingcake = new WeddingCake("caramel");
        weddingcake.setPrice(300);

        System.out.println("The cake flavor is " + cake.getFlavor());
        System.out.println("The cake price is "+ cake.getPrice());

        System.out.println("The Birthday cake flavor is "+ birthdayCake.getFlavor());
        System.out.println("The Birthday cake price is " +birthdayCake.getPrice());

        System.out.println("The Wedding cake flavor is " + weddingcake.getFlavor());
        System.out.println("The wedding cake price is "+ weddingcake.getPrice());









    }
}
