public class Numbers {

    private int a;
    private int b;
    private int c;
    private int d;
    private int max;
    private int i = 0;
    private String str;
    private String timeSeason;

    public void min (int a, int b, int c, int d) {
        if (a > b) {
            if (b > c) {
                if (c > d) {
                    System.out.println(d);
                }
                else {
                    System.out.println(c);
                }
            }
            else if (b > d) {
                System.out.println(d);
            }
            else {
                System.out.println(b);
            }
        }

        else if (a > c) {
            if (c > d) {
                System.out.println(d);
            }
            else {
                System.out.println(c);
            }
        }

        else {
            if (a > d) {
                System.out.println(d);
            }
            else {
                System.out.println(a);
            }
        }
    }

    public int countMax (int a, int b, int c, int d) {
        if (a < b) {
            if (b < c) {
                if (c < d) max = d;
                else max = c;
            }
            else {
                if (b < d) max = d;
                else max = b;
            }
        }
        else if (a < c){
                if (c < d) max = d;
                else max = c;
        }
        else {
                if (a < d) max = d;
                else max = a;
        }

        if (a == max) i++;
        if (b == max) i++;
        if (c == max) i++;
        if (d == max) i++;

        return i;

    }

    public String name(String onename, String twoname) {
         if (onename == twoname) str = "This is people tezki!";
         return str;
    }

    public String season (int numberOfSeason) {

        switch (numberOfSeason){
            case 1:  timeSeason = "Зима";
                     break;
            case 2:  timeSeason = "Весна";
                     break;
            case 3:  timeSeason = "Лето";
                     break;
            case 4:  timeSeason = "Осень";
                     break;
            default: timeSeason = "Такого сезона не существует!";
        }
        return timeSeason;
    }

    public void workWithArray(){

        int [] myFirstArray = {1,3,5,7,9,11,13,15,17,19};

        for (int i = 0; i<myFirstArray.length; i++) {
            if(i == (myFirstArray.length-1)) System.out.print(myFirstArray[i]);
            else System.out.print(myFirstArray[i] + ", ");
            }
    }

    /******
     *
     * @param n size of array
     * @param a bigin number of random
     * @param b end number of random
     */
    public void workWithMin(int n, int a, int b){

        int [] randomArray = new int [n];

        System.out.print("Массив: ");

        for (int i=0;i<n;i++){
            randomArray [i] = a + (int) (Math.random()*b);
            System.out.print(randomArray [i] + " ");
        }

        System.out.print("\n");

        int min = randomArray [0];
        int max = randomArray [0];

        for (int i=0;i<n;i++){
            if( min > randomArray [i]) min = randomArray [i];
        }

        for (int i=0;i<n;i++){
            if( max < randomArray [i]) max = randomArray [i];
        }

        System.out.println("Минимальные элементы: ");

        for (int i=0;i<n;i++){
            if( min == randomArray [i]) System.out.print(randomArray [i] + " ");
        }
        System.out.print("\n");

        System.out.println("Максимальные элементы: ");

        for (int i=0;i<n;i++){
            if( max == randomArray [i]) System.out.print(randomArray [i] + " ");
        }
        System.out.print("\n");

        int avg = 0;

        for (int i=0;i<n;i++){
            avg = avg + randomArray [i];
        }

        avg = avg/randomArray.length;

        System.out.println("Среднее значение: " + avg);
    }

    public void changeElement(){
        int [] newArray = {4,-5,0,6,8};

        int min = 0;
        int max = 0;
        int k = 0, m = 0;

        for(int i = 0; i < newArray.length; i++) {
            if( min > newArray [i]) {
                min = newArray[i];
                k = i;

            }
            if( max < newArray [i]) {
                max = newArray[i];
                m = i;
            }
        }
        //минимальный -> максимальный
        newArray[k] = max;
        //максимальный -> минимальный
        newArray[m] = min;

        for(int i = 0; i < newArray.length; i++) {
            System.out.print(newArray [i] + " ");
        }
    }

}
