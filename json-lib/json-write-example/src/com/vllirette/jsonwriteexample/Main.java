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
package com.vllirette.jsonwriteexample;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        String type = "", artist = "", title = "";
        int publication = 0, rating = 0;

        JSONArray collection = new JSONArray();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            JSONObject item = new JSONObject();

            System.out.print("Enter type: ");
            type = scanner.nextLine();
            item.put("type", type);

            System.out.print("Enter artist: ");
            artist = scanner.nextLine();
            item.put("artist", artist);

            System.out.print("Enter title: ");
            title = scanner.nextLine();
            item.put("title", title);

            System.out.print("Enter publication year: ");
            publication = scanner.nextInt();
            item.put("publication", publication);

            System.out.print("Enter rating: ");
            rating = scanner.nextInt();
            item.put("rating", rating);

            collection.add(item);

            scanner.nextLine();
        }

        scanner.close();

        saveAsIndentedJsonFile(collection);
    }

    //source: https://github.com/jacquesberger/JSONParsingExample/blob/master/src/main/java/org/jberger/jsonparsingexample/json/JSON.java#L46
    private static void saveAsIndentedJsonFile (JSONArray outputList) throws IOException {
        Utf8File.saveStringIntoFile("data/output-pretty.json", outputList.toString(2));
    }
}
