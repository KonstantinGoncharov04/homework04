//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // zadanie 1
    int age = 18;
    if (age >= 18) {
        System.out.println(" человеку " + age + " или больше лет он совершеннолетний ");
    } else {
        System.out.println(" человеку " + age + " или больше лет он не достиг совершеннолетия, нужно немного подождать ");
    }


    // zadanie 2
    int temper = 5;
    if (temper >= 5) {
        System.out.println(" На улице холодно, нужно надеть шапку ");
    } else {
        System.out.println(" Сегодня тепло, можно идти без шапки ");
    }


    // zadanie 3
    int scorost = 60;
    if (scorost >= 60) {
        System.out.println(" Если скорость " + scorost + ", то придется заплатить штраф ");
    } else {
        System.out.println(" Если скорость " + scorost + ",можно ездить спокойно ");
    }


    // zadanie 4
    int cchayld = 19;
    if (cchayld >= 2 && cchayld <= 6) {
        System.out.println(" Если возраст человека равен " + cchayld + ",то ему нужно ходить в детский сад ");
    } else if (cchayld >= 7 && cchayld <= 17) {
        System.out.println(" Если возраст человека равен " + cchayld + ",то ему нужно ходить в школу ");
    } else if (cchayld >= 18 && cchayld <= 24) {
        System.out.println(" Если возраст человека равен " + cchayld + ",то ему нужно ходить в университет ");
    } else if (cchayld >= 24) {
        System.out.println(" Если возраст человека равен " + cchayld + ",то ему нужно ходить на работу ");
    } else {
        System.out.println("Если возраст человека равен " + cchayld + ", то он еще слишком мал для сада.");
    }

    // zadanie 5
    int Atraction = 16;
    if (Atraction <= 5) {
        System.out.println("Если возраст ребенка равен " + Atraction + ",то ему нельзя кататься на аттракционе ");
    } else if (Atraction > 5 && Atraction <= 14) {
        System.out.println(" Если возраст человека равен " + Atraction + ",можно кататься на аттракционе в сопровождении ");
    } else if (Atraction >= 14) {
        System.out.println(" Если возраст человека равен " + Atraction + ",то ему нужно ходить без сопровождения взрослого ");
    }

    // zadanie 6
            int occupiedSeats = 65;

            if (occupiedSeats < 60) {
                System.out.println("В вагоне есть свободные сидячие места.");
            } else if (occupiedSeats < 102) {
                System.out.println("Сидячих мест нет, но есть стоячие места.");
            } else {
                System.out.println("Вагон уже полностью забит, мест нет!");
            }
    // zadanie 7
    int one = 15;
    int two = 42;
    int three = 23;

    if (one >= two && one >= three) {
        System.out.println("Наибольшее число: " + one);
    } else if (two >= one && two >= three) {
        System.out.println("Наибольшее число: " + two);
    } else {
        System.out.println("Наибольшее число: " + three);
    }
        }



