package com.saggezza.cannon_game;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class PlayerData implements IPlayerData {

    public JSONObject readFile() {
        // Open playerData file
        ClassLoader loader = getClass().getClassLoader();
        URL resource = loader.getResource("playerData.json");
        JSONObject jsonObj = null;
        try {
            File playerFile = new File(resource.toURI());
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(playerFile);
            Object obj = parser.parse(reader);
            jsonObj = (JSONObject) obj;
            reader.close();
        } catch(URISyntaxException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(ParseException e) {
            e.printStackTrace();
        }
        return jsonObj;
    }

    public boolean playerExists(String name) {
        JSONObject jsonObj = readFile();
        return jsonObj.get(name) != null;
    }

    public int getPlayerBestScore(String name) {
        JSONObject jsonObj = readFile();
        JSONObject playerObj = (JSONObject) jsonObj.get(name);
        Long scoreLong = (Long) playerObj.get("best_score");
        int bestScore = scoreLong.intValue();
        return bestScore;
    }

    public int getPlayerWorstScore(String name) {
        JSONObject jsonObj = readFile();
        JSONObject playerObj = (JSONObject) jsonObj.get(name);
        Long scoreLong =  (Long) playerObj.get("worst_score");
        int worstScore = scoreLong.intValue();
        return worstScore;
    }

    public double getPlayerAverageScore(String name) {
        JSONObject jsonObj = readFile();
        JSONObject playerObj = (JSONObject) jsonObj.get(name);
        return (double) playerObj.get("average_score");
    }

    public int getPlayerGamesPlayed(String name) {
        JSONObject jsonObj = readFile();
        JSONObject playerObj = (JSONObject) jsonObj.get(name);
        Long playedLong =  (Long) playerObj.get("games_played");
        int played = playedLong.intValue();
        return played;
    }
}
