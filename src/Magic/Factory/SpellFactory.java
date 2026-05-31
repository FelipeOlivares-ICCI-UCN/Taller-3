package Magic.Factory;

import Magic.Spells.*;

public class SpellFactory {

    public static Spell getSpell(String[] data)
    {
        if ("fuego".equalsIgnoreCase(data[0])) return new FireSpell(data);
        else if ("tierra".equalsIgnoreCase(data[0])) return new EarthSpell(data);
        else if ("agua".equalsIgnoreCase(data[0])) return new WaterSpell(data);
        else if ("planta".equalsIgnoreCase(data[0])) return new PlantSpell(data);
        else throw new IllegalArgumentException("Unknown Spell type: " + data[0]);
    }


}
