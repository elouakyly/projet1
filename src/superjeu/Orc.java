package superjeu;

public class Orc extends Humanoid{
    public int rage;

    public Orc(int rage){
        this.rage = rage;
    }
    public int getRage() {
        return rage;
    }
    public void setRage(int rage){
        this.rage = rage;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Orc{");
        sb.append("rage=").append(rage);
        sb.append('}');
        return sb.toString();
    }
}
