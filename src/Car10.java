public class Car10 {
    int age = 0;
    int power = 68;
    int turbo = 20;

    int getAge(){
        return age;
    }

    int calculateIndex() {
        return power * 10 + turbo;
    }

    int upgradePower(int newPower) {
        power = power + newPower;
        return power;
    }
}
