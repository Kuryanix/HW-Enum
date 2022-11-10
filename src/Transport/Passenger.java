package Transport;

public class Passenger extends Car implements Competing{

    public enum Carcase{
        CRC_SEDAN ("Седан"),
        CRC_HATCHBACK("Хетчбек"),
        CRC_COUPE("Купе"),
        CRC_UNIVERSAL("Универсал"),
        CRC_SUV("Внедорожник"),
        CRC_CROSSOVER("Кроссовер"),
        CRC_PICKUP("Пика"),
        CRC_VAN("Фургон"),
        CRC_MINIVAN("Минивэн");

        public final String typeCarcase;

        public static Carcase findCarcase(String typeCarcase) {
            for (Carcase carcase : values()) {
                if (carcase.getTypeCarcase().equals(typeCarcase)) {
                    return carcase;
                }
            }
            return null;
        }

        Carcase(String typeCarcase) {
            this.typeCarcase = typeCarcase;
        }


        public String getTypeCarcase() {
            return typeCarcase;

        }
    }

    public double[] timeOfLap;
    public int bestSpeed;

    public Passenger(String brand, String model, double engine,double[]timeOfLap,int bestSpeed,Carcase carcase) {
        super(brand, model, engine);
        this.timeOfLap = timeOfLap;
        if (bestSpeed <= 0) {
            this.bestSpeed = bestSpeed;
        } else {
            this.bestSpeed = bestSpeed;
        }
    }

    public double[] getTimeOfLap() {
            return timeOfLap;
    }

    public int getBestSpeed() {
            return bestSpeed;
        }

    @Override
    public void pitStop() {
        System.out.println("Отправиться на пит-стоп");
    }

    @Override
    public void bestTimeOfLap() {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < timeOfLap.length; i++) {
            if (timeOfLap[i] < min) {
                min = timeOfLap[i];
            }
        }
        System.out.println("Лучшее время круга составило: " + min);
    }

        @Override
        public void maxSpeed () {
            System.out.println("Максимальная скорость составила: " + bestSpeed);
        }

    @Override
    public void checkType(String carcase) {
        Carcase carcase1 = Carcase.valueOf(carcase);
        if (carcase1 == null) {
            carcase1 = Carcase.findCarcase(carcase);
        }

        switch (carcase1) {
            case CRC_SEDAN:
                System.out.println("Тип кузова: " + Carcase.CRC_SEDAN.name());
                break;
            case CRC_COUPE:
                System.out.println("Тип кузова: " + Carcase.CRC_COUPE.name());
                break;
            case CRC_CROSSOVER:
                System.out.println("Тип кузова: " + Carcase.CRC_CROSSOVER.name());
                break;
            case CRC_HATCHBACK:
                System.out.println("Тип кузова: " + Carcase.CRC_HATCHBACK.name());
                break;
            case CRC_SUV:
                System.out.println("Тип кузова: " + Carcase.CRC_SUV.name());
                break;
            case CRC_VAN:
                System.out.println("Тип кузова: " + Carcase.CRC_VAN.name());
                break;
            case CRC_PICKUP:
                System.out.println("Тип кузова: " + Carcase.CRC_PICKUP.name());
                break;
            case CRC_MINIVAN:
                System.out.println("Тип кузова: " + Carcase.CRC_MINIVAN.name());
                break;
            case CRC_UNIVERSAL:
                System.out.println("Тип кузова: " + Carcase.CRC_UNIVERSAL.name());
                break;
            default:
                System.out.println("Данных по авто недостаточно");
        }

    }

    }
