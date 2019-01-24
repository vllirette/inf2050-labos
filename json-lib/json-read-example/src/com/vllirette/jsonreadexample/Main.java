/**
 * Copyright 2019 Vincent Lafrenaye-Lirette
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vllirette.jsonreadexample;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        JSONArray collection = getCollectionAsJsonArray();

        System.out.println("Nombre d'albums = " + countAlbums(collection));

        System.out.println("\nNombre de singles = " + countSingles(collection));

        System.out.println("\nAlbums publies depuis 2003\n" + listeAlbum2003(collection).toString(1));

        System.out.println("\nAlbums avec la cote de 5\n" + listAlbumCoteCinq(collection).toString(1));
    }

    private static JSONArray getCollectionAsJsonArray() throws IOException {
        String jsonTxt = Utf8File.loadFileIntoString("data/collection.json");
        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        JSONArray collection = root.getJSONArray("collection");

        return collection;
    }

    private static int countAlbums(JSONArray collection) {
        int nbAlbums = 0;
        for (int i = 0; i < collection.size(); i++) {
            JSONObject item = collection.getJSONObject(i);
            if (item.get("type").toString().equalsIgnoreCase("album")) {
                nbAlbums++;
            }
        }

        return nbAlbums;
    }

    private static int countSingles(JSONArray collection) {
        int nbSingle = 0;
        for (Object o : collection) {
            JSONObject item = (JSONObject) o;
            if (item.get("type").toString().equalsIgnoreCase("single")) {
                nbSingle++;
            }
        }

        return nbSingle;
    }

    private static JSONArray listeAlbum2003(JSONArray collection) {
        JSONArray liste = new JSONArray();

        collection.forEach(i -> {
            JSONObject item = (JSONObject) i;
            if ((int) item.get("publication") >= 2003) {
                liste.add(item);
            }
        });

        return liste;
    }

    private static JSONArray listAlbumCoteCinq(JSONArray collection) {
        JSONArray liste = new JSONArray();

        for (Iterator<JSONObject> iter = collection.iterator(); iter.hasNext(); ) {
            JSONObject item = iter.next();
            if ((int) item.get("rating") == 5) {
                liste.add(item);
            }
        }

        return liste;
    }
}
