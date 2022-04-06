package superjeu;

public class Castle extends House{
    public int defense;

    public Castle(int defense) {
        this.defense = defense;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Castle{");
        sb.append("defense=").append(defense);
        sb.append('}');
        return sb.toString();
    }
}
