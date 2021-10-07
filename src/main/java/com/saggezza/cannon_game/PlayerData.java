package com.saggezza.cannon_game;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;

public class PlayerData implements IPlayerData {

    public void writeFile(JSONObject obj) {
        ClassLoader loader = getClass().getClassLoader();
        URL resource = loader.getResource("playerData.json");
        try {
            File playerFile = new File(resource.toURI());
            FileWriter writer = new FileWriter(playerFile);
            writer.write(obj.toJSONString()); //json gets converted into text; writing to the file
            writer.close();
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    public JSONObject readFile() {
        ClassLoader loader = getClass().getClassLoader();
        URL resource = loader.getResource("playerData.json");
        JSONObject jsonObj = null;
        try {
            File playerFile = new File(resource.toURI()); //File reader reads the file so you have to pass file object
            JSONParser parser = new JSONParser(); //Parser converts the regular text to Json object
            FileReader reader = new FileReader(playerFile); //Read through the input
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

    public void createPlayer(String name, int bestScore, int worstScore, int gamesPlayed, double aveScore) {
        JSONObject jsonObj = readFile();
        JSONObject newPlayer = new JSONObject();
        newPlayer.put("best_score", bestScore);
        newPlayer.put("worst_score", worstScore);
        newPlayer.put("games_played", gamesPlayed);
        newPlayer.put("average_score", aveScore);
        jsonObj.put(name, newPlayer);
        writeFile(jsonObj);
    }

    public void updatePlayer(String name, int bestScore, int worstScore, int gamesPlayed, double aveScore) {
        JSONObject jsonObj = readFile();
        JSONObject player = (JSONObject) jsonObj.get(name);
        player.put("best_score", bestScore);
        player.put("worst_score", worstScore);
        player.put("games_played", gamesPlayed);
        player.put("average_score", aveScore);
        jsonObj.put(name, player);
        writeFile(jsonObj);
    }
}
