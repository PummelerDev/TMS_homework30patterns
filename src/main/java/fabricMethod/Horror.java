package fabricMethod;

public class Horror implements IGameType{
    @Override
    public String getType() {
        return "Horror";
    }

    @Override
    public String getFamousReprsentative() {
        return "Penumbra, Amnesia";
    }
}
