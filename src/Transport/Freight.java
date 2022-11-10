package Transport;

public class Freight extends Car implements Competing{

    public enum LoadCapacity {
        LC_N1("с полной массой до 3,5 тонн"),
        LC_N2("с полной массой свыше 3,5 до 12 тонн"),
        LC_N3("с полной массой свыше 12 тонн");

        public String infoLC;

        LoadCapacity(String infoLC) {
            this.infoLC = infoLC;
        }

        public String getInfoLC() {
            return infoLC;
        }

        public void setInfoLC(String infoLC) {
            if (infoLC == null || infoLC.isEmpty()) {
                this.infoLC = "Информация не указана";
            } else {
                this.infoLC = infoLC;
            }
        }
    }
    public double[] timeOfLap;
    public int bestSpeed;

    public Freight(String brand, String model, double engine, double[]timeOfLap,int bestSpeed, LoadCapacity loadCapacity) {
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
}
