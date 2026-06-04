package Magic.Factory;

import Magic.Spells.*;

public class SpellFactory {

    public static Spell getSpell(String[] data)
    {
        if ("fuego".equalsIgnoreCase(data[1])) return new FireSpell(data);
        else if ("tierra".equalsIgnoreCase(data[1])) return new EarthSpell(data);
        else if ("agua".equalsIgnoreCase(data[1])) return new WaterSpell(data);
        else if ("planta".equalsIgnoreCase(data[1])) return new PlantSpell(data);
        else throw new IllegalArgumentException("Unknown Spell type: " + data[1]);
    }


}
