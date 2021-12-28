 public class Human{
    public int strength;
    public int stealth;
    public int health;
    public int intellegence;
    public Human(int strength, int stealth,int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.health=health;
        this.intellegence = 100;
    }
    public void regulateTemperature2() {
        System.out.println(this.strength);
    }
    public void regulateTemperature3() {
        System.out.println(this.stealth);
    }
    public void regulateTemperature4() {
        System.out.println(this.health);
    }
    public void regulateTemperature5() {
        System.out.println(this.health);
    }
    public void regulateTemperature() {
        System.out.println(this.intellegence-=this.health);
    }
   
    
}
