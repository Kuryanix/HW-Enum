package Transport;

public class Bus extends Car implements Competing{

    public enum Capacity {
        CPT_VERY_SMALL("до 10 мест"),
        CPT_SMALL("до 25 мест"),
        CPT_MID("от 40 до 60 мест"),
        CPT_BIG("от 60 до 80 мест"),
        CPT_VERY_BIG("от 100 до 120 мест");

        public String infoCPT;

        Capacity(String infoCPT) {
            this.infoCPT = infoCPT;

        }

        public String getInfoCPT() {
            return infoCPT;
        }

        public void setInfoCPT(String infoCPT) {
            if (infoCPT == null || infoCPT.isEmpty()) {
                this.infoCPT = "Информация не указана";
            } else {
                this.infoCPT = infoCPT;
            }
        }
    }
    public double[] timeOfLap;
    public int bestSpeed;

    public Bus(String brand, String model, double engine, double[]timeOfLap, int bestSpeed, Capacity capacity) {
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
