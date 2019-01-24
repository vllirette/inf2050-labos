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

package com.vllirette.livres;

import java.io.*;

public class Reader {

    public static void afficherLivres() {
        try {
            lireEtAfficherFichier();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lireEtAfficherFichier() throws IOException {

        String nomFichierEntree = "data/livres.txt";
        String ligne;
        boolean fini = false;

        FileReader fr = new FileReader(nomFichierEntree);
        BufferedReader lunette = new BufferedReader(fr);

        while (!fini) {
            ligne = lunette.readLine();
            fini = (ligne == null);
            if (!fini) {
                ligne.trim();
                System.out.println(ligne);
            }
        }

        lunette.close();
    }
}
