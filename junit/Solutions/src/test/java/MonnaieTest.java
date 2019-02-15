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

import org.junit.Test;
import static org.junit.Assert.*;

public class MonnaieTest {
    @Test
    public void testToChaineChar() {
        Monnaie m1 = new Monnaie(10);

        assertEquals("10", m1.toChaineChar());
    }

    @Test
    public void testGetMontant() {
        Monnaie m1 = new Monnaie(10);
        long expected = 10;
        assertEquals(expected, m1.getMontant());
    }

    @Test
    public void testAdditionnerMonnaie() {
        Monnaie m1 = new Monnaie(10);
        Monnaie m2 = new Monnaie(2);
        Monnaie mAssert = new Monnaie(12);

        assertEquals(mAssert, Monnaie.additionnerMonnaie(m1, m2));
    }

    @Test
    public void testCalculerPourcentage() {
        Monnaie m1 = new Monnaie(10);
        double pourcentage = 0.1;

        //System.out.println(5.1 + 0.1);
        assertEquals(1.0, m1.calculerPourcentage(pourcentage), 0.1);
    }

    @Test
    public void testSoustraireMontant() {
        Monnaie m1 = new Monnaie(10);
        Monnaie mAssert = new Monnaie(5);
        long montant = 5;

        assertEquals(mAssert, m1.soustraireMontant(montant));
    }
}
