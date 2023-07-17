//Написати enum для планет сонячної системи.
//Об'єкт повинен містити такі дані:
//- порядковий номер від сонця (Залежить від послідовності об’явлення)
//- віддаленість від попередньої планети (для меркурія 0)
//- віддаленість від сонця
//- радіус
//- попередня планета
//- наступна планета
//
//Конструктор має бути вигляду SolarSystem(int prevDistance, int radius, SolarSystem previous)
//Відстань від сонця та інші поля обчислюються в конструкторі.
//Точність даних не є важливою, допускається застосування невеликих чисел.
//////////////////////////////////////////////////////////////////////////////

package org.example;

public enum SolarSystem {
    MERCURY (0, 2),
    VENUS   (4, 7, SolarSystem.MERCURY),
    EARTH   (5, 6, SolarSystem.VENUS),
    MARS    (6, 3, SolarSystem.EARTH),
    JUPITER (1, 7, SolarSystem.MARS),
    SATURN  (5, 6, SolarSystem.JUPITER),
    URANUS  (8, 2, SolarSystem.SATURN),
    NEPTUNE (2, 2, SolarSystem.URANUS),
    PLUTO   (3, 1, SolarSystem.NEPTUNE);

    public final int positionNumber;
    public final int prevDistance;
    public final int sunDistance;
    public final int radius;
    public SolarSystem previous;
    public SolarSystem next;

    SolarSystem (int prevDistance, int radius) {
        this (prevDistance, radius, null);
    }

    SolarSystem (int prevDistance, int radius, SolarSystem previous) {
        final int mercuryDistanceToSun = 10;
        this.prevDistance = prevDistance;
        this.radius = radius;
        this.positionNumber = this.ordinal() + 1;

        if (previous == null) {
            this.next = null;
            this.sunDistance = this.prevDistance + mercuryDistanceToSun;
        } else {
            previous.next = this;
            this.previous = previous;
            this.sunDistance = this.prevDistance + previous.sunDistance;
        }
    }
}
