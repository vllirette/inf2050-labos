/*
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

public class Main {
    public static void main (String []args) {
        Monnaie m1 = new Monnaie(10);
        Monnaie m2 = new Monnaie(2);

        System.out.println("toChaineChar: " + m1.toChaineChar());

        System.out.println("getMontant: " + m2.getMontant());

        Monnaie m3 = Monnaie.additionnerMonnaie(m1, m2);
        System.out.println("additionnerMonnaie: " + m3.toChaineChar());

        System.out.println("calculerPourcentage: " + m1.calculerPourcentage(0.1));

        System.out.println("soustraireMontant: " + m2.soustraireMontant(1));
    }
}
