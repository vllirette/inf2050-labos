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

public final class Monnaie {
    private long montant;

    public Monnaie(){

    }

    public Monnaie(long montant) {
        this.montant = montant;
    }

    public long getMontant(){
        return this.montant;
    }

    public static Monnaie additionnerMonnaie(Monnaie m1, Monnaie m2) {
        long montant1, montant2, total;
        montant1 = m1.getMontant();
        montant2 = m2.getMontant();
        total = montant1 + montant2;
        return new Monnaie(total);
    }

    public double calculerPourcentage(double pourcentage) {
        return pourcentage * this.getMontant();
    }

    public String toChaineChar() {
        return Long.toString(this.getMontant());
    }

    public Monnaie soustraireMontant(long montant) {
        return new Monnaie(this.getMontant() - montant);
    }

    @Override
    public String toString() {
        return "Monnaie{" + "montant=" + this.montant + '}';
        //return Long.toString(this.montant);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Monnaie monnaie = (Monnaie) o;
        return this.getMontant() == monnaie.getMontant();
    }
}
