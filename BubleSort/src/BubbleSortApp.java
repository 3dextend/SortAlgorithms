/**
 * BubbleSort
 * Created by Ryabenkiy Sergey on 26.06.2015 0:12.
 */
public class BubbleSortApp {

        public static void main(String[] args) {
            int maxSize = 50; // Размер массива
            ArrayBub arr; // Ссылка на массив
            arr = new ArrayBub(maxSize); // Создание массива
            for(int j=0; j<maxSize; j++) // Заполнение массива
            { // случайными числами
                long n = (long)( java.lang.Math.random()*(maxSize-1) );
                arr.insert(n);
            }
            /*arr.insert(77); // Вставка 10 элементов
            arr.insert(99);
            arr.insert(44);
            arr.insert(55);
            arr.insert(22);
            arr.insert(-120);
            arr.insert(11);
            arr.insert(0);
            arr.insert(66);
            arr.insert(-2);
            arr.insert(-7);
            arr.insert(-20);
            arr.insert(88);*/
            arr.display(); // Вывод элементов
            arr.bubbleSort(); // Пузырьковая сортировка элементов
            arr.display(); // Повторный вывод
        } //
} // Конец класса BubbleSortAppg



