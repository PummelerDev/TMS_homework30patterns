package fabricMethod;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

    IGameType iGameType = getGame("RPG");
        System.out.println(iGameType.getType());
        System.out.println(iGameType.getFamousReprsentative());

    }
    private static IGameType getGame(String type) throws ClassNotFoundException {
        switch (type){
            case "RPG": return new Rpg();
            case "Action": return new Action();
            case "Horror": return new Horror();
            default: throw new ClassNotFoundException();
        }
    }


}
