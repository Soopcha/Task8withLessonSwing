package LogicTask;

public class Mainlogic {
   /* public static void main(String[] args) {
        double[][] arr = new double[2][3]; // первое строки второе столбцы
        arr[0][0] = 1;
        arr[0][1] = 3;
        arr[0][2] = 4;
        arr[1][0] = 2;
        arr[1][1] = 5;
        arr[1][2] = 6;


        System.out.println(checkingForAnOrderedSequence(arr));
        new TastForTask();
    } */

    // 27 Для переданного двумерного массива определить, образуют ли его элементы
    //упорядоченную последовательность при просмотре элементов в следующем порядке:
    public static boolean checkingForAnOrderedSequence(int arr[][]) {
        int r = 0; // r - row индекс строки
        int c = 0; // c - column индекс столбца

        if (arr.length==1){        //проверка на массив из 1 строки
            return false;
        }
        if (arr[0].length ==1 && arr.length>2){  //проверка на массив из 1 столбца и больше 2 строк
            // (2 строки можно сказать нормально, типо выполняется всегда)
            return false;
        }

        double a;
        double b = arr[0][0];
        double difference = arr[0][0] - arr[1][0]; // разность между символами (если она одинаковая, то последовательность упорядочена)

        boolean verticalPalochka = true; // тру если ещё не была использована вертикальная палочка(справа слева там)
        boolean horizontalPalochka = true; // тру если ещё не была использована горизонтальная палочка(сверху снизу там)
        boolean rightUpOrLeftDown = true; // тру если вправо вверх, фолз если влево вниз смотрим наши циферки


        for (; (r <= arr.length-2 && c <= arr[0].length-2); ) {
            //цикл повторяется пока мы перебираем строки и столбцы в пределах нашего массива
            a = b;

            if ((c == 0 || c == arr[0].length-1) && verticalPalochka && horizontalPalochka) {
                r += 1;
                verticalPalochka = false;
                rightUpOrLeftDown = true;    //те как только мы перешли по вертикальной палочке мы идём вправо вверх
            } else if ((r == 0 || r == arr.length-1) && horizontalPalochka && verticalPalochka) {
                c += 1;
                horizontalPalochka = false;
                rightUpOrLeftDown = false;   //те как только мы перешли по горизонтальной палочке мы идём вниз влево
            } else if (rightUpOrLeftDown) {
                r -= 1;
                c += 1;
                horizontalPalochka = true; //те прога готова строить горизонтальную палочку если понадобится
                verticalPalochka = true;

            } else if (!rightUpOrLeftDown) {
                r += 1;
                c -= 1;
                horizontalPalochka = true; //те прога готова строить горизонтальную палочку если понадобится
                verticalPalochka = true;
            }
            b = arr[r][c];
            if ((a - b) != difference) {
                return false;
            }


        }
        return true;
    }
}
