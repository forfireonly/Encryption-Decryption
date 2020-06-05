
class TestDrive {
    public static final String CHINESE_BURGER = "Chinese Burger";
    public static final String AMERICAN_BURGER = "American Burger";
    public static final String RUSSIAN_BURGER = "Russian Burger";
    public static void main(String[] args) throws InterruptedException {
        /* write your code here */
        BurgerStore myBurger = new BurgerStore();
        String[] burgers = {CHINESE_BURGER, AMERICAN_BURGER, RUSSIAN_BURGER};
        for (String each : burgers) {
            myBurger.orderBurger(each);
        }
    }
}

abstract class BurgerFactory {

    abstract Burger createBurger(String type);

    Burger orderBurger(String type) throws InterruptedException {
        Burger burger = createBurger(type);
        if (burger == null) {
            System.out.println("Sorry, we are not able to create this kind of burger\n");
            return null;
        }
        System.out.println("Making a " + burger.getName());
        burger.putBun(); /* write your code here */
        burger.putCutlet(); /* write your code here */
        burger.putSauce(); /* write your code here */
        Thread.sleep(1500L);
        System.out.println("Done a " + burger.getName() + "\n");
        return burger;
    }
}

class BurgerStore extends BurgerFactory {
    @Override
    Burger createBurger(String type) {
        switch (type) {
            case "Chinese Burger":
                /* write your code here */
                return new ChineseBurger("Chinese Burger");
            case  "American Burger":
                /* write your code here */
                return new AmericanBurger("American Burger");
            case "Russian Burger":
                /* write your code here */
                return new RussianBurger("Russian Burger");
            default:
                return null;
        }
    }
}

abstract class Burger {
    private String name;

    Burger(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void putBun() {
        System.out.println("Putting bun");
    }

    void putCutlet() {
        System.out.println("Putting cutlet");
    }

    void putSauce() {
        System.out.println("Putting sauce");
    }

}

class ChineseBurger extends Burger {
    ChineseBurger(String name) {
        super(name);
    }
    /* write your code here */
}

class AmericanBurger extends Burger {
    AmericanBurger(String name) {
        super(name);
    }
    /* write your code here */
}

class RussianBurger extends Burger {
    RussianBurger(String name) {
        super(name);
    }
    /* write your code here */
}