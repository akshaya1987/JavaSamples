package samples;

public class JavaPractice {
    public static void main(String[] args) {
        SmartPhone[] phones = new SmartPhone[] {
                new Iphone(), new Nokia(), new OnePlus(), new Samsung()
        };

        takeSnaps(phones);

    }
    public static void takeSnaps(SmartPhone[] smartPhones)
    {
        for (SmartPhone smartPhone : smartPhones) {
            smartPhone.takeSnaps();

        }
    }
}

