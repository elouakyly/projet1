package superjeu;

public class Human extends Humanoid{
    public int mana;
    public Human(int mana) {
        this.mana = mana;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana){
        this.mana = mana;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Human{");
        sb.append("mana=").append(mana);
        sb.append('}');
        return sb.toString();
    }
}
