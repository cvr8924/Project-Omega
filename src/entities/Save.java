package entities;


import com.google.gson.*;
import org.json.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class Save {

    public void save(String filename, Kor kor, Lyr lyr, Ime ime) throws IOException {
        Gson gson = new Gson();
        Writer writer = new FileWriter(filename);

        Map<String, Object> map = new HashMap<>();


        // char data saver
        String[] characters = {"kor","lyr","ima"};
        Character character;
        for (String characterName: characters) {
            if (characterName == "kor") {
                character = kor;
            } else if (characterName == "lyr") {
                character = lyr;
            } else {
                character = ime;
            }

            map.put(characterName + "_HP", character.getHp());
            map.put(characterName + "_Mana", character.getMana());
            map.put(characterName + "_Current_HP", character.getCurrentHp());
            map.put(characterName + "_Current_Mana", character.getCurrentMana());
            map.put(characterName + "_STR", character.getStr());
            map.put(characterName + "_SPD", character.getSpeed());
            map.put(characterName + "_WIS", character.getWis());
            map.put(characterName + "_DEF", character.getDef());
            map.put(characterName + "_LVL", character.getLevel());
            map.put(characterName + "_ITMS", character.getEquipedItems());
            map.put(characterName + "_ABLS", character.getAbilities());
        }


        gson.toJson(map,writer);

        writer.close();
    }

        /*
    public void characterStatWrapper(Kor kor, Lyr lyr, Ime ime){

    }
    */


    public void load(String filename){


    }

}
