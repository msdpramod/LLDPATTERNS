package Creational.Prototype.AfterProtype;

public class EASportsCharacter {
    private String jerseyColor;
    private String teamName;
    private String sportsName;
    private String hairStyle;

    public EASportsCharacter(String jerseyColor, String teamName, String sportsName, String hairStyle) {
        this.jerseyColor = jerseyColor;
        this.teamName = teamName;
        this.sportsName = sportsName;
        this.hairStyle = hairStyle;
    }

    public EASportsCharacter clone() {
        return new EASportsCharacter(this.jerseyColor, this.teamName, this.sportsName, this.hairStyle);
    }

    @Override
    public String toString() {
        return "EASportsCharacter{" +
                "jerseyColor='" + jerseyColor + '\'' +
                ", teamName='" + teamName + '\'' +
                ", sportsName='" + sportsName + '\'' +
                ", hairStyle='" + hairStyle + '\'' +
                '}';
    }
}
