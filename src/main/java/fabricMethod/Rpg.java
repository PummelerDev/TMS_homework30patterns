package fabricMethod;

public class Rpg implements IGameType{
    @Override
    public String getType() {
        return "RPG";
    }

    @Override
    public String getFamousReprsentative() {
        return "The Witcher, Horizon";
    }
}
