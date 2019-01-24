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

import javax.print.DocFlavor;

public class Main {
    public static void main (String []args) {
        int x = 10;
        int y = 5;
        int s;

        System.out.println("Before:\nx = " + x + "\ny = " + y);

        s = x;
        x = y;
        y = s;

        System.out.println("After:\nx = " + x + "\ny = " + y);


        System.out.println("Before:\nx = " + x + "\ny = " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After:\nx = " + x + "\ny = " + y);

        System.out.println("\nAffichage des livres\n");
        Reader.afficherLivres();
    }
}
