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
import net.sf.json.JSONObject;
import org.apache.commons.logging.*;

public class Logging {
    public static void main (String []args){
        Log logger = LogFactory.getLog(Logging.class);

        JSONObject album = new JSONObject();
        logger.info("Creation d'un nouvel album vide");
        String titre = "Toto";
        album.put("title", titre);
        logger.warn("Ajout d'un title: " + titre);

        System.out.println(album);
    }
}